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

/**
 *
 * @author orlando
 */
 
public class PepperMusic_Frame extends javax.swing.JFrame {

    /**
     * Creates new form PepperMusic_Frame
     */
    public  boolean EnRepro = false;  //Usada para saber cuando se está reproducciendo una cancion
    public  boolean NoRepro = true;   // idica si se ha salido del jp_Reproduccion (para no dibujar el progreso)
    public Clase_Progreso Barra;
    public jp_Reproduccion repro;
    public long duracion;
    public Reproductor mi_reproductor = new Reproductor();
    //declarar la direccion de la cancion a reproduccir como variable global
    
    public PepperMusic_Frame() {
       // repro = new jp_Reproduccion();
          this.setUndecorated(true);
          initComponents();
          this.setSize(new Dimension(300, 336));
          this.setMinimumSize(new Dimension(0, 0));
          this.setLocationRelativeTo(null);
          this.setResizable(false); // anula el boton maximizar
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,125,125);
        AWTUtilities.setWindowShape(this, forma);
        
        
        //abrir Jp_Inicio que contiene el menú principal 
             
            jp_Principal.removeAll();
            
            jp_Inicio p0 = new jp_Inicio(this);
            p0.setSize(300, 336);
            p0.setLocation(0, 0);
            jp_Principal.add(p0);
            
            jp_Reproduccion p1 = new jp_Reproduccion(this);
            p1.setSize(300, 336);
            p1.setLocation(0, 0);
            p1.setVisible(false);
            jp_Principal.add(p1);
            
            
            jp_Principal.revalidate();
            jp_Principal.repaint();
            
                       
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_Principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jp_Principal.setAlignmentX(0.0F);
        jp_Principal.setAlignmentY(0.0F);
        jp_Principal.setOpaque(false);

        javax.swing.GroupLayout jp_PrincipalLayout = new javax.swing.GroupLayout(jp_Principal);
        jp_Principal.setLayout(jp_PrincipalLayout);
        jp_PrincipalLayout.setHorizontalGroup(
            jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jp_PrincipalLayout.setVerticalGroup(
            jp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        getContentPane().add(jp_Principal);
        jp_Principal.setBounds(0, 0, 300, 336);

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(PepperMusic_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PepperMusic_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PepperMusic_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PepperMusic_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PepperMusic_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel jp_Principal;
    // End of variables declaration//GEN-END:variables
}
