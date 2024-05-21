/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parchatemetro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Sarah
 */
public class Recargas extends javax.swing.JFrame {

    /**
     * Creates new form Recargas
     */
    public Recargas() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) horarios---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        horarios.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                horarios otraPestana = new horarios();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) casa---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        iconoCasita.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                casita otraPestana = new casita();
                otraPestana.setVisible(true);
                dispose();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        iconoCasita = new javax.swing.JLabel();
        horarios = new javax.swing.JLabel();
        pantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoCasita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/casa.png"))); // NOI18N
        jPanel.add(iconoCasita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        horarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Horarios.png"))); // NOI18N
        jPanel.add(horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 60, 10));

        pantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/RECARGAS.png"))); // NOI18N
        jPanel.add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Recargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recargas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recargas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel horarios;
    private javax.swing.JLabel iconoCasita;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
