/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Baka.java
 *
 * Created on 2009/05/09, 9:13:54
 */

package open.dolphin.order;

/**
 *
 * @author kushiro
 */
public class DiseaseViewText extends javax.swing.JPanel implements IDiseaseView {

    /** Creates new form Baka */
    public DiseaseViewText() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        setTable = new javax.swing.JTable();
        diseaseCheck = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        stampNameField = new javax.swing.JTextField();
        okCntBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        rtBtn = new javax.swing.JCheckBox();
        countField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchResultTable = new javax.swing.JTable();
        partialChk = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 11, 11));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        infoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open/dolphin/resources/images/about_16.gif"))); // NOI18N
        infoLabel.setText("傷病名"); // NOI18N

        setTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(setTable);

        diseaseCheck.setText("傷病名"); // NOI18N
        diseaseCheck.setToolTipText("傷病名が含まれていればチェックされます。"); // NOI18N
        diseaseCheck.setEnabled(false);

        jLabel2.setText("連結傷病名"); // NOI18N

        stampNameField.setBackground(new java.awt.Color(255, 255, 0));
        stampNameField.setToolTipText("病名を修飾する場合は、正しく読めるようテーブルの順番を入れ替えてください。"); // NOI18N

        okCntBtn.setText("展開継続"); // NOI18N
        okCntBtn.setToolTipText("傷病名をカルテに展開し継続します。"); // NOI18N

        okBtn.setText("展開"); // NOI18N
        okBtn.setToolTipText("傷病名をカルテに展開し終了します。"); // NOI18N

        clearBtn.setText("クリア"); // NOI18N
        clearBtn.setToolTipText("テーブルの内容をクリアします。"); // NOI18N

        deleteBtn.setText("削除"); // NOI18N
        deleteBtn.setToolTipText("選択した傷病名を削除します。"); // NOI18N

        searchTextField.setToolTipText("検索したい傷病名を入力します。"); // NOI18N

        rtBtn.setText("RT"); // NOI18N
        rtBtn.setToolTipText("チェックすると入力中にリアルタイムで検索します。"); // NOI18N

        jLabel4.setText("件数"); // NOI18N

        searchResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(searchResultTable);

        partialChk.setText("部分一致"); // NOI18N
        partialChk.setToolTipText("部分一致検索をします。"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(infoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diseaseCheck))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stampNameField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rtBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okCntBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(partialChk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoLabel)
                    .addComponent(diseaseCheck))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okCntBtn)
                    .addComponent(okBtn)
                    .addComponent(clearBtn)
                    .addComponent(deleteBtn)
                    .addComponent(jLabel2)
                    .addComponent(stampNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rtBtn)
                    .addComponent(partialChk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField countField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JCheckBox diseaseCheck;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton okBtn;
    private javax.swing.JButton okCntBtn;
    private javax.swing.JCheckBox partialChk;
    private javax.swing.JCheckBox rtBtn;
    private javax.swing.JTable searchResultTable;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTable setTable;
    private javax.swing.JTextField stampNameField;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the clearBtn
     */
    public javax.swing.JButton getClearBtn() {
        return clearBtn;
    }

    /**
     * @return the countField
     */
    public javax.swing.JTextField getCountField() {
        return countField;
    }

    /**
     * @return the deleteBtn
     */
    public javax.swing.JButton getDeleteBtn() {
        return deleteBtn;
    }

    /**
     * @return the infoLabel
     */
    public javax.swing.JLabel getInfoLabel() {
        return infoLabel;
    }


    /**
     * @return the okBtn
     */
    public javax.swing.JButton getOkBtn() {
        return okBtn;
    }

    /**
     * @return the okCntBtn
     */
    public javax.swing.JButton getOkCntBtn() {
        return okCntBtn;
    }

    /**
     * @return the rtBtn
     */
    public javax.swing.JCheckBox getRtBtn() {
        return rtBtn;
    }

    /**
     * @return the searchResultTabel
     */
    public javax.swing.JTable getSearchResultTable() {
        return searchResultTable;
    }

    /**
     * @return the searchTextField
     */
    public javax.swing.JTextField getSearchTextField() {
        return searchTextField;
    }

    /**
     * @return the stampNameField
     */
    public javax.swing.JTextField getStampNameField() {
        return stampNameField;
    }

    /**
     * @return the techChk
     */
    public javax.swing.JCheckBox getDiseaseCheck() {
        return diseaseCheck;
    }

    /**
     * @return the setTable
     */
    public javax.swing.JTable getSetTable() {
        return setTable;
    }

    public javax.swing.JCheckBox getPartialChk() {
        return partialChk;
    }

}
