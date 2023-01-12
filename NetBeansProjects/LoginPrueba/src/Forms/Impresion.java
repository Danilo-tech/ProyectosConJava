/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Print;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 *
 * @author Danilo
 */
public class Impresion extends javax.swing.JPanel implements Printable {

    /**
     * Creates new form Impresion
     */
    public Impresion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNMedidor = new LIB.JTexfieldPH_FielTex();
        txtAyN = new LIB.JTexfieldPH_FielTex();
        txtDireccion = new LIB.JTexfieldPH_FielTex();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("COMO IMPRIMIR");

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

        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtDireccion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtDireccion.setOpaque(false);
        txtDireccion.setPlaceholder("Dirección");
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAyN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(txtNMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtAyN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNMedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNMedidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNMedidorActionPerformed

    private void txtAyNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAyNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAyNActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private LIB.JTexfieldPH_FielTex txtAyN;
    private LIB.JTexfieldPH_FielTex txtDireccion;
    private LIB.JTexfieldPH_FielTex txtNMedidor;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pf, int pageIndex) throws PrinterException {
       if(pageIndex==0){
           Graphics2D graphics2d=(Graphics2D) graphics;
           graphics2d.translate(pf.getImageableX(), pf.getImageableY());
           printAll(graphics2d);
       return PAGE_EXISTS;
       }else{
       
       return NO_SUCH_PAGE;
       }
        
    }
}