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
import javax.swing.JOptionPane;

/**
 *
 * @author cliente
 */
public class inicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form inicioSesion
     */
    
    //------------------------------------------------------------------------------
    //-----------------------------CLASE DE INICIO DE SESIÓN-----------------------
    public inicioSesion() {
        //dentro de esta clase inicioSesion, se crean automaticamente el codigo de creación
        //de los componentes (elementos arrastrables)
        //el initComponents es el encargado de crear los componentes
        //si copiamos y pegamos el codigo en otro lado podremos ver la inicialización de 
        //los componentes (elementos arrastrables)
        initComponents();
        //-----------------------------------------------------------------------------
        //con el this indicamos que este Recomendaciones() (metodo) use otro metodo que se encarga 
        //de la locación de la clase Recomendaciones (pestaña) y se encuentre en null
        this.setLocationRelativeTo(null);
        //-----------------------------------------------------------------------------
       //--------------------------EXPLICACIÓN-------------------------------------------
       //Hacemos llamado del componente textId (cajón de texto), con ayuda del metodo
       //setBackground (cambio de color de fondo), creamos una nueva instanciación 
       //del metodo Color con sus corresponientes atributos (Color transparente)
       //-----------------------------------------------------------------------------
        //Transparencia del textField de la identificación
        textId.setBackground(new java.awt.Color(0,0,0,1));
        
        //-----------------------------------------------------------------------------
       //--------------------------EXPLICACIÓN-------------------------------------------
       //Hacemos llamado del metodo creado, el cual se basa en indicarle a todos los componentes
       //del componente Botón que se deshabiliten. El componente botón se llama botonIniciarSesion. 
       //A ese componente es al que le hacemos los cambios
        transparenteBotonIniciarSesion();
        
       //-----------------------------------------------------------------------------
       //--------------------------EXPLICACIÓN-------------------------------------------
       //botonIniciarSesion hace referencia al componente de la interfaz 
       //que se le agreagrá una acción, la cual se encuentra dentro de la
       //función. Se redirigirá al metodo iniciarSesion();
        botonIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Hacemos llamado del metodo creado.
                iniciarSesion();
            }
        });
        //-----------------------------------------------------------------------------
       //--------------------------EXPLICACIÓN-------------------------------------------
       //registro hace referencia al componente de la interfaz cuando 
       //escuche un evento del mouse, un clic haremos que 
        //se ejecute el metodo del 'nuevo objeto MouseAdapter'
        registro.addMouseListener(new MouseAdapter() {
            //En el metodo se le indica lo siguiente: cree una variable de tipo 'registro',
            //el cual es una clase, y en ella almacenará un objeto de la clase registro.
            //Luego con el metodo setVisible le indicamos que sea modificada a el valor True, 
            //o sea, que se muestre
            public void mouseClicked(MouseEvent e) {
                // ----------------Hacer visible la otra pestaña----------------
                registro otraPestana = new registro();
                otraPestana.setVisible(true);
                //y con el metodo dispose nos ayuda a deshabilitar la anterior pestaña                
                dispose();
            }
        });
        //-----------------------------------------------------------------------------
       //--------------------------EXPLICACIÓN-------------------------------------------
        registroIngles.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Hacer visible la otra pestaña
                registro otraPestana = new registro();
                otraPestana.setVisible(true);
                dispose();
            }
        });
    }
    
    //-----------------------------------------------------------------------------------
    //-------------------------------METODOS USADOS--------------------------------------
    //-----------------------------------------------------------------------------
    
    //--------------Metodo para convertir el boton en transparente--------------------
    //--------------------------EXPLICACIÓN-------------------------------------------
    //esta funcion se encarga de hacer la modificación los metodos sets de cada 
    //una de las caracteristicas del componente, el cual es el boton de inicio
    //----------------------proposito visual----------------------------
    public void  transparenteBotonIniciarSesion(){
        botonIniciarSesion.setOpaque(false);
        botonIniciarSesion.setContentAreaFilled(false);
        botonIniciarSesion.setBorderPainted(false); 
    }
    
    //-----------------------------------------------------------------------------
    //--------------------Metodo para redireccionar si datos correctos--------------------------------------------
    //--------------------------EXPLICACIÓN-------------------------------------------
    private void iniciarSesion(){
        
        //Obtenemos los datos del usuario atraves de los metodos get... y sus nombres corresponientes
        //a los componentes. Serán almacenados en variables de tipo String porque eso 
        //es lo que debe de introducir el usuario.
        String tipoId = (String) comBoxTipoId.getSelectedItem();
        String numeroIdentificacion = textId.getText();
//-----------------------------------------------------------------------------        
        //Con la estructura condicional verificaremos los datos ingresados por el usuario
        //hacemos llamado de otra funcion la cual se encarga de validar la información
        //ingresada por el usuario. Si la funcion retorna TRUE es porque si existe en 
        //la base de datos, sino se mostrará un mensaje de error. 
        if(validarInicioSesion(tipoId,numeroIdentificacion)){
            
        //-------------------------------------------------------------
            
            //Mensaje de exito
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
            //cierre de pestaña
            dispose();
            //Habilitar visibilidad de la siguiente pestaña
            casita casita = new casita();
            casita.setVisible(true);
            
        }else{
            //Sino mensaje de error
            JOptionPane.showMessageDialog(null, "Error: Tipo o número incorrectos");
        
        }
       
    }
    //-----------------------------------------------------------------------------
    //--------------------Metodo para validar datos correctos--------------------------------------------
    //--------------------------EXPLICACIÓN-------------------------------------------
    //Se crea una función la cual será usada en la función iniciarSesión, esta recibirá
    //dos paramatros, el tipo de documento y el numero de identificación
    public boolean validarInicioSesion(String tipoId, String numeroIdentificacion){
        
        //se crea una variable de tipo BufferedReader que contendrá un 
        //objeto de tipo BufferedReader, dentro de otro objeto que ayudará 
        //a leer el archivo indicado, ambos son para leer el documento, pero
        //usar ambos es más eficiente. 
        //-----------------------------------------------------------------------------
        try(BufferedReader leer = new BufferedReader(new FileReader("usuarios.txt"))){
            
            String linea;
            
            //usamos el ciclo while con la condición siguiente: 
            //con la variable leer y su metodo readLine estamos leyendo una linea del documento
            //todo eso será asignado a la variable linea, leer.readLine puede
            //devolver una linea de String o devolver un valor null si está vacio
            //La condición es que, si linea es un valor DIFERENTE a null puede pasar, o sea
            //si es de valor String.
                    while((linea = leer.readLine()) != null){
                        //Se crea un array de tipo String para almacenar la información 
                        //que se extraiga con el metodo split, el cual lo que hace es 
                        //recolectar una linea de String y lo separa segun su parametro
                        //en este caso es con ",", ya que en el registro de datos
                        //los valores de los usuario son divididos con este
                        String[] partes = linea.split(",");
                        
                        //Creamos un condicional el cual validará que la información sea correcta
                        //el tamaño del arreglo "partes" debe ser mayor o igual a 3 porque debe de verificar
                        //que existan los campos a los cuales vamos acceder
                        //Siguiente condición:
                        //que el arreglo en la posición uno (donde se alamcenan los tipos de identificación) sea
                        //igual a lo que haya ingresado el usuario en las cajas de texto, y que fueron pasadas
                        //como parametros.
                        //Siguiente condición: 
                        //Lo mismo que lo anterior. 
                        if(partes.length >= 3 && partes[1].equals(tipoId) && partes[2].equals(numeroIdentificacion)){
                            //Si ingresa a este if es porque el usuario inicio sesión bien
                            //se acaba la funcion por el return y devuelve el true;
                            return true;
                        }
                    }
        //Si se llega a encontrar algún error en la ejecución, se mostrará el error encontrado y 
        //se retornará el valor false, indicando que el usuario no fue encontrado y con esto 
        //no podrá entrar al if en la función iniciarSesion, y no será redirigido a la pestaña
        //de casita. 
        }catch(IOException ex){
            ex.printStackTrace();
         }
        return false; // No se encontró el usuario
    }
    
    
    
    
    
//-----------------------------------------------------------------------------------------------------------
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
