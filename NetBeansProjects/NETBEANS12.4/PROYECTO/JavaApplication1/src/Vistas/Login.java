package Vistas;





import Conexion.conectar;
import java.awt.*;
import javax.swing.*;
import FiveCodMover.FiveCodMoverJFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
//CAMBIAR COLOR DE FONDO JOPTIONPANE
import javax.swing.UIManager;








public class Login extends javax.swing.JFrame {

 private Component confirmation;
 public String usuario,password;
    
 public String c1,c2;   
    
UIManager UI=new UIManager();    
    
    
    public Login() {
        initComponents();
        
        txtUser.setFocusable(true);
        
           
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtUser = new LIB.JTexfieldPH_FielTex();
        jPanel6 = new javax.swing.JPanel();
        txtPass = new LIB.JTexfieldPH_Password();
        jLabel5 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(10, 144, 203));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(10, 144, 203));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INICIO DE SESIÓN");
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 370, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 60));

        jPanel4.setBackground(new java.awt.Color(205, 205, 205));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 370, 20));

        jLabel1.setBackground(new java.awt.Color(10, 144, 203));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/3592827-access-general-house-key-key-lock-key-login-office_132322.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, 60));

        jLabel2.setBackground(new java.awt.Color(10, 144, 203));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/3592855-business-man-employee-general-human-membe3333335.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 60));

        jPanel5.setBackground(new java.awt.Color(230, 230, 230));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(230, 230, 230));
        txtUser.setBorder(null);
        txtUser.setForeground(new java.awt.Color(10, 144, 203));
        txtUser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtUser.setOpaque(false);
        txtUser.setPhColor(new java.awt.Color(10, 144, 203));
        txtUser.setPlaceholder("Username:");
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel5.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 60));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 240, 60));

        jPanel6.setBackground(new java.awt.Color(230, 230, 230));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass.setBackground(new java.awt.Color(230, 230, 230));
        txtPass.setBorder(null);
        txtPass.setForeground(new java.awt.Color(10, 144, 203));
        txtPass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtPass.setPhColor(new java.awt.Color(10, 144, 203));
        txtPass.setPlaceholder("Password:");
        jPanel6.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 60));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 240, 60));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1491313931-cross_82985.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 30, 30));

        btnLogin.setBackground(new java.awt.Color(10, 144, 203));
        btnLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 320, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void datos (String us, String pas){
    usuario= "Admin";
    password="admin";
    }  
    
    
    
    
    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        //USUARIO DE BASE DE DATOS BOTON LOGIN

        String c1,c2; //variables que obtendran los datos
        String DatoCapturado = ""; // esto capturara el id de usuario que tendran los usuarios registrados
        c1 = txtUser.getText(); // obtener dato de la caja usuario
        c2 = new String (txtPass.getPassword()); // obetener dato de la caja contraseña

        String sql = "SELECT * FROM login WHERE nick ='"+c1+"' AND password='"+c2+"'" ; //sentencia sql
        // seleccionar todos los datos de la tabla logusuario donde logusuario sea igual a lo que mandemos de la caja usuario
        // y password de la caja contraseña

        try {//un ttry para interceptar errores si es que los hubiese
            Statement st = cn.createStatement(); // creamos el objeto st de tipo statement
            ResultSet rs= st.executeQuery(sql);// ejecutamos la sentencia sql
            // y estos resultados se van a almacenar en el objeto rs

            while(rs.next())// se hace un dezplazamiento por los registros en busca
            //del dato a capturar en este caso el id_ususario
            {
                DatoCapturado = rs.getString("n_registro"); //capturamos el id del usuario que hemos mandado en la sentencia sql
            }

            if (DatoCapturado.equals("")) // si el campo esta vacio quiere decir que no esta registrado
            {
                //mensaje de error
                JOptionPane.showMessageDialog(null,"Usuario y/o Contraseña no válidos\nIngrese nuevamente.","Error al iniciar", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                //entonces le pido que me lleve a la ventana de bienvenida
                FormLogin11 entrar = new FormLogin11();
                entrar.setVisible(true);
                dispose();
            }

        }catch(Exception e)
        {
            // en caso de un error imprimir el error en la consola de netbeans
            System.out.println(e.getMessage());

        }

        //usaremos el boton login para entrar
        datos(usuario, password);
        if(usuario.equals(txtUser.getText()) && password.equals(txtPass.getText())){
            FormLogin11 st = new FormLogin11();
            st.setVisible(true);
            /*aclarar que this.dispose(); sirve para que al momento
            de logearse , la ventana de login se cierra dandole
            el paso a la ventana solicitada en este caso es sistema
            */
            this.dispose();

        }

        else if(txtUser.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Usuario está vacio\nIngréselo por favor.","Mensaje", JOptionPane.WARNING_MESSAGE);
            txtUser.setFocusable(true);
        }if(txtPass.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Contraseña está vacio\nIngréselo por favor.","Mensaje", JOptionPane.WARNING_MESSAGE);
            txtPass.setFocusable(true);
        }

        else if(txtUser.getText().compareTo(usuario)!=0 && txtUser.getText().compareTo(c1)!=0){
            JOptionPane.showMessageDialog(this,"Usuario no válido\nIngrese nuevamente.");
            txtUser.setFocusable(true);
        }else if(txtPass.getText().compareTo(password)!=0 && txtPass.getText().compareTo(c2)!=0){
            JOptionPane.showMessageDialog(this,"Contraseña no válida\nIngrese nuevamente.");
            txtPass.setFocusable(true);
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_jPanel2MousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private LIB.JTexfieldPH_Password txtPass;
    private LIB.JTexfieldPH_FielTex txtUser;
    // End of variables declaration//GEN-END:variables

conectar mysql = new conectar();
Connection cn = mysql.Connectar();


}
