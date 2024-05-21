/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parchatemetro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cliente
 */
public class Mapa extends javax.swing.JFrame {

    /**
     * Creates new form Mapa
     */
    
    //----------------------------------------------------------------------------------------
    //---------------------------------CLASE MAPA---------------------------------------------
    //----------------------------------PESTAÑA-----------------------------------------------
    public Mapa() {
        //dentro de esta clase Mapa, se crean automaticamente el codigo de creación
        //de los componentes (elementos arrastrables)
        //el initComponents es el encargado de crear los componentes
        //si copiamos y pegamos el codigo en otro lado podremos ver la inicialización de 
        //los componentes (elementos arrastrables)
        initComponents();
        //-----------------------------------------------------------------------------
        //con el this indicamos que este Mapa() (metodo) use otro metodo que se encarga 
        //de la locación de la clase Mapa (pestaña) y se encuentre en null
        this.setLocationRelativeTo(null);
        horarios.setVisible(false);
     
        //-------------------------------REDIRECCIÓN A GOOGLE------------------------------------------
        // Evento de ratón para abrir Google Maps al hacer clic en el icono
        // Creamos un evento de ratón para permitir que el usuario haga clic en el icono y sea 
        //redirigido a la URL de Google Maps.
        // Primero, agregamos un MouseListener al componente iconoGoogle para detectar clics de ratón
        iconoGoogle.addMouseListener(new java.awt.event.MouseAdapter() {
        // Sobreescribimos el método mouseClicked para definir qué sucede cuando el usuario hace 
            //clic en el icono            
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            //try evalua/corre el codigo, mientras que catch está atento al error
            try {
            // Utilizamos la clase Desktop para abrir el navegador web predeterminado del usuario y
            //cargar la URL de Google Maps 
            // java.awt es un paquete que tiene a Desktop , con eso obtenemos el objeto.
            //se hace un llamado al metodo browse que hace parte del objeto de Desktop
            
            //new java.net.URI: es la creación de una nueva instancia de la clase 
            //URI del paquete java.net. Es para manejar direcciones web 
            //URI: representa un identificador uniforme de recursos
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.google.com/maps"));
            } catch (java.net.URISyntaxException | java.io.IOException e) {
            // En caso de que ocurra una excepción al abrir la URL, imprimimos 
            //el rastro de la pila del error 
            //lo que proporcionará información sobre dónde y por qué se produjo el error.
                e.printStackTrace();
            }
        }
        });
//-----------------------------------REDIRECCIÓN A PESTAÑA(clase) HORARIOS------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        //horarios hace referencia al componente de la interfaz (el cual es una imagen con el
        //texto de "Horarios"), cuando escuche un evento del mouse, un clic haremos que 
        //se ejecute el metodo del 'nuevo objeto MouseAdapter'
        horarios.addMouseListener(new MouseAdapter() {
            
            //En el metodo se le indica lo siguiente: cree una variable de tipo 'horarios',
            //el cual es una clase, y en ella almacenará un objeto de la clase horarios.
            //Luego con el metodo setVisible le indicamos que sea modificada a el valor True, 
            //o sea, que se muestre. 
            public void mouseClicked(MouseEvent e) {
                                        
                // ----------------Hacer visible la otra pestaña----------------
                
                horarios otraPestana = new horarios();
                    otraPestana.setVisible(true);
                    //y con el metodo dispose nos ayuda a deshabilitar la anterior pestaña
                    dispose();
          
            }
        });
//-------------------------------REDIRECCIÓN A PESTAÑA(clase) CASITA---------------------------------------------
        iconoCasita.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // con el evento de click lo redireccionamos al objeto casita(la clase)
                //y lo hacemos visible con true y con el metodo dispose nos permite deshabilitar
                //la visualización
                casita otraPestana = new casita();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        
 //fin de la clase       
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
        iconoGoogle = new javax.swing.JLabel();
        bolaVerde = new javax.swing.JLabel();
        horarios = new javax.swing.JLabel();
        iconoCasita = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ubicacion.png"))); // NOI18N
        fondoPanel.add(iconoGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 100, 70));

        bolaVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton.png"))); // NOI18N
        fondoPanel.add(bolaVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 80, 70));

        horarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Horarios.png"))); // NOI18N
        fondoPanel.add(horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 60, 20));

        iconoCasita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/casa.png"))); // NOI18N
        fondoPanel.add(iconoCasita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Ubicate con Google Maps  Use Google Maps.png"))); // NOI18N
        fondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 330, 550));

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
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bolaVerde;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel horarios;
    private javax.swing.JLabel iconoCasita;
    private javax.swing.JLabel iconoGoogle;
    // End of variables declaration//GEN-END:variables
}
