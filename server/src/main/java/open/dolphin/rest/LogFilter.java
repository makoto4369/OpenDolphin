package open.dolphin.rest;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import open.dolphin.mbean.UserCache;
import open.dolphin.session.UserServiceBean;

/**
 *
 * @author Kazushi Minagawa, Digital Globe, Inc.
 */
@WebFilter(urlPatterns = {"/resources/*"}, asyncSupported = true)
public class LogFilter implements Filter {

    private static final String USER_NAME = "userName";
    private static final String PASSWORD = "password";
    private static final String UNAUTHORIZED_USER = "Unauthorized user: ";

    /*private static final String TEST_USER_ID = "1.3.6.1.4.1.9414.2.100:ehrTouch";
    private static final String TEST_PASSWORD = "098f6bcd4621d373cade4e832627b4f6";*/
    
    private static final String TEST_USER_ID = "1.3.6.1.4.1.9414.2.100:dolphin";    // K.Funabashi
    private static final String TEST_PASSWORD = "098f6bcd4621d373cade4e832627b4f6";
    
    private static final String SYSAD_USER_ID = "1.3.6.1.4.1.9414.2.1:cloudia";
    private static final String SYSAD_PASSWORD = "2cf069043321eeb1b146323ab3d7b819";
    private static final String SYSAD_PATH = "hiuchi";

    @Inject
    private UserServiceBean userService;
    
    @Inject
    private UserCache userCache;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest)request;

        String userName = req.getHeader(USER_NAME);
        String password = req.getHeader(PASSWORD);
        //System.err.println(userName);
        //System.err.println(password);
        
        Map<String, String> userMap = userCache.getMap();
        boolean authentication = password.equals(userMap.get(userName));
        
        if (!authentication) {
            
            String requestURI = req.getRequestURI();
            authentication = (userName.equals(TEST_USER_ID) && password.equals(TEST_PASSWORD));
            authentication = authentication || (userName.equals(SYSAD_USER_ID) && password.equals(SYSAD_PASSWORD) && requestURI.endsWith(SYSAD_PATH));
            
            if (!authentication) {
                authentication = userService.authenticate(userName, password);
                if (!authentication) {
                    HttpServletResponse res = (HttpServletResponse)response;
                    StringBuilder sbd = new StringBuilder();
                    sbd.append(UNAUTHORIZED_USER);
                    sbd.append(userName).append(": ").append(req.getRequestURI());
                    String msg = sbd.toString();
                    Logger.getLogger("open.dolphin").warning(msg);
                    res.sendError(401);
                    return;
                } else {
                    userMap.put(userName, password);
                }
            }
        } 

        BlockWrapper wrapper = new BlockWrapper(req);
        wrapper.setRemoteUser(userName);

        StringBuilder sb = new StringBuilder();
        sb.append(wrapper.getRemoteAddr()).append(" ");
        sb.append(wrapper.getShortUser()).append(" ");
        sb.append(wrapper.getMethod()).append(" ");
//minagawa^ VisitTouch logを分ける        
        String uri = wrapper.getRequestURIForLog();
        sb.append(uri);
        if (uri.startsWith("/jtouch")) {
            Logger.getLogger("visit.touch").info(sb.toString());
        } else {
            Logger.getLogger("open.dolphin").info(sb.toString());
        }
//minagawa 

        chain.doFilter(wrapper, response);
    }

    @Override
    public void destroy() {
    }
}
