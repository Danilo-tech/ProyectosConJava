/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;



import FiveCodMover.FiveCodMoverJFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.*;
import java.net.URI;
import java.util.prefs.Preferences;

/**
/**
 *
 * @author Danilo
 */


public class Sistema3 extends javax.swing.JFrame {

    /**
     * Creates new form Sistema3
     */
    public Sistema3() {
        initComponents();
        mostrardatos("");
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        txtDireccion = new LIB.JTexfieldPH_FielTex();
        btnAgregar = new javax.swing.JButton();
        txtNMedidor = new LIB.JTexfieldPH_FielTex();
        txtAyN = new LIB.JTexfieldPH_FielTex();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("gyygfi8");
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.pink);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrar.setBackground(new java.awt.Color(10, 144, 203));
        btnMostrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("mostrar");
        btnMostrar.setMaximumSize(new java.awt.Dimension(103, 31));
        btnMostrar.setMinimumSize(new java.awt.Dimension(103, 31));
        btnMostrar.setPreferredSize(new java.awt.Dimension(103, 31));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 110, 40));

        btnBuscar.setBackground(new java.awt.Color(10, 144, 203));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setMaximumSize(new java.awt.Dimension(103, 31));
        btnBuscar.setMinimumSize(new java.awt.Dimension(103, 31));
        btnBuscar.setPreferredSize(new java.awt.Dimension(103, 31));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, 40));

        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 230, 40));

        btnModificar.setBackground(new java.awt.Color(10, 144, 203));
        btnModificar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 110, 40));

        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtDireccion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtDireccion.setOpaque(false);
        txtDireccion.setPlaceholder("Dirección");
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(10, 144, 203));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setMaximumSize(new java.awt.Dimension(103, 31));
        btnAgregar.setMinimumSize(new java.awt.Dimension(103, 31));
        btnAgregar.setPreferredSize(new java.awt.Dimension(103, 31));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 110, 40));

        txtNMedidor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtNMedidor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtNMedidor.setOpaque(false);
        txtNMedidor.setPlaceholder("Número de medidor");
        txtNMedidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNMedidorActionPerformed(evt);
            }
        });
        jPanel1.add(txtNMedidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtAyN.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtAyN.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtAyN.setOpaque(false);
        txtAyN.setPlaceholder("Apellidos y Nombres");
        txtAyN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAyNActionPerformed(evt);
            }
        });
        jPanel1.add(txtAyN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DTECHINNOVA1.3.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CREADOPOR1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1000, 280));

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void mostrardatos(String valor){
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        DefaultTableModel modelo=new DefaultTableModel();
       
        modelo.addColumn("Numero de medidor");
        modelo.addColumn("Apellidos y Nombres");
        modelo.addColumn("Dirección");
          
        jTable1.setModel(modelo);
        String sql="";
        if (valor.equals(""))
        {
            sql="SELECT * FROM padrones01";
        }
        else{
            sql="SELECT * FROM padrones01 WHERE NumerodeMedidor LIKE '%"+valor+"%' OR ApellidosyNombres LIKE '%"+valor+"%' OR Direccion LIKE '%"+valor+"%' ";
        }  
        
        String []datos=new String [3];
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            
            modelo.addRow(datos);
            }
            jTable1.setModel(modelo);
        }catch(SQLException ex){
            Logger.getLogger(datos.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrardatos(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    String NumerodeMedidor= "";
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        try{
            PreparedStatement pst=cn.prepareStatement("UPDATE padrones01 SET Direccion='"+txtDireccion.getText()+"',ApellidosyNombres='"+txtAyN.getText()+"',NumerodeMedidor='"+txtNMedidor.getText()+"' WHERE NumerodeMedidor='"+NumerodeMedidor+"' ");
            NumerodeMedidor=txtNMedidor.getText();
            pst.executeUpdate();

            mostrardatos("");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        try{
            PreparedStatement pst=cn.prepareStatement("INSERT INTO padrones01 (NumerodeMedidor,ApellidosyNombres,Direccion) VALUES(?,?,?)");
            pst.setString(1,txtNMedidor.getText());
            pst.setString(2,txtAyN.getText());
            pst.setString(3,txtDireccion.getText());
            

            int a=pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null,"Registro exitoso");
                mostrardatos("");
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al agregar");
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNMedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNMedidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNMedidorActionPerformed

    private void txtAyNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAyNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAyNActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        // PARA ENLAZAR JLABEL CON UN LINK

        try {
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE)){

                    desktop.browse(new URI ("https://wa.me/+51928583538?text=Hola%20me%20presento%20ante%20Ud.%0ANecesito%20de%20su%20servicio."));

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        int fila=jTable1.getSelectedRow();
        String cod="";
        cod=jTable1.getValueAt(fila,0).toString();
        try{
            PreparedStatement pst=cn.prepareStatement("DELETE FROM padrones01 WHERE NumerodeMedidor='"+cod+"'");
            pst.executeUpdate();
            mostrardatos("");// TODO add your handling code here:
        } catch (Exception e){
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila=jTable1.getSelectedRow();
        if(fila>=0){
            txtNMedidor.setText(jTable1.getValueAt(fila,0).toString());
            txtAyN.setText(jTable1.getValueAt(fila,1).toString());
            txtDireccion.setText(jTable1.getValueAt(fila,2).toString());
            NumerodeMedidor = jTable1.getValueAt(fila,0).toString();

        }
        else{
            JOptionPane.showMessageDialog(null,"No se encontro fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private LIB.JTexfieldPH_FielTex txtAyN;
    private javax.swing.JTextField txtBuscar;
    private LIB.JTexfieldPH_FielTex txtDireccion;
    private LIB.JTexfieldPH_FielTex txtNMedidor;
    // End of variables declaration//GEN-END:variables

    /*
    // USUARIO DE BASE DE DATOS LLAMAR
    conectar mysql = new conectar();
    Connection cn = mysql.Connectar();
    */
    
    
    private static class datos {
    
        public datos() {
        }
    }

}
