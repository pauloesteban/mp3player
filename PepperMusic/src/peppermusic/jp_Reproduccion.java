/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
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
    Clase_Progreso Barra;
    int repetir=0;
    
    public jp_Reproduccion(jp_Canciones can) {
        initComponents();
        canc =can;
        
        
        START.setSelected(true);
        Barra = new Clase_Progreso(jp_Progreso,this);
        Barra.start();
      js_volumen.setVisible(false);
        js_volumen.validate();
        jb_repetir.setToolTipText("REPETICIÓN DESACTIVADA");
       
       
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
        START = new peppermusic.CustomButton();
        jButton4 = new javax.swing.JButton();
        customButton1 = new peppermusic.CustomButton();
        js_volumen = new javax.swing.JSlider();
        jtb_aleatorio = new peppermusic.CustomButton();
        jb_repetir = new javax.swing.JButton();
        jp_Progreso = new peppermusic.CustomPanel();
        jlb_tiempo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlb_barras = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jtb_agrandar.setBounds(238, 315, 20, 20);

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(220, 108, 30, 30);

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
        jButton2.setBounds(150, 108, 30, 30);

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
        START.setBounds(172, 46, 56, 56);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_fin.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_fin2.png"))); // NOI18N
        add(jButton4);
        jButton4.setBounds(182, 116, 36, 36);

        customButton1.setBorder(null);
        customButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_volumen.png"))); // NOI18N
        customButton1.setBorderPainted(false);
        customButton1.setContentAreaFilled(false);
        customButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_volumen_sin.png"))); // NOI18N
        customButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                customButton1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                customButton1MouseMoved(evt);
            }
        });
        customButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customButton1MouseExited(evt);
            }
        });
        add(customButton1);
        customButton1.setBounds(250, 120, 25, 25);

        js_volumen.setOrientation(javax.swing.JSlider.VERTICAL);
        js_volumen.setPaintLabels(true);
        js_volumen.setToolTipText("");
        js_volumen.setValue(80);
        js_volumen.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        js_volumen.setOpaque(false);
        js_volumen.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                js_volumenComponentAdded(evt);
            }
        });
        js_volumen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                js_volumenMouseMoved(evt);
            }
        });
        js_volumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                js_volumenMouseExited(evt);
            }
        });
        add(js_volumen);
        js_volumen.setBounds(245, 36, 35, 90);

        jtb_aleatorio.setBorder(null);
        jtb_aleatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_aleatorio_off.png"))); // NOI18N
        jtb_aleatorio.setBorderPainted(false);
        jtb_aleatorio.setContentAreaFilled(false);
        jtb_aleatorio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_aleatorio_on.png"))); // NOI18N
        add(jtb_aleatorio);
        jtb_aleatorio.setBounds(30, 115, 20, 20);

        jb_repetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_rep_off.png"))); // NOI18N
        jb_repetir.setBorder(null);
        jb_repetir.setBorderPainted(false);
        jb_repetir.setContentAreaFilled(false);
        jb_repetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_repetirActionPerformed(evt);
            }
        });
        add(jb_repetir);
        jb_repetir.setBounds(120, 115, 20, 20);

        jp_Progreso.setOpaque(false);
        jp_Progreso.setLayout(null);
        add(jp_Progreso);
        jp_Progreso.setBounds(160, 34, 80, 80);

        jlb_tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_tiempo.setText("0:50 - 3:04");
        add(jlb_tiempo);
        jlb_tiempo.setBounds(50, 120, 70, 14);

        jPanel1.setOpaque(false);

        jlb_barras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_barras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_barras.png"))); // NOI18N
        jlb_barras.setToolTipText("");
        jPanel1.add(jlb_barras);

        add(jPanel1);
        jPanel1.setBounds(30, 160, 230, 140);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_nombre.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(30, 50, 120, 60);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Celeste1.png"))); // NOI18N
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

           jlb_barras.setIcon(new ImageIcon( getClass().getResource("/Recursos/imagen_letras.png")));
            jlb_barras.repaint();
            jlb_barras.revalidate();
        }else{
            jlb_barras.setIcon(new ImageIcon( getClass().getResource("/Recursos/repro_barras.png")));
            jlb_barras.repaint();
            jlb_barras.revalidate();
        }

    }//GEN-LAST:event_karaokeActionPerformed

    private void jtb_agrandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_agrandarActionPerformed
        // TODO add your handling code here:
        if(jtb_agrandar.isSelected()){
            jtb_agrandar.setLocation(238,150);
            
            canc.venta.setSize(300, 168);
            Shape forma = new RoundRectangle2D.Double(0,0,canc.venta.getBounds().width,canc.venta.getBounds().height,110,110);
        AWTUtilities.setWindowShape(canc.venta, forma);
        jLabel1.setIcon(new ImageIcon( getClass().getResource("/Recursos/fondo_mini.png")));
        jlb_barras.setVisible(false);
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
            jlb_barras.setVisible(true);
            canc.jtb_lista.setEnabled(true);
            jLabel1.revalidate();
             jtb_agrandar.setLocation(238,315);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void customButton1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customButton1MouseDragged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_customButton1MouseDragged

    private void customButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customButton1MouseMoved
        // TODO add your handling code here:
         try{ Thread.sleep(175); } catch(InterruptedException e ) { System.out.println("Thread Interrupted"); }
         js_volumen.setVisible(true);
        js_volumen.validate();
    }//GEN-LAST:event_customButton1MouseMoved

    private void customButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customButton1MouseExited
        // TODO add your handling code here:
         try{ Thread.sleep(250); } catch(InterruptedException e ) { System.out.println("Thread Interrupted"); }
        js_volumen.setVisible(false);
        js_volumen.validate();
    }//GEN-LAST:event_customButton1MouseExited

    private void js_volumenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_js_volumenMouseMoved
        // TODO add your handling code here:
         try{ Thread.sleep(175); } catch(InterruptedException e ) { System.out.println("Thread Interrupted"); }
        js_volumen.setVisible(true);
        js_volumen.validate();
    }//GEN-LAST:event_js_volumenMouseMoved

    private void js_volumenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_js_volumenMouseExited
        // TODO add your handling code here:
         try{ Thread.sleep(250); } catch(InterruptedException e ) { System.out.println("Thread Interrupted"); }
         js_volumen.setVisible(false);
        js_volumen.validate();
    }//GEN-LAST:event_js_volumenMouseExited

    private void js_volumenComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_js_volumenComponentAdded
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_js_volumenComponentAdded

    private void jb_repetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_repetirActionPerformed
        // TODO add your handling code here:
        if(repetir==0){
            jb_repetir.setIcon(new ImageIcon( getClass().getResource("/Recursos/repro_rep_1.png")));
            jb_repetir.setToolTipText("REPETIR CANCIÓN");
            repetir++;
            return;
        }
        if(repetir==1){
            jb_repetir.setIcon(new ImageIcon( getClass().getResource("/Recursos/repro_rep_todo.png")));
            jb_repetir.setToolTipText("REPETIR TODAS LAS CANCIÓNES");
            repetir++;
            return;
        }
        if(repetir==2){
            jb_repetir.setIcon(new ImageIcon( getClass().getResource("/Recursos/repro_rep_off.png")));
            jb_repetir.setToolTipText("REPETICIÓN DESACTIVADA");
            repetir=0;
            
        }
        
        
    }//GEN-LAST:event_jb_repetirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public peppermusic.CustomButton START;
    private peppermusic.CustomButton customButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_repetir;
    private javax.swing.JLabel jlb_barras;
    private javax.swing.JLabel jlb_tiempo;
    private peppermusic.CustomPanel jp_Progreso;
    private javax.swing.JSlider js_volumen;
    private javax.swing.JToggleButton jtb_agrandar;
    private peppermusic.CustomButton jtb_aleatorio;
    private javax.swing.JToggleButton karaoke;
    // End of variables declaration//GEN-END:variables
}
