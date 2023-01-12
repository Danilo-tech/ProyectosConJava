/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0000javaaplication.segundo;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class segundo extends JFrame
{
JLabel j;

public segundo()
{
setLayout (new FlowLayout());
j=new JLabel("Hola Mundo mi nombre es danilo");
add(j);
this.setSize(250,120);
this.setLocation(200,200);
}
public static void main(String[] args)
{
// TODO co hola i=new hola();
segundo i=new segundo();
i.setVisible(true);
}
}
/**
 *
 * @author Danilo
 */
