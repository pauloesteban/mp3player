/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
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
    public jp_Reproduccion(jp_Canciones can) {
        initComponents();
        canc =can;
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
        jLabel2 = new javax.swing.JLabel();
        karaoke = new javax.swing.JToggleButton();
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
        jtb_agrandar.setBounds(270, 120, 30, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Reproducir.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(20, 20, 254, 130);

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
        karaoke.setBounds(250, 180, 27, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagen_barras.png"))); // NOI18N
        jLabel3.setToolTipText("");
        add(jLabel3);
        jLabel3.setBounds(20, 160, 230, 140);
        jLabel3.getAccessibleContext().setAccessibleName("");

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
            jLabel3.setIcon(new ImageIcon( getClass().getResource("/Recursos/imagen_barras.png")));
            jLabel3.repaint();
            jLabel3.revalidate();
        }

    }//GEN-LAST:event_karaokeActionPerformed

    private void jtb_agrandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_agrandarActionPerformed
        // TODO add your handling code here:
        if(jtb_agrandar.isSelected()){
            
            canc.venta.setSize(300, 150);
            Shape forma = new RoundRectangle2D.Double(0,0,canc.venta.getBounds().width,canc.venta.getBounds().height,25,25);
        AWTUtilities.setWindowShape(canc.venta, forma);
        }else{
            canc.venta.setSize(300, 336);
            Shape forma = new RoundRectangle2D.Double(0,0,canc.venta.getBounds().width,canc.venta.getBounds().height,125,125);
        AWTUtilities.setWindowShape(canc.venta, forma);
        }
        
    }//GEN-LAST:event_jtb_agrandarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton jtb_agrandar;
    private javax.swing.JToggleButton karaoke;
    // End of variables declaration//GEN-END:variables
}
