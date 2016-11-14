/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import com.sun.awt.AWTUtilities;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;

/**
 *
 * @author orlando
 */
public class jf_Reproduccion extends javax.swing.JFrame {

    /**
     * Creates new form jf_Reproduccion
     */
    public jf_Reproduccion() {
         this.setUndecorated(true);
        initComponents();
         this.setLocationRelativeTo(null);
         this.setSize(new Dimension(300, 325));
        this.setMinimumSize(new Dimension(0, 0));
        
        this.setResizable(false); // anula el boton maximizar
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,100,100);
        AWTUtilities.setWindowShape(this, forma);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        karaoke = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 325));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Boton 2.png"))); // NOI18N
        jButton3.setToolTipText("REGRESAR");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Boton 2.1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 10, 33, 32);

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
        getContentPane().add(karaoke);
        karaoke.setBounds(260, 200, 27, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo_Reproduccion.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 300, 325);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked
int x,y;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
         x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
          
          Point p = MouseInfo.getPointerInfo().getLocation();
          this.setLocation(p.x-x,p.y-y);
    }//GEN-LAST:event_formMouseDragged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jf_Canciones form2 = new jf_Canciones();
        form2.setVisible(true);
        form2.setAlwaysOnTop( true );
        Point p = this.getLocation();
        form2.setLocation(p.x,p.y);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void karaokeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_karaokeStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_karaokeStateChanged

    private void karaokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karaokeActionPerformed
       if(karaoke.isSelected()){
            
           
            
            jLabel2.setIcon(new ImageIcon( getClass().getResource( "fondo_barra.png" )));
            jLabel2.repaint();
          // jLabel2.repaint();
        }else{
             jLabel2.setIcon(new ImageIcon( getClass().getResource( "fondo_Reproduccion.png" )));
             jLabel2.repaint();
        }
        
    }//GEN-LAST:event_karaokeActionPerformed

    private void karaokeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karaokeMouseClicked
        
    }//GEN-LAST:event_karaokeMouseClicked

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
            java.util.logging.Logger.getLogger(jf_Reproduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jf_Reproduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jf_Reproduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf_Reproduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_Reproduccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton karaoke;
    // End of variables declaration//GEN-END:variables
}