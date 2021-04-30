/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AuthorController;
import controller.BookController;
import controller.PublisherController;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Author;
import model.Publisher;

/**
 *
 * @author thoni
 */
public class TelaIncluirBook extends javax.swing.JFrame {

    /**
     * Creates new form TelaIncluirBook
     */
    public TelaIncluirBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelAlterarLivro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JTextField();
        jComboBoxEscolherEditora = new javax.swing.JComboBox<>();
        jButtonAlterarLivro = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIsbn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxEscolherAutor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("INLCUIR LIVRO");

        jPanelAlterarLivro.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Título:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Preço:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Escolher Editora:");

        jTextFieldTitulo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextFieldTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });

        jTextFieldPreco.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextFieldPreco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoActionPerformed(evt);
            }
        });

        jComboBoxEscolherEditora.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBoxEscolherEditora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEscolherEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEscolherEditoraActionPerformed(evt);
            }
        });

        jButtonAlterarLivro.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButtonAlterarLivro.setText("INSERIR");
        jButtonAlterarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarLivroActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("ISBN:");

        jTextFieldIsbn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextFieldIsbn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIsbn.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Escolher Autor:");

        jComboBoxEscolherAutor.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBoxEscolherAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEscolherAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEscolherAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlterarLivroLayout = new javax.swing.GroupLayout(jPanelAlterarLivro);
        jPanelAlterarLivro.setLayout(jPanelAlterarLivroLayout);
        jPanelAlterarLivroLayout.setHorizontalGroup(
            jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlterarLivroLayout.createSequentialGroup()
                .addGroup(jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAlterarLivroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAlterarLivro))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAlterarLivroLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTitulo)
                            .addGroup(jPanelAlterarLivroLayout.createSequentialGroup()
                                .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 162, Short.MAX_VALUE))
                            .addComponent(jComboBoxEscolherEditora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldIsbn)
                            .addComponent(jComboBoxEscolherAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(216, 216, 216)))
                .addGap(33, 33, 33))
        );
        jPanelAlterarLivroLayout.setVerticalGroup(
            jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlterarLivroLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxEscolherEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxEscolherAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanelAlterarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterarLivro)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAlterarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanelAlterarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void jTextFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoActionPerformed

    private void jComboBoxEscolherEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEscolherEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEscolherEditoraActionPerformed

    private void jButtonAlterarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarLivroActionPerformed
        // TODO add your handling code here:
        BookController bookC = new BookController();
        String titulo = jTextFieldTitulo.getText();
        String isbn = jTextFieldIsbn.getText();
        String price = jTextFieldPreco.getText();
        Object obj = jComboBoxEscolherEditora.getSelectedItem();
        Object objAuthor = jComboBoxEscolherAutor.getSelectedItem();
        boolean situacao = bookC.insert(titulo, price, isbn, obj, objAuthor);

        if (situacao) {
            JOptionPane.showMessageDialog(null, "Os valores foram inseridos no banco de dados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldTitulo.setText("");
            jTextFieldIsbn.setText("");
            jTextFieldPreco.setText("");
            jComboBoxEscolherEditora.setSelectedIndex(0);
            jComboBoxEscolherAutor.setSelectedIndex(0);
            
        }
    }//GEN-LAST:event_jButtonAlterarLivroActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        PublisherController pubC = new PublisherController();
        AuthorController autC = new AuthorController();
        List<Author> listAuth = autC.findAll();
        DefaultComboBoxModel modelAuth = new DefaultComboBoxModel();
        for (Author a : listAuth) {
            modelAuth.addElement(a.getName() + " " + a.getfName());
        }
        jComboBoxEscolherAutor.setModel(modelAuth);
        List<Publisher> list = pubC.findAll();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Publisher p : list) {
            model.addElement(p.getName());
        }
        jComboBoxEscolherEditora.setModel(model);
    }//GEN-LAST:event_formComponentShown

    private void jComboBoxEscolherAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEscolherAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEscolherAutorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaIncluirBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIncluirBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIncluirBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIncluirBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIncluirBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarLivro;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxEscolherAutor;
    private javax.swing.JComboBox<String> jComboBoxEscolherEditora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelAlterarLivro;
    private javax.swing.JTextField jTextFieldIsbn;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}