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
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author cliente
 */
public class inicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form inicioSesion
     */
    public inicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Transparencia del textField de la identificación
        textId.setBackground(new java.awt.Color(0,0,0,1));
        
        transparenteBotonIniciarSesion();
        
       
        botonIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iniciarSesion();
            }
        });
        
        registro.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                registro otraPestana = new registro();
                otraPestana.setVisible(true);
                dispose();
            }
        });
        registroIngles.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                registro otraPestana = new registro();
                otraPestana.setVisible(true);
                dispose();
            }
        });
    }
    
    private void iniciarSesion(){
        //obtener los datos del usuario
        String tipoId = (String) comBoxTipoId.getSelectedItem();
        String numeroIdentificacion = textId.getText();
        
        //EL inicio de sesion
        if(validarInicioSesion(tipoId,numeroIdentificacion)){
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
            dispose();
            casita casita = new casita();
            casita.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Error: Tipo o número incorrectos");
        
        }
       
    }
    
    private boolean validarInicioSesion(String tipoId, String numeroIdentificacion){
        try(BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))){
            String linea;
                    while((linea = br.readLine()) != null){
                        String[] partes = linea.split(",");
                        
                        if(partes.length >= 3 && partes[1].equals(tipoId) && partes[2].equals(numeroIdentificacion)){
                            return true;
                        }
                    }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return false; // No se encontró el usuario
    }
    
    
    
    //Metodo para convertir el boton en transparente
    public void  transparenteBotonIniciarSesion(){
        botonIniciarSesion.setOpaque(false);
        botonIniciarSesion.setContentAreaFilled(false);
        botonIniciarSesion.setBorderPainted(false); 
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
        textId = new javax.swing.JTextField();
        botonIniciarSesion = new javax.swing.JButton();
        comBoxTipoId = new javax.swing.JComboBox<>();
        registro = new javax.swing.JLabel();
        registroIngles = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textId.setBorder(null);
        fondoPanel.add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 347, 110, 20));

        botonIniciarSesion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciarSesion.setText("Iniciar sesión");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });
        fondoPanel.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, 20));

        comBoxTipoId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comBoxTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de ciudadanía ", "Cédula de extranjería", "Tarjeta de identidad" }));
        fondoPanel.add(comBoxTipoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 110, 20));

        registro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        registro.setText("¿No tienes cuenta? Registrate");
        fondoPanel.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        registroIngles.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        registroIngles.setText("Don’t you have an account? Sign Up");
        fondoPanel.add(registroIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondoInicioSesion.png"))); // NOI18N
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

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JComboBox<String> comBoxTipoId;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel registro;
    private javax.swing.JLabel registroIngles;
    private javax.swing.JTextField textId;
    // End of variables declaration//GEN-END:variables
}
