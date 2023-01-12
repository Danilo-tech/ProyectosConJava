package Vistas;




import Conexion.conectar;
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
import javax.swing.table.TableColumn;












public class Sistema42 extends javax.swing.JFrame {
    
    


  
    public Sistema42() {
        initComponents();
        mostrardatos("");
        setLocationRelativeTo(null);
            
    }
    
   
    
    
       
    
    
    /*
    public static String Texto1 = ""; // esto pertenece a ventana 1 con static y es publico
    public static String Texto2 = ""; // esto pertenece a ventana 1 con static y es publico
    public static String Texto3 = ""; // esto pertenece a ventana 1 con static y es publico
    */
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        MenuItemModificar = new javax.swing.JMenuItem();
        MenuItemEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        txtDireccion = new LIB.JTexfieldPH_FielTex();
        btnAgregar = new javax.swing.JButton();
        txtNMedidor = new LIB.JTexfieldPH_FielTex();
        txtAyN = new LIB.JTexfieldPH_FielTex();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaGeneral = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        MenuItemModificar.setText("Modificar");
        MenuItemModificar.setComponentPopupMenu(jPopupMenu1);
        MenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuItemModificar);

        MenuItemEliminar.setText("Eliminar");
        MenuItemEliminar.setComponentPopupMenu(jPopupMenu1);
        MenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("gyygfi8");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.pink);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

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

        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(10, 144, 203));
        btnActualizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtDireccion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtDireccion.setOpaque(false);
        txtDireccion.setPlaceholder("Dirección");
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

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

        txtNMedidor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtNMedidor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtNMedidor.setOpaque(false);
        txtNMedidor.setPlaceholder("Número de medidor");
        txtNMedidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNMedidorActionPerformed(evt);
            }
        });

        txtAyN.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtAyN.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtAyN.setOpaque(false);
        txtAyN.setPlaceholder("Apellidos y Nombres");
        txtAyN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAyNActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DTECHINNOVA1.3.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CREADOPOR1.png"))); // NOI18N

        TablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaGeneral.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(TablaGeneral);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAyN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(480, 480, 480)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtNMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtAyN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    
    
    
    
    
    
    
    
    public static void mostrardatos(String valor){
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        
        DefaultTableModel modelo=new DefaultTableModel();
       
        modelo.addColumn("Numero de registro");
        modelo.addColumn("Numero de medidor");
        modelo.addColumn("Apellidos y Nombres");
        modelo.addColumn("e 2014");
        modelo.addColumn("f 2015");
        modelo.addColumn("M 2016");
        modelo.addColumn("A 2017");
        modelo.addColumn("M 2018");
        modelo.addColumn("JU 2019");
        modelo.addColumn("JUL 2019");
        modelo.addColumn("AG 2020");
        modelo.addColumn("SE 2021");
         modelo.addColumn("OC 2021");
          modelo.addColumn("NO 2021");
      modelo.addColumn("DI 2021");
            modelo.addColumn("TO 2021");
       
        
        
                  
            
            
            
        TablaGeneral.setModel(modelo);
        TablaGeneral.getColumnModel().getColumn(0).setMaxWidth(120); //Maximo tamaño editable de la columna 1
        TablaGeneral.getColumnModel().getColumn(0).setPreferredWidth(50); // Tamaño predeterminado que aparecerá al ejecutar el programa de la columna 1
        TablaGeneral.getColumnModel().getColumn(0).setMinWidth(50); //Minimo tamaño editable de la columna de la columna 1
        TablaGeneral.getColumnModel().getColumn(1).setMaxWidth(130); 
        TablaGeneral.getColumnModel().getColumn(1).setPreferredWidth(50); 
        TablaGeneral.getColumnModel().getColumn(1).setMinWidth(50); 
        TablaGeneral.getColumnModel().getColumn(2).setMaxWidth(200); 
        TablaGeneral.getColumnModel().getColumn(2).setPreferredWidth(150); 
        TablaGeneral.getColumnModel().getColumn(2).setMinWidth(150); 
        TablaGeneral.getColumnModel().getColumn(3).setMaxWidth(200); 
        TablaGeneral.getColumnModel().getColumn(3).setPreferredWidth(150); 
        TablaGeneral.getColumnModel().getColumn(3).setMinWidth(150); 
        
        TablaGeneral.getColumnModel().getColumn(4).setWidth(0); 
        TablaGeneral.getColumnModel().getColumn(4).setMinWidth(0); 
        TablaGeneral.getColumnModel().getColumn(4).setMaxWidth(0); 
        TablaGeneral.getColumnModel().getColumn(5).setWidth(0); 
        TablaGeneral.getColumnModel().getColumn(5).setMinWidth(0); 
        TablaGeneral.getColumnModel().getColumn(5).setMaxWidth(0); 
        TablaGeneral.getColumnModel().getColumn(6).setWidth(0); 
        TablaGeneral.getColumnModel().getColumn(6).setMinWidth(0); 
        TablaGeneral.getColumnModel().getColumn(6).setMaxWidth(0); 
        TablaGeneral.getColumnModel().getColumn(7).setWidth(0); 
        TablaGeneral.getColumnModel().getColumn(7).setMinWidth(0); 
        TablaGeneral.getColumnModel().getColumn(7).setMaxWidth(0); 
        TablaGeneral.getColumnModel().getColumn(8).setWidth(0); 
        TablaGeneral.getColumnModel().getColumn(8).setMinWidth(0); 
        TablaGeneral.getColumnModel().getColumn(8).setMaxWidth(0); 
        TablaGeneral.getColumnModel().getColumn(9).setWidth(0); 
        TablaGeneral.getColumnModel().getColumn(9).setMinWidth(0); 
        TablaGeneral.getColumnModel().getColumn(9).setMaxWidth(0); 
        TablaGeneral.getColumnModel().getColumn(10).setWidth(0); 
        TablaGeneral.getColumnModel().getColumn(10).setMinWidth(0); 
        TablaGeneral.getColumnModel().getColumn(10).setMaxWidth(0); 
        TablaGeneral.getColumnModel().getColumn(11).setWidth(0); 
        TablaGeneral.getColumnModel().getColumn(11).setMinWidth(0); 
        TablaGeneral.getColumnModel().getColumn(11).setMaxWidth(0); 
        TablaGeneral.getColumnModel().getColumn(12).setWidth(0); 
        TablaGeneral.getColumnModel().getColumn(12).setMinWidth(0); 
        TablaGeneral.getColumnModel().getColumn(12).setMaxWidth(0);
        
        
        
        
        
        
        
        
        String sql="";
        
        if (valor.equals(""))
        {
            sql="SELECT * FROM padronesprueba";
        }
        else{
            sql="SELECT * FROM padronesprueba WHERE n_registro LIKE '%"+valor+"%' OR n_medidor LIKE '%"+valor+"%' OR ApellidosyNombres LIKE '%"+valor+"%' OR t_2014 LIKE '%"+valor+"%' OR fe_2014 LIKE '%"+valor+"%' OR ma_2014 LIKE '%"+valor+"%' OR ab_2014 LIKE '%"+valor+"%' OR may_2014 LIKE '%"+valor+"%' OR jun_2014 LIKE '%"+valor+"%' OR jul_2014 LIKE '%"+valor+"%' OR ago_2014 LIKE '%"+valor+"%' OR sep_2014 LIKE '%"+valor+"%' OR oct_2014 LIKE '%"+valor+"%' OR nov_2014 LIKE '%"+valor+"%' OR dic_2014 LIKE '%"+valor+"%' OR t_2014 LIKE '%"+valor+"%'";
        }  
        
        
        
        
        String []datos=new String [16];
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            
            datos[3]=rs.getString(4);
            datos[4]=rs.getString(5);
            datos[5]=rs.getString(6);
            datos[6]=rs.getString(7);
            datos[7]=rs.getString(8);
            datos[8]=rs.getString(9);
            datos[9]=rs.getString(10);
            datos[10]=rs.getString(11);
            datos[11]=rs.getString(12);
            datos[12]=rs.getString(13);
            datos[13]=rs.getString(14);
            datos[14]=rs.getString(15);
            datos[15]=rs.getString(16);
            
            
            
            modelo.addRow(datos);
            
            
            }
            
