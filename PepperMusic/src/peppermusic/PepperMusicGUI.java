/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.import java.awt.Dimension;
import java.awt.Dimension;
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
public class PepperMusicGUI extends javax.swing.JFrame {

    /**
     * Creates new form PepperMusicGUI
     */
    public PepperMusicGUI() {
        this.setUndecorated(true);
        
        initComponents();
//        jPanel1.setBackground(new Color(0,0,0,64));
        
        this.setLocationRelativeTo(null);
         this.setSize(new Dimension(300, 325));
        this.setMinimumSize(new Dimension(0, 0));
        
        this.setResizable(false); // anula el boton maximizar
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,100,100);
        AWTUtilities.setWindowShape(this, forma);
       
        
//tamaño del Jform
       	  
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btCanciones = new javax.swing.JButton();
        btArtista = new javax.swing.JButton();
        btAlbum = new javax.swing.JButton();
        btGenero = new javax.swing.JButton();
        btConfi = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        btMinimizar = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.red);
        setIconImage(jFrame1.getIconImage());
        setMaximumSize(new java.awt.Dimension(300, 325));
        setSize(new java.awt.Dimension(300, 325));
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

        btCanciones.setBackground(new java.awt.Color(255, 255, 199));
        btCanciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Canciones.png"))); // NOI18N
        btCanciones.setToolTipText("CANCIONES");
        btCanciones.setBorder(null);
        btCanciones.setBorderPainted(false);
        btCanciones.setContentAreaFilled(false);
        btCanciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCanciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCanciones.setName("Canciones"); // NOI18N
        btCanciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Canciones3.png"))); // NOI18N
        btCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCancionesMouseExited(evt);
            }
        });
        btCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancionesActionPerformed(evt);
            }
        });
        getContentPane().add(btCanciones);
        btCanciones.setBounds(30, 120, 70, 67);

        btArtista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/artista.png"))); // NOI18N
        btArtista.setToolTipText("ARTISTA");
        btArtista.setBorder(null);
        btArtista.setBorderPainted(false);
        btArtista.setContentAreaFilled(false);
        btArtista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btArtista.setPreferredSize(new java.awt.Dimension(70, 70));
        btArtista.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/artista3.png"))); // NOI18N
        getContentPane().add(btArtista);
        btArtista.setBounds(100, 200, 65, 65);

        btAlbum.setBackground(new java.awt.Color(255, 255, 199));
        btAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/album.png"))); // NOI18N
        btAlbum.setToolTipText("ÁLBUM");
        btAlbum.setBorder(null);
        btAlbum.setBorderPainted(false);
        btAlbum.setContentAreaFilled(false);
        btAlbum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlbum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlbum.setName("Canciones"); // NOI18N
        btAlbum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/album3.png"))); // NOI18N
        btAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAlbumMouseExited(evt);
            }
        });
        btAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlbumActionPerformed(evt);
            }
        });
        getContentPane().add(btAlbum);
        btAlbum.setBounds(110, 60, 70, 67);

        btGenero.setBackground(new java.awt.Color(255, 255, 199));
        btGenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/genero.png"))); // NOI18N
        btGenero.setToolTipText("GÉNERO");
        btGenero.setBorder(null);
        btGenero.setBorderPainted(false);
        btGenero.setContentAreaFilled(false);
        btGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btGenero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGenero.setName("Canciones"); // NOI18N
        btGenero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/peppermusic/genero3.png"))); // NOI18N
        btGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btGeneroMouseExited(evt);
            }
        });
        btGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(btGenero);
        btGenero.setBounds(170, 130, 70, 67);

        btConfi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/configuracion.png"))); // NOI18N
        btConfi.setToolTipText("CONFIGURACIÓN");
        btConfi.setBorder(null);
        btConfi.setBorderPainted(false);
        btConfi.setContentAreaFilled(false);
        btConfi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConfi.setPreferredSize(new java.awt.Dimension(70, 70));
        btConfi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/configuracion3.png"))); // NOI18N
        btConfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfiActionPerformed(evt);
            }
        });
        getContentPane().add(btConfi);
        btConfi.setBounds(220, 210, 65, 65);

        btCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar.png"))); // NOI18N
        btCerrar.setToolTipText("CERRAR");
        btCerrar.setBorder(null);
        btCerrar.setBorderPainted(false);
        btCerrar.setContentAreaFilled(false);
        btCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCerrar.setPreferredSize(new java.awt.Dimension(70, 70));
        btCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar2.png"))); // NOI18N
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCerrar);
        btCerrar.setBounds(230, 0, 60, 60);

        btMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/minimizar.png"))); // NOI18N
        btMinimizar.setToolTipText("MINIMIZAR");
        btMinimizar.setBorder(null);
        btMinimizar.setBorderPainted(false);
        btMinimizar.setContentAreaFilled(false);
        btMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMinimizar.setPreferredSize(new java.awt.Dimension(70, 70));
        btMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/minimizar2.png"))); // NOI18N
        btMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btMinimizar);
        btMinimizar.setBounds(170, 10, 65, 65);

        lbFondo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\orlando\\Desktop\\H-M\\RreproductorMP3_Brito,Rosales,Huacon,Salazar\\PepperMusic\\Recursos\\fondo_principal.png")); // NOI18N
        getContentPane().add(lbFondo);
        lbFondo.setBounds(0, 0, 300, 325);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //PARA MOVER LA PANTALLA 
    int x,y;
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked
   
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       
           
          Point p = MouseInfo.getPointerInfo().getLocation();
          this.setLocation(p.x-x,p.y-y);
    }//GEN-LAST:event_formMouseDragged
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void btCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancionesActionPerformed
        // TODO add your handling code here:
        jf_Canciones form2 = new jf_Canciones();
        form2.setVisible(true);
        Point p = this.getLocation();
        form2.setLocation(p.x,p.y);
        this.dispose();
        
       
        //this.dispose();
    }//GEN-LAST:event_btCancionesActionPerformed

    private void btCancionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancionesMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btCancionesMouseExited

    private void btAlbumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlbumMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlbumMouseExited

    private void btAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlbumActionPerformed

    private void btGeneroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGeneroMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btGeneroMouseExited

    private void btGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btGeneroActionPerformed

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
       
    }//GEN-LAST:event_btCerrarActionPerformed

    private void btMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMinimizarActionPerformed
        // TODO add your handling code here:
     setExtendedState(jFrame1.CROSSHAIR_CURSOR); 

    }//GEN-LAST:event_btMinimizarActionPerformed

    private void btConfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfiActionPerformed
        // TODO add your handling code here:
        
        Configuracion form2 = new Configuracion();
        form2.setVisible(true);
        Point p = this.getLocation();
        form2.setLocation(p.x,p.y);
        this.dispose();
    }//GEN-LAST:event_btConfiActionPerformed

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
            java.util.logging.Logger.getLogger(PepperMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PepperMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PepperMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PepperMusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PepperMusicGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlbum;
    private javax.swing.JButton btArtista;
    private javax.swing.JButton btCanciones;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btConfi;
    private javax.swing.JButton btGenero;
    private javax.swing.JButton btMinimizar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}