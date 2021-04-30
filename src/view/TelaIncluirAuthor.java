/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AuthorController;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author thoni
 */
public class TelaIncluirAuthor extends javax.swing.JFrame {

    /**
     * Creates new form TelaIncluirAuthor
     */
    public TelaIncluirAuthor() {
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

        jPanelIncluirAutor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSobrenomeAutor = new javax.swing.JTextField();
        jButtonSalvarAutor = new javax.swing.JButton();
        jButtonLimparAutor = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelIncluirAutor.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jTextFieldNomeAutor.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextFieldNomeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAutorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Sobrenome:");

        jTextFieldSobrenomeAutor.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jButtonSalvarAutor.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButtonSalvarAutor.setText("Salvar");
        jButtonSalvarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAutorActionPerformed(evt);
            }
        });

        jButtonLimparAutor.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButtonLimparAutor.setText("Limpar");
        jButtonLimparAutor.setToolTipText("");
        jButtonLimparAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparAutorActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIncluirAutorLayout = new javax.swing.GroupLayout(jPanelIncluirAutor);
        jPanelIncluirAutor.setLayout(jPanelIncluirAutorLayout);
        jPanelIncluirAutorLayout.setHorizontalGroup(
            jPanelIncluirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIncluirAutorLayout.createSequentialGroup()
                .addGroup(jPanelIncluirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIncluirAutorLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(jPanelIncluirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(jPanelIncluirAutorLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButtonVoltar)))
                .addGroup(jPanelIncluirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIncluirAutorLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelIncluirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNomeAutor)
                            .addComponent(jTextFieldSobrenomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelIncluirAutorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonLimparAutor)
                        .addGap(184, 184, 184)
                        .addComponent(jButtonSalvarAutor)
                        .addGap(68, 68, 68))))
        );
        jPanelIncluirAutorLayout.setVerticalGroup(
            jPanelIncluirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIncluirAutorLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanelIncluirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanelIncluirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSobrenomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanelIncluirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarAutor)
                    .addComponent(jButtonLimparAutor)
                    .addComponent(jButtonVoltar))
                .addGap(53, 53, 53))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("INCLUIR AUTOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(292, 292, 292))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelIncluirAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanelIncluirAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeAutorActionPerformed

    private void jButtonSalvarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAutorActionPerformed
        String name = jTextFieldNomeAutor.getText();
        String fName = jTextFieldSobrenomeAutor.getText();
        boolean sucesso;
            try{
                AuthorController authorController = new AuthorController();
                sucesso = authorController.incluirAuthor(name, fName);
                if(sucesso){
                    JOptionPane.showMessageDialog(null, "Elemento inserido com sucesso!");
                    this.jButtonLimparAutorActionPerformed(evt);
                }else{
                    JOptionPane.showMessageDialog(null, "Os valores inseridos estão incorretos. Tente novamente!");
                }
        }catch(Exception ex){
                System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonSalvarAutorActionPerformed

    private void jButtonLimparAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparAutorActionPerformed
        // TODO add your handling code here:
        jTextFieldNomeAutor.setText("");
        jTextFieldSobrenomeAutor.setText("");
        
    }//GEN-LAST:event_jButtonLimparAutorActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed
   
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
            java.util.logging.Logger.getLogger(TelaIncluirAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIncluirAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIncluirAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIncluirAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIncluirAuthor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimparAutor;
    private javax.swing.JButton jButtonSalvarAutor;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelIncluirAutor;
    private javax.swing.JTextField jTextFieldNomeAutor;
    private javax.swing.JTextField jTextFieldSobrenomeAutor;
    // End of variables declaration//GEN-END:variables
}
