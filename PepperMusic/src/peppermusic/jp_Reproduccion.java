/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author orlando
 */
public class jp_Reproduccion extends javax.swing.JPanel {
    
    /**
     * Creates new form jp_Reproduccion
     */
    jp_Canciones canc;
    Clase_Progreso Barra;
    public jp_Reproduccion(jp_Canciones can) {
        initComponents();
        canc =can;
        
        
        START.setSelected(true);
        Barra = new Clase_Progreso(jp_Progreso,this);
        Barra.start();
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtb_agrandar = new javax.swing.JToggleButton();
        karaoke = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        START = new peppermusic.CustomButton();
        jp_Progreso = new peppermusic.CustomPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(null);

        jtb_agrandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_agrandar.png"))); // NOI18N
        jtb_agrandar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_pequeño.png"))); // NOI18N
        jtb_agrandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_agrandarActionPerformed(evt);
            }
        });
        add(jtb_agrandar);
        jtb_agrandar.setBounds(276, 130, 20, 20);

        karaoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/karaoke.png"))); // NOI18N
        karaoke.setBorder(null);
        karaoke.setBorderPainted(false);
        karaoke.setContentAreaFilled(false);
        karaoke.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/barramusical.png"))); // NOI18N
        karaoke.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                karaokeStateChanged(evt);
            }
        });
        karaoke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karaokeMouseClicked(evt);
            }
        });
        karaoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karaokeActionPerformed(evt);
            }
        });
        add(karaoke);
        karaoke.setBounds(260, 210, 27, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_avanzar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_avanzar2.png"))); // NOI18N
        add(jButton1);
        jButton1.setBounds(225, 108, 30, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_retroceder.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_retroceder2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(145, 108, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/queen_ii.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(40, 60, 65, 65);

        START.setBorder(null);
        START.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_start.png"))); // NOI18N
        START.setBorderPainted(false);
        START.setContentAreaFilled(false);
        START.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_star2.png"))); // NOI18N
        START.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_stop2.png"))); // NOI18N
        START.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_stop.png"))); // NOI18N
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });
        add(START);
        START.setBounds(172, 52, 56, 56);

        jp_Progreso.setOpaque(false);
        jp_Progreso.setLayout(null);
        add(jp_Progreso);
        jp_Progreso.setBounds(160, 40, 80, 80);

        jLabel4.setText("Bohemian Rhapsody");
        add(jLabel4);
        jLabel4.setBounds(28, 40, 130, 20);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Barra Nie.png"))); // NOI18N
        jLabel3.setToolTipText("");
        add(jLabel3);
        jLabel3.setBounds(30, 160, 230, 140);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Repro.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 336);
    }// </editor-fold>//GEN-END:initComponents

    private void karaokeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_karaokeStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_karaokeStateChanged

    private void karaokeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karaokeMouseClicked

    }//GEN-LAST:event_karaokeMouseClicked

    private void karaokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karaokeActionPerformed
        if(karaoke.isSelected()){

           jLabel3.setIcon(new ImageIcon( getClass().getResource("/Recursos/imagen_letras.png")));
            jLabel3.repaint();
            jLabel3.revalidate();
        }else{
            jLabel3.setIcon(new ImageIcon( getClass().getResource("/Recursos/Barra Nie.png")));
            jLabel3.repaint();
            jLabel3.revalidate();
        }

    }//GEN-LAST:event_karaokeActionPerformed

    private void jtb_agrandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_agrandarActionPerformed
        // TODO add your handling code here:
        if(jtb_agrandar.isSelected()){
            
            canc.venta.setSize(300, 168);
            Shape forma = new RoundRectangle2D.Double(0,0,canc.venta.getBounds().width,canc.venta.getBounds().height,110,110);
        AWTUtilities.setWindowShape(canc.venta, forma);
        jLabel1.setIcon(new ImageIcon( getClass().getResource("/Recursos/fondo_mini.png")));
        
        jLabel1.setSize(300,168);
            jLabel1.repaint();
            canc.jtb_lista.setEnabled(false);
            jLabel1.revalidate();
        
        }else{
            canc.venta.setSize(300, 336);
            Shape forma = new RoundRectangle2D.Double(0,0,canc.venta.getBounds().width,canc.venta.getBounds().height,125,125);
        AWTUtilities.setWindowShape(canc.venta, forma);
         jLabel1.setIcon(new ImageIcon( getClass().getResource("/Recursos/Fondo_Repro.png")));
         jLabel1.setLocation(0, 0);
         jLabel1.setSize(300,336);
            jLabel1.repaint();
            canc.jtb_lista.setEnabled(true);
            jLabel1.revalidate();
        }
        
    }//GEN-LAST:event_jtb_agrandarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
        // TODO add your handling code here:
        if(!START.isSelected()){
            Barra.suspend();

        }else{
            if(!Barra.t.isAlive())Barra.start();
            else  Barra.resume();

        }

    }//GEN-LAST:event_STARTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public peppermusic.CustomButton START;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private peppermusic.CustomPanel jp_Progreso;
    private javax.swing.JToggleButton jtb_agrandar;
    private javax.swing.JToggleButton karaoke;
    // End of variables declaration//GEN-END:variables
}
