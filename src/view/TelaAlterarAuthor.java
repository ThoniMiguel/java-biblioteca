/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AuthorController;
import dao.AuthorsDao;
import dao.DaoFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import model.Author;

/**
 *
 * @author thoni
 */
public class TelaAlterarAuthor extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlterarAuthor
     */
    public TelaAlterarAuthor() {
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
        jPanelExlcuirAutor = new javax.swing.JPanel();
        jButtonProximoAlterarAutor = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListSelecionarAuthor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Amazonia");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("ALTERAR AUTOR");

        jPanelExlcuirAutor.setBackground(new java.awt.Color(153, 153, 153));

        jButtonProximoAlterarAutor.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButtonProximoAlterarAutor.setText("Proximo");
        jButtonProximoAlterarAutor.setToolTipText("");
        jButtonProximoAlterarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoAlterarAutorActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecione o autor que deseja alterar:");

        jListSelecionarAuthor.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jListSelecionarAuthor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jListSelecionarAuthor);

        javax.swing.GroupLayout jPanelExlcuirAutorLayout = new javax.swing.GroupLayout(jPanelExlcuirAutor);
        jPanelExlcuirAutor.setLayout(jPanelExlcuirAutorLayout);
        jPanelExlcuirAutorLayout.setHorizontalGroup(
            jPanelExlcuirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExlcuirAutorLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanelExlcuirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExlcuirAutorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(446, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExlcuirAutorLayout.createSequentialGroup()
                        .addGroup(jPanelExlcuirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelExlcuirAutorLayout.createSequentialGroup()
                                .addComponent(jButtonVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonProximoAlterarAutor)))
                        .addGap(75, 75, 75))))
        );
        jPanelExlcuirAutorLayout.setVerticalGroup(
            jPanelExlcuirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExlcuirAutorLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelExlcuirAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProximoAlterarAutor)
                    .addComponent(jButtonVoltar))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelExlcuirAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanelExlcuirAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProximoAlterarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoAlterarAutorActionPerformed
        // TODO add your handling code here:
        Object tempObj = jListSelecionarAuthor.getSelectedValue();
        if (tempObj == null) {
            JOptionPane.showMessageDialog(null, "Selecione um valor para alterar!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Author author = (Author) tempObj;
        TelaAlterarAuthor2 alterar2 = new TelaAlterarAuthor2();
        alterar2.jLabelAlterarAutorSelecionado.setText(author.toString());
        alterar2.setVisible(true);
        alterar2.author = author;
        this.dispose();
    }//GEN-LAST:event_jButtonProximoAlterarAutorActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        AuthorsDao authorsDao = DaoFactory.createAuthorDao();
        List<Author> list = authorsDao.findAll();
        DefaultListModel<Author> model = new DefaultListModel();
        for (Author author : list) {
            model.addElement(author);
        }
        jListSelecionarAuthor.setModel((ListModel) model);
    }//GEN-LAST:event_formComponentShown

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TelaAlterarAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarAuthor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProximoAlterarAutor;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListSelecionarAuthor;
    private javax.swing.JPanel jPanelExlcuirAutor;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}