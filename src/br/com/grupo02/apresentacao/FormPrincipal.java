/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.grupo02.apresentacao;

import br.com.grupo02.negocio.error.ConexaoException;
import br.com.grupo02.negocio.error.DAOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author ADM
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
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

        lbProjeto = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCurso = new javax.swing.JMenuItem();
        jMenuProfessor = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Grupo02");
        setBackground(new java.awt.Color(0, 0, 204));

        lbProjeto.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbProjeto.setText("Projeto grupo02");

        menuCadastro.setText("Cadastros");
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });

        menuCurso.setText("Curso");
        menuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCursoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCurso);

        jMenuProfessor.setText("Professor");
        jMenuProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProfessorActionPerformed(evt);
            }
        });
        menuCadastro.add(jMenuProfessor);

        barraMenu.add(menuCadastro);

        menuAjuda.setText("Ajuda");
        menuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaActionPerformed(evt);
            }
        });

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(lbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
       // Apagar 
    }//GEN-LAST:event_menuAjudaActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        JOptionPane.showMessageDialog(this, "Sistema para gerenciar as disciplinas \nofertadas pelos professores da UniRecife.\n"
        + "Todos os direitos reservados ao Grupo 02.");
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
       // Apagar 
        
    }//GEN-LAST:event_menuCadastroActionPerformed

    private void menuCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCursoActionPerformed
        // O this informa de qual frema ele será criado e o true se vai ser um modal.
        FormCurso form = new FormCurso(this, true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle("Gerenciamento de Cursos");
        form.setLocationRelativeTo(this);
        form.setResizable(false);
        form.setVisible(true);
        
    }//GEN-LAST:event_menuCursoActionPerformed

    private void jMenuProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProfessorActionPerformed
        try {
            // O this informa de qual frema ele será criado e o true se vai ser um modal.
            FormProfessor form = new FormProfessor(this,true);
            form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            form.setTitle("Gerenciamento de Professores");
            form.setLocationRelativeTo(this);
            form.setResizable(false);
            form.setVisible(true);
        } catch (ConexaoException ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DAOException ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
    }//GEN-LAST:event_jMenuProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FormPrincipal().setVisible(true);
                FormPrincipal form = new FormPrincipal();
                // Executa a nossa aplicação no meio da tela
                form.setLocationRelativeTo(null);
                form.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem jMenuProfessor;
    private javax.swing.JLabel lbProjeto;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCurso;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables
}
