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
public class casita extends javax.swing.JFrame {

    /**
     * Creates new form casita
     */
    
    //-----------------------------------------------------------------------------------
    //------------------------------------CLASE DE CASITA-----------------------
    //---------------------------------------MENÚ PRINCIPAL--------------------------------------

    public casita() {
         //dentro de esta clase Recomendaciones, se crean automaticamente el codigo de creación
        //de los componentes (elementos arrastrables)
        //el initComponents es el encargado de crear los componentes
        //si copiamos y pegamos el codigo en otro lado podremos ver la inicialización de 
        //los componentes (elementos arrastrables)
        initComponents();
        //-----------------------------------------------------------------------------
        //con el this indicamos que este casita() (metodo) use otro metodo que se encarga 
        //de la locación de la clase casita (pestaña) y se encuentre en null
        this.setLocationRelativeTo(null);
        
        //************************************************************************
        //-----------------------------ADMINISTRADOR..............................
        //..........................SOLO VISUALIZA EL ADMIN.......................
        //--------------------------EXPLICACIÓN------------------------------------
        //----------------------------Creación de variables---------------------------
        String nombreArchivo = "usuarios.txt";
        String ultimaLinea = "";
        String[] admin = null;        
        //--------------------------llamado del componente (contactanos)-----------------
        //le indico que no será visto
        contactanos.setVisible(false);
        //-------------------------Validación de si es administrador---------------------
        //la condición del try es: creamos una variable de tipo BufferedReader (encargado de recorrer y
        //leer el documento, linea por linea)
            try (BufferedReader leer = new BufferedReader(new FileReader(nombreArchivo))) {
                String lineaActual;
                //se recorre con este metodo, el cual irá asignandole lo obtenido por cada linea
                //a la variable String lineaActual, FINALIZARÁ cuando consiga un null en txt, 
                //o sea, cuando esté vació.
                while ((lineaActual = leer.readLine()) != null) {
                    ultimaLinea = lineaActual;
                    //se divide en un arreglo con ayuda del split y se almacena en una
                    //variable de tipo arreglo. Se va reescribiendo, o sea que no se guardan
                    //los valores anteriores de lineas, sino que se van cambiando
                    //esto con el proposito de llegar al ultimo y dividirlo. 
                    admin = ultimaLinea.split(",");
                }
                //------------------------------------------------------
                //con este for recorremos el arreglo admin, el cual contiene todo divido
                //lo de una linea.
                for(int i = 0; i < admin.length; i++){
                    System.out.println(admin[i]);
                }
                //---------------------Validación del campo "tipo de usuario"----------------
                //Si el arreglo en la posición 4 contiene el texto indicando que es 
                //Usuario administrador entrará y le mostraremos el componente
                //de contactanos
                if(admin[4].equals("Usuario administrador")){
                    contactanos.setVisible(true);
                    
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        System.out.println("La última línea del archivo es: " + ultimaLinea);
        
        //*******************************************************************************
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
        
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) contactanos---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        contactanos.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                contactanos otraPestana = new contactanos();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) MAPA---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        //pestañaMapa hace referencia al componente de la interfaz cuando escuche un evento del mouse,
        //un clic haremos que se ejecute el metodo del 'nuevo objeto MouseAdapter'
        pestañaMapa.addMouseListener(new MouseAdapter() {
            //En el metodo se le indica lo siguiente: cree una variable de tipo 'Mapa',
            //el cual es una clase, y en ella almacenará un objeto de la clase Mapa.
            //Luego con el metodo setVisible le indicamos que sea modificada a el valor True, 
            //o sea, que se muestre
            public void mouseClicked(MouseEvent e) {
                // ----------------Hacer visible la otra pestaña----------------
                Mapa otraPestana = new Mapa();
                otraPestana.setVisible(true);
               //y con el metodo dispose nos ayuda a deshabilitar la anterior pestaña

                dispose();
            }
        });  
        
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) RECOMENDACIONES---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        pestañaRecomendaciones.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                Recomendaciones otraPestana = new Recomendaciones();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) pestañaFlujo---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        pestañaFlujo.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                flujo otraPestana = new flujo();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        
        
        
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) estadisticas---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        pestañaEstadisticas.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                Estadisticas otraPestana = new Estadisticas();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        
        //----------------------------REDIRECCIÓN A PESTAÑA(clase) recarga---------------------------------------------------------
        //------------------------------EXPLICACIÓN---------------------------------
        recarga.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                Recargas otraPestana = new Recargas();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        
        
        
        
// fin de la clase:)        
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
        pestañaFlujo = new javax.swing.JLabel();
        contactanos = new javax.swing.JLabel();
        pestañaEstadisticas = new javax.swing.JLabel();
        recarga = new javax.swing.JLabel();
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

        pestañaFlujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/BotonFlujoEstaciones.png"))); // NOI18N
        fondoPanel.add(pestañaFlujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 130, 110));

        contactanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Contáctanos.png"))); // NOI18N
        fondoPanel.add(contactanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 20));

        pestañaEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/BotonEstadisticas.png"))); // NOI18N
        fondoPanel.add(pestañaEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, 120));

        recarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/recarga.png"))); // NOI18N
        fondoPanel.add(recarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 120, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/casaInicio.png"))); // NOI18N
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
    private javax.swing.JLabel contactanos;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel horarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pestañaEstadisticas;
    private javax.swing.JLabel pestañaFlujo;
    private javax.swing.JLabel pestañaMapa;
    private javax.swing.JLabel pestañaRecomendaciones;
    private javax.swing.JLabel recarga;
    // End of variables declaration//GEN-END:variables

    static class addMouseListener {

        public addMouseListener() {
        }
    }
}
