package controller;

import Conexion.conectar;
import Vistas.FormLogin;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.ConexionDefault;
import testdb.TestConnection;

/**
 *
 * @author JorgeLPR
 */
public class ControllerTestConnection implements ActionListener{
    
    private final TestConnection view;
    
    private Connection connect = null;
    private final ConexionDefault conexionDefault;
    
    public ControllerTestConnection(TestConnection view){
        this.view=view;
        conexionDefault = new ConexionDefault();
        events();
    }

    public final void events(){
        view.btnConnect.addActionListener(this);
        view.btnClose.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(view.btnConnect)){
        
            connect = conexionDefault.openConnection();
            if(connect != null){
                view.labelState.setForeground(Color.GREEN);                
                view.labelState.setText("En linea");
                
//                JOptionPane.showMessageDialog(null, "ESTA CONECTADO\nPuede usar el login");


                String texto = "<html><b>ESTAS CONECTADO</b><br><p>Puedes usar el login</p></html>";
                JLabel label = new JLabel(texto);
                label.setFont(new Font("", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(null, label); 
               
                
            }else{
                view.labelState.setForeground(Color.RED);                
                view.labelState.setText("Fuera de linea");
                
                JOptionPane.showMessageDialog(null, "Error de conexión","Mensaje", JOptionPane.WARNING_MESSAGE);
                
                /*
                String texto = "<html><b>Error de conexión</b></html>";
                JLabel label = new JLabel(texto);
                label.setFont(new Font("", Font.PLAIN, 12));
                JOptionPane.showMessageDialog(null, label, "Mensaje", JOptionPane.WARNING_MESSAGE); 
                */

                
            }
        
        }else if(evt.equals(view.btnClose)){
            if(connect!=null){
                if(conexionDefault.closeConnection(connect)){
                    view.labelState.setForeground(Color.RED);                
                    view.labelState.setText("Fuera de linea");                    
                }
            }
        }
    
    }
    
}
