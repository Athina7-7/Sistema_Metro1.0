/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parchatemetro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author cliente
 */
public class casita extends javax.swing.JFrame {

    /**
     * Creates new form casita
     */
    
    //clase del JFrame donde pondremos las acciones a realizar
    public casita() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        pestañaMapa.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                Mapa otraPestana = new Mapa();
                otraPestana.setVisible(true);
                dispose();
            }
        });  
        pestañaRecomendaciones.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                Recomendaciones otraPestana = new Recomendaciones();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        horarios.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                horarios otraPestana = new horarios();
                otraPestana.setVisible(true);
                dispose();
            }
        });        
        
        
        
// fin de la clase del formulario:)        
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
        fondoPanel = new javax.swing.JPanel();
        pestañaMapa = new javax.swing.JLabel();
        horarios = new javax.swing.JLabel();
        pestañaRecomendaciones = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pestañaMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/BotonMapa.png"))); // NOI18N
        fondoPanel.add(pestañaMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 110));

        horarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Horarios.png"))); // NOI18N
        fondoPanel.add(horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 20));

        pestañaRecomendaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/BotonRecomendaciones.png"))); // NOI18N
        fondoPanel.add(pestañaRecomendaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, 100));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/casitaInicio.png"))); // NOI18N
        fondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(casita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(casita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(casita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(casita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new casita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel horarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pestañaMapa;
    private javax.swing.JLabel pestañaRecomendaciones;
    // End of variables declaration//GEN-END:variables

    static class addMouseListener {

        public addMouseListener() {
        }
    }
}