//            TablaGeneral.setModel(modelo);
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
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        conectar cc=new conectar();
        Connection cn=cc.conexion();
        try{
            PreparedStatement pst=cn.prepareStatement("UPDATE padrones01 SET Direccion='"+txtDireccion.getText()+"',ApellidosyNombres='"+txtAyN.getText()+"',NumerodeMedidor='"+txtNMedidor.getText()+"' WHERE NumerodeMedidor='"+NumerodeMedidor+"' ");
            NumerodeMedidor=txtNMedidor.getText();
            pst.executeUpdate();
            mostrardatos("");
            JOptionPane.showMessageDialog(null, "Información Actualizada");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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

    private void MenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemModificarActionPerformed

       
    int fila=TablaGeneral.getSelectedRow();
    
 
      
     
    
    
    if(fila>=0){
    txtNMedidor.setText(TablaGeneral.getValueAt(fila,0).toString());
    txtAyN.setText(TablaGeneral.getValueAt(fila,1).toString());
    txtDireccion.setText(TablaGeneral.getValueAt(fila,2).toString());
    NumerodeMedidor = TablaGeneral.getValueAt(fila,0).toString();
    /*
    Texto1= txtNMedidor.getText();//obtener el texto de la caja medidor
    Texto2= txtAyN.getText();//obtener el texto de la caja medidor
    Texto3= txtDireccion.getText();//obtener el texto de la caja medidor
    */
    }
    else{
        JOptionPane.showMessageDialog(null,"No se encontro fila");
    }
     /*
        ValoresGeneral nj = new ValoresGeneral();
    nj.setVisible(true);
   
        mostrardatos("");
    */
    //    this.dispose();
    
    }//GEN-LAST:event_MenuItemModificarActionPerformed

    private void MenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEliminarActionPerformed
        
