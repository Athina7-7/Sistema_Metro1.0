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
public class Recomendaciones extends javax.swing.JFrame {

    /**
     * Creates new form Recomendaciones
     */
    //-----------------------------------------------------------------------------------
    //------------------------------------CLASE DE RECOMENDACIONES-----------------------
    //---------------------------------------TIPO MENÚ--------------------------------------
    public Recomendaciones() {
        //dentro de esta clase Recomendaciones, se crean automaticamente el codigo de creación
        //de los componentes (elementos arrastrables)
        //el initComponents es el encargado de crear los componentes
        //si copiamos y pegamos el codigo en otro lado podremos ver la inicialización de 
        //los componentes (elementos arrastrables)
        initComponents();
        //-----------------------------------------------------------------------------
        //con el this indicamos que este Recomendaciones() (metodo) use otro metodo que se encarga 
        //de la locación de la clase Recomendaciones (pestaña) y se encuentre en null
        this.setLocationRelativeTo(null);
        
        
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
//----------------------------REDIRECCIÓN A PESTAÑA(clase) datos historicos---------------------------------------------------------
        
        pestañaDatosHistoricos.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                datosCuriosos otraPestana = new datosCuriosos();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) lugares---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        pestañaLugares.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                Lugares otraPestana = new Lugares();
                otraPestana.setVisible(true);
                dispose();
            }
        }); 
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) favoritos---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        pestañaFavoritos.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                Favoritos otraPestana = new Favoritos();
                otraPestana.setVisible(true);
                dispose();
            }
        }); 
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) comentarios---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        pestañaComentario.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                Comentario otraPestana = new Comentario();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        
//Fin de la clase        
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
        pestañaComentario = new javax.swing.JLabel();
        pestañaLugares = new javax.swing.JLabel();
        pestañaDatosHistoricos = new javax.swing.JLabel();
        pestañaFavoritos = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoCasita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/casa.png"))); // NOI18N
        fondoPanel.add(iconoCasita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        horarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Horarios.png"))); // NOI18N
        fondoPanel.add(horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 60, 20));

        pestañaComentario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Diseño sin título (3).png"))); // NOI18N
        fondoPanel.add(pestañaComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 120, 120));

        pestañaLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Diseño sin título (4).png"))); // NOI18N
        fondoPanel.add(pestañaLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 110));

        pestañaDatosHistoricos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/BotonDatosHistoricos.png"))); // NOI18N
        fondoPanel.add(pestañaDatosHistoricos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, 110));

        pestañaFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Diseño sin título (5).png"))); // NOI18N
        fondoPanel.add(pestañaFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 130, 110));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondoRecomendaciones.png"))); // NOI18N
        fondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 550));

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
            java.util.logging.Logger.getLogger(Recomendaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recomendaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recomendaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recomendaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recomendaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel horarios;
    private javax.swing.JLabel iconoCasita;
    private javax.swing.JLabel pestañaComentario;
    private javax.swing.JLabel pestañaDatosHistoricos;
    private javax.swing.JLabel pestañaFavoritos;
    private javax.swing.JLabel pestañaLugares;
    // End of variables declaration//GEN-END:variables
}
