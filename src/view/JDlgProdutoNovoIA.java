/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutoDbc;
import dao.ProdutoDAO;
import java.util.List;
import tools.UtilDbc;
import viewControle.ProdutoControle;
import viewPesquisa.JDlgProdutoNovo;

/**
 *
 * @author u03402615100
 */
public class JDlgProdutoNovoIA extends javax.swing.JDialog {
        private boolean incluindo;
        JDlgProdutoNovo jDlgProdutoNovo;
        ProdutoDbc produtoDbc;
        ProdutoDAO produtoDAO;
        public ProdutoControle produtoControle;
    /**
     * Creates new form JDlgProduto
     */
    public JDlgProdutoNovoIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Produto");
        setLocationRelativeTo(null);
        produtoDAO = new ProdutoDAO();
    }
    
     public ProdutoDbc viewBean() {
         /*SetarId*/
        ProdutoDbc produtoDbc = new ProdutoDbc();
        int id = UtilDbc.strInt(jFmtCodigo.getText());
        produtoDbc.setIdprodutoDbc(id);
        /*SetarDoble*/
        double preco = UtilDbc.strDouble(jFmtPreco_dbc.getText());
        produtoDbc.setPrecoDbc(preco);
        /*SetarTexto*/
        produtoDbc.setNomeDbc(JTxtNome_dbc.getText());
        produtoDbc.setDescricaoDbc(JTxtDescricao_dbc.getText());
        produtoDbc.setSerialDbc(jFmtSerial_dbc.getText());
        int quant = UtilDbc.strInt(jFmtQuantidade_dbc.getText());
        produtoDbc.setQuantidadeDbc(quant);
        
        
        if (jCboCategoria_dbc.getSelectedIndex() == 0) {
            produtoDbc.setCategoriaDbc("Perifericos");
        }else if(jCboCategoria_dbc.getSelectedIndex() == 1){
            produtoDbc.setCategoriaDbc("Consoles");
        }else{
            produtoDbc.setCategoriaDbc("Eletronicos Gerais");
        }
        if (jCboFornecedor_dbc.getSelectedIndex() == 0) {
            produtoDbc.setFornecedorDbc("ABNT Exports");
        }else if(jCboFornecedor_dbc.getSelectedIndex() == 1){
            produtoDbc.setFornecedorDbc("Marcs Inc.");
        }else{
            produtoDbc.setFornecedorDbc("Brownie Org.");
        }


        return produtoDbc;
    }
    
    public void beanView(ProdutoDbc produtoDbc) {
        /*SetarId*/
        String intStr = UtilDbc.intStr(produtoDbc.getIdprodutoDbc());
        jFmtCodigo.setText(intStr);
        /*SetarDoble*/
        double salario = UtilDbc.strDouble(jFmtPreco_dbc.getText());
        produtoDbc.setPrecoDbc(salario);
        
        JTxtNome_dbc.setText(produtoDbc.getNomeDbc());
        JTxtDescricao_dbc.setText(produtoDbc.getDescricaoDbc());
        jFmtSerial_dbc.setText(produtoDbc.getSerialDbc());
        jTxtCategoria_dbc.setText(produtoDbc.getCategoriaDbc());
        String intStr2 = UtilDbc.intStr(produtoDbc.getQuantidadeDbc());
        jFmtQuantidade_dbc.setText(intStr2);
        
        String cat = produtoDbc.getCategoriaDbc();
        if(cat.equals("Perifericos")){
            jCboCategoria_dbc.setSelectedIndex(0);
        }else if(cat.equals("Consoles")){
            jCboCategoria_dbc.setSelectedIndex(1);
        }else {
            jCboCategoria_dbc.setSelectedIndex(2);
        }
        
        String forn = produtoDbc.getFornecedorDbc();
        if(forn.equals("ABNT Exports")){
            jCboFornecedor_dbc.setSelectedIndex(0);
        }else if(forn.equals("Marcs Inc.")){
            jCboFornecedor_dbc.setSelectedIndex(1);
        }else {
            jCboFornecedor_dbc.setSelectedIndex(2);
        }
    }

    public void setTelaAnterior(JDlgProdutoNovo jDlgProdutoNovo) {
        this.jDlgProdutoNovo = jDlgProdutoNovo;
    }
    public void setIncluindo(boolean incluindo) {
        this.incluindo = incluindo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnOk = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFmtSerial_dbc = new javax.swing.JFormattedTextField();
        JTxtNome_dbc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTxtDescricao_dbc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFmtQuantidade_dbc = new javax.swing.JFormattedTextField();
        jFmtPreco_dbc = new javax.swing.JFormattedTextField();
        jTxtCategoria_dbc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFmtCodigo = new javax.swing.JFormattedTextField();
        jCboCategoria_dbc = new javax.swing.JComboBox<>();
        jCboFornecedor_dbc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Ok .png"))); // NOI18N
        jBtnOk.setText("Ok");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnOk);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Cancelar .png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar);

        jLabel6.setText("Preço:");

        jLabel7.setText("Serial do Produto");

        jLabel8.setText("Fornecedor:");

        jLabel1.setText("Categoria");

        JTxtNome_dbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtNome_dbcActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel9.setText("Quantidade");

        JTxtDescricao_dbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtDescricao_dbcActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição Breve:");

        jFmtQuantidade_dbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtQuantidade_dbcActionPerformed(evt);
            }
        });

        jTxtCategoria_dbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCategoria_dbcActionPerformed(evt);
            }
        });

        jLabel4.setText("Código");

        jFmtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCodigoActionPerformed(evt);
            }
        });

        jCboCategoria_dbc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perifericos", "Consoles", "Eletronicos Gerais" }));

        jCboFornecedor_dbc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABNT Exports", "Marcs Inc.", "Brownie Org." }));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel10.setText("Cadastro de Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JTxtNome_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFmtCodigo)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jCboFornecedor_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCboCategoria_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jFmtSerial_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTxtDescricao_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jFmtQuantidade_dbc)
                            .addComponent(jLabel6)
                            .addComponent(jFmtPreco_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtCategoria_dbc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTxtCategoria_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboCategoria_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboFornecedor_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtSerial_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxtNome_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtQuantidade_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(jFmtPreco_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JTxtDescricao_dbc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCategoria_dbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCategoria_dbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCategoria_dbcActionPerformed

    private void jFmtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCodigoActionPerformed

    private void jFmtQuantidade_dbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtQuantidade_dbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtQuantidade_dbcActionPerformed

    private void JTxtDescricao_dbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtDescricao_dbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtDescricao_dbcActionPerformed

    private void JTxtNome_dbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtNome_dbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtNome_dbcActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        UtilDbc.mensagem("Operação Cancelada!");
        UtilDbc.limparCampos(jFmtCodigo, jFmtPreco_dbc, jFmtQuantidade_dbc, jFmtSerial_dbc, JTxtDescricao_dbc, JTxtNome_dbc, jTxtCategoria_dbc, jCboCategoria_dbc, jCboFornecedor_dbc);
        this.dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        produtoDbc = viewBean();
        produtoDAO = new ProdutoDAO();
        if (incluindo) {
            produtoDAO.insert(produtoDbc);
            List lista = produtoDAO.listAll();
            jDlgProdutoNovo.produtoControle.setList(lista);
            UtilDbc.mensagem("Registro incluído com sucesso.");
            jDlgProdutoNovo.setTelaAnterior(this);

        } else {
            produtoDAO.update(produtoDbc);
            List lista = produtoDAO.listAll();
            UtilDbc.mensagem("Registro alterado com sucesso.");
        }
        UtilDbc.limparCampos(jFmtCodigo, jFmtPreco_dbc, jFmtQuantidade_dbc, jFmtSerial_dbc, JTxtDescricao_dbc, JTxtNome_dbc, jTxtCategoria_dbc, jCboCategoria_dbc, jCboFornecedor_dbc);
        this.dispose();
    }//GEN-LAST:event_jBtnOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgProdutoNovoIA dialog = new JDlgProdutoNovoIA(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTxtDescricao_dbc;
    private javax.swing.JTextField JTxtNome_dbc;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JComboBox<String> jCboCategoria_dbc;
    private javax.swing.JComboBox<String> jCboFornecedor_dbc;
    private javax.swing.JFormattedTextField jFmtCodigo;
    private javax.swing.JFormattedTextField jFmtPreco_dbc;
    private javax.swing.JFormattedTextField jFmtQuantidade_dbc;
    private javax.swing.JFormattedTextField jFmtSerial_dbc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtCategoria_dbc;
    // End of variables declaration//GEN-END:variables
}
