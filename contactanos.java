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
public class contactanos extends javax.swing.JFrame {

    /**
     * Creates new form contactanos
     */
    public contactanos() {
        initComponents();
        
        this.setLocationRelativeTo(null);

        
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) CASITA---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        iconoCasita.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                casita otraPestana = new casita();
                otraPestana.setVisible(true);
                dispose();
            }
        });
         //----------------------------REDIRECCIÓN A PESTAÑA(clase) HORARIOS---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        //horarios hace referencia al componente de la interfaz (el cual es una imagen con el
        //texto de "Horarios"), cuando escuche un evento del mouse, un clic haremos que 
        //se ejecute el metodo del 'nuevo objeto MouseAdapter'
        horarios.addMouseListener(new MouseAdapter() {
            //En el metodo se le indica lo siguiente: cree una variable de tipo 'horarios',
            //el cual es una clase, y en ella almacenará un objeto de la clase horarios.
            //Luego con el metodo setVisible le indicamos que sea modificada a el valor True, 
            //o sea, que se muestre
            public void mouseClicked(MouseEvent e) {
                // ----------------Hacer visible la otra pestaña----------------
                horarios otraPestana = new horarios();
                otraPestana.setVisible(true);
                //y con el metodo dispose nos ayuda a deshabilitar la anterior pestaña
                
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

        fondoPanel = new javax.swing.JPanel();
        iconoCasita = new javax.swing.JLabel();
        horarios = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoCasita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/casa.png"))); // NOI18N
        fondoPanel.add(iconoCasita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        horarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Horarios.png"))); // NOI18N
        fondoPanel.add(horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondoContactanos.png"))); // NOI18N
        fondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 520));

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
            java.util.logging.Logger.getLogger(contactanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contactanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contactanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contactanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contactanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel horarios;
    private javax.swing.JLabel iconoCasita;
    // End of variables declaration//GEN-END:variables
}