//conectar cc=new conectar();
//Connection cn=cc.conexion();
//int fila=TablaGeneral.getSelectedRow();
//String cod="";
//cod=TablaGeneral.getValueAt(fila,0).toString();
//try{
//PreparedStatement pst=cn.prepareStatement("DELETE FROM padrones01 WHERE NumerodeMedidor='"+cod+"'");
//pst.executeUpdate();
//mostrardatos("");// TODO add your handling code here:
//} catch (Exception e){
//}  
//int q1 = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar?","hhmmm",JOptionPane.YES_NO_OPTION);

int q1 = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar?","hhmmm",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
if (q1 == 0){
JOptionPane.showMessageDialog(null, "esta es la opcion 0","asd",JOptionPane.WARNING_MESSAGE);
}
if (q1 == 1){
JOptionPane.showMessageDialog(null, "esta es la opcion 1");
}
if (q1 == 2){
JOptionPane.showMessageDialog(null, "esta es la opcion 2");
}


    }//GEN-LAST:event_MenuItemEliminarActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Sistema42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema42().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemEliminar;
    private javax.swing.JMenuItem MenuItemModificar;
    public static javax.swing.JTable TablaGeneral;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    public LIB.JTexfieldPH_FielTex txtAyN;
    private javax.swing.JTextField txtBuscar;
    public LIB.JTexfieldPH_FielTex txtDireccion;
    public LIB.JTexfieldPH_FielTex txtNMedidor;
    // End of variables declaration//GEN-END:variables

   
    
    
    private static class datos {
    
        public datos() {
        }
    }
    

}
