package Barras;

import java.awt.Color;
import java.awt.Graphics;

public class Barras extends javax.swing.JFrame {

    public Barras() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    boolean bandera = false;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelRojo = new javax.swing.JLabel();
        labelVerde = new javax.swing.JLabel();
        labelAzul = new javax.swing.JLabel();
        txtRojo = new javax.swing.JTextField();
        txtVerde = new javax.swing.JTextField();
        txtAzul = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Color Favorito");

        labelRojo.setText("Rojo:");

        labelVerde.setText("Verde:");

        labelAzul.setText("Azul:");

        txtRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRojoActionPerformed(evt);
            }
        });

        txtAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAzulActionPerformed(evt);
            }
        });

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRojo)
                    .addComponent(labelAzul)
                    .addComponent(labelVerde))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVerde)
                    .addComponent(txtRojo)
                    .addComponent(txtAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRojo)
                    .addComponent(txtRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVerde)
                            .addComponent(txtVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAzul))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRojoActionPerformed

    private void txtAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAzulActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bandera = true;
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAzul;
    private javax.swing.JLabel labelRojo;
    private javax.swing.JLabel labelVerde;
    private javax.swing.JTextField txtAzul;
    private javax.swing.JTextField txtRojo;
    private javax.swing.JTextField txtVerde;
    // End of variables declaration//GEN-END:variables


    public int mayorValor(int valorRojo,int valorVerde,int valorAzul){
        if(valorRojo > valorVerde && valorRojo > valorAzul){
            return valorRojo;
       
        }else if(valorVerde > valorAzul){
            return valorVerde;
            
        }else{ 
            return valorAzul;
        }
       
    }
    
    public void paint(Graphics g){
       super.paint(g);
       
       if(bandera == true){
           String rojo = txtRojo.getText();
           String verde = txtVerde.getText();
           String azul = txtAzul.getText();
           
           int castingRojo = Integer.parseInt(rojo);
           int castingVerde = Integer.parseInt(verde);
           int castingAzul = Integer.parseInt(azul);
           
           int valorMayor = mayorValor(castingRojo,castingVerde,castingAzul);
           
           int largoRojo = castingRojo * 400 / valorMayor;
           int largoVerde = castingVerde * 400 / valorMayor;
           int largoAzul = castingAzul * 400 / valorMayor;
           
           g.setColor(new Color(255,0,0));
           g.fillRect(100, 100, largoRojo, 40);
           g.drawString("Color Rojo", 10, 125);
           
           g.setColor(new Color(0,130,0));
           g.fillRect(100, 150, largoVerde, 40);
           g.drawString("Color Verde", 10, 175);
           
           g.setColor(new Color(0,0,160));
           g.fillRect(100, 200, largoAzul, 40);
           g.drawString("Color Azul", 10, 225);
           
       }
       
    }
    
}
