/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parchatemetro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author cliente
 */
public final class registro extends javax.swing.JFrame {

    /**
     * Creates new form registro
     */
    public registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //PLaceholder de todos los campos
        // ??????????----Me falta diseño----????????????
        
        //Transparencia de los campos de texto de estos elementos
        textNombre.setBackground(new java.awt.Color(0,0,0,1));
        textId.setBackground(new java.awt.Color(0,0,0,1));
        textNumCivica.setBackground(new java.awt.Color(0,0,0,1));
        
        
        //hago llamado del metodo de transparencia al constructor de la clase registro
        transparenteBotonCrearCuenta();
        
        //crear el objeto de inicio de sesión
        inicioSesion inicioSesion = new inicioSesion();
        
        
        
        //crear el registro de los usuarios
        botonCrearCuenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    //Obtener los datos del formulario registro, ingresados por el usu
                    String nombreUsuario = textNombre.getText();
                    String tipoIdentificacion = (String) comBoxTipoId.getSelectedItem();
                    String numeroIdentificacion = textId.getText();
                    String numeroCivica = textNumCivica.getText();
                    String tipoUsuarioSeleccionado  = (String) comBoxTipoUsuario.getSelectedItem();
                    
                    if(!nombreUsuario.equals("") && !tipoIdentificacion.equals("")&& 
                      !numeroIdentificacion.equals("")&& !numeroCivica.equals("")
                      && !tipoUsuarioSeleccionado .equals("")){
                        
                        if(usuarioExistente(numeroIdentificacion,numeroCivica)){
                            JOptionPane.showMessageDialog(null, "El usuario ya está registrado\nIngrese un número de identificación\no de civica diferente");
                        }else{
                        
                            //Si el usuario aún no existe que se cree en el doc de text
                            FileWriter writer = new FileWriter("usuarios.txt", true);
                            BufferedWriter bufferedWriter = new BufferedWriter(writer);
                            // Escribir los datos del usuario en el archivo
                            bufferedWriter.write(nombreUsuario + "," + tipoIdentificacion + "," + numeroIdentificacion + "," +
                            numeroCivica + "," + tipoUsuarioSeleccionado  + "\n");

                            bufferedWriter.close();
                            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
                            //Cerrar la ventana de registro
                            dispose();
                            //Abrir la ventana de inicio de sesion
                            inicioSesion.setVisible(true);
                        }
                    }else{
                    JOptionPane.showMessageDialog(null, "Ingrese sus datos en todos los campos");
                    }
                    
                    
                } catch (IOException ex) {
                    ex.printStackTrace();
                    }
            }
        }); 
        
        tengoCuenta.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                dispose();
                inicioSesion.setVisible(true);
                
            }
        });
     
    }
    
    //Metodo para verificar si un usuario ya se registro
    private boolean usuarioExistente(String numeroIdentificacion, String numeroCivica) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"));
        String line;

        // Leer cada línea del archivo
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            // Verificar si el número de identificación o número de cívica ya existen en el archivo
            if (parts.length >= 3 && (parts[2].equals(numeroIdentificacion) || parts[3].equals(numeroCivica))) {
                reader.close();
                return true; // El usuario ya existe
            }
        }
        reader.close();
        return false; // El usuario no existe
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        fondoPanel = new javax.swing.JPanel();
        placeholderIdentificacion = new javax.swing.JLabel();
        placeholderTipoUsuario = new javax.swing.JLabel();
        placeholderCivica = new javax.swing.JLabel();
        placeholderNombre = new javax.swing.JLabel();
        placeholderTipoID = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textId = new javax.swing.JTextField();
        textNumCivica = new javax.swing.JTextField();
        botonCrearCuenta = new javax.swing.JButton();
        comBoxTipoId = new javax.swing.JComboBox<>();
        comBoxTipoUsuario = new javax.swing.JComboBox<>();
        tengoCuenta = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placeholderIdentificacion.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        placeholderIdentificacion.setText("Número de identificación/ ID*");
        fondoPanel.add(placeholderIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, 10));

        placeholderTipoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        placeholderTipoUsuario.setText("Tipo de Usuario/User type*");
        fondoPanel.add(placeholderTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 351, -1, 20));

        placeholderCivica.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        placeholderCivica.setText("Número de Cívica/Cívica Number");
        fondoPanel.add(placeholderCivica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        placeholderNombre.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        placeholderNombre.setText("Nombre/Name *");
        fondoPanel.add(placeholderNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        placeholderTipoID.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        placeholderTipoID.setText("Tipo de identificación / ID type *");
        fondoPanel.add(placeholderTipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 231, -1, 30));

        textNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textNombre.setBorder(null);
        fondoPanel.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, 20));

        textId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textId.setBorder(null);
        fondoPanel.add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 287, 140, 20));

        textNumCivica.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textNumCivica.setBorder(null);
        fondoPanel.add(textNumCivica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 130, 30));

        botonCrearCuenta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearCuenta.setText("Crear cuenta");
        botonCrearCuenta.setBorder(null);
        fondoPanel.add(botonCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 140, 20));

        comBoxTipoId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comBoxTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de ciudadanía ", "Cédula de extranjería", "Tarjeta de identidad" }));
        comBoxTipoId.setBorder(null);
        fondoPanel.add(comBoxTipoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 150, 20));

        comBoxTipoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario común", "Usuario administrador" }));
        comBoxTipoUsuario.setBorder(null);
        fondoPanel.add(comBoxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 150, 20));

        tengoCuenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tengoCuenta.setText("¿Tienes cuenta?");
        fondoPanel.add(tengoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondoRegistro.png"))); // NOI18N
        fondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    //Metodo para hacer el boton trasnparente con metodos que nos da java swing:)
    public void  transparenteBotonCrearCuenta (){
        botonCrearCuenta.setOpaque(false);
        botonCrearCuenta.setContentAreaFilled(false);
        botonCrearCuenta.setBorderPainted(false); 
    }
    
    
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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearCuenta;
    private javax.swing.JComboBox<String> comBoxTipoId;
    private javax.swing.JComboBox<String> comBoxTipoUsuario;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel placeholderCivica;
    private javax.swing.JLabel placeholderIdentificacion;
    private javax.swing.JLabel placeholderNombre;
    private javax.swing.JLabel placeholderTipoID;
    private javax.swing.JLabel placeholderTipoUsuario;
    private javax.swing.JLabel tengoCuenta;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNumCivica;
    // End of variables declaration//GEN-END:variables
}
