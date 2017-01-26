/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import com.sun.awt.AWTUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.SourceDataLine;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javazoom.jlgui.basicplayer.BasicPlayerException;
//import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author orlando
 */
public class jp_Reproduccion extends jp_Canciones {
    
    /**
     * Creates new form jp_Reproduccion
     */
   
   
    int repetir=0;
    //jp_Canciones can
    PepperMusic_Frame peppermusic;
    //ZPlayer mizplayer;   
    File file; 
     
    public jp_Reproduccion(PepperMusic_Frame venta) {
        super(venta);
        initComponents();
        ventana.NoRepro=false;
        peppermusic = venta;    
        super.setEnabled_Reproduccion(true);
        super.setSelected_Lista(false);
        super.setSelected_Reproduccion(true);
        START.setSelected(true);
        /*
        if(canc.venta.EnRepro==false){
        canc.venta.Barra = new Clase_Progreso(jp_Progreso,this);
        canc.venta.Barra.start();
        }*/
        js_volumen.setVisible(false);
        js_volumen.validate();
        jb_repetir.setToolTipText("REPETICIÓN DESACTIVADA");
        
        
       
        /*
        try {
            Reproductor mi_reproductor = new Reproductor();
            mi_reproductor.AbrirFichero(getClass().getResource("/Recursos/BohemianRhapsody.mp3").getFile());
            mi_reproductor.Play();
          } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
          }
       */
        
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
        jp_Letras = new javax.swing.JPanel();
        js_Letras = new javax.swing.JScrollPane();
        jtxt_letra = new javax.swing.JTextPane();
        jp_Informacion = new javax.swing.JPanel();
        jlb_album = new javax.swing.JLabel();
        jlb_cancion = new javax.swing.JLabel();
        jlb_artista = new javax.swing.JLabel();
        jb_add_letras = new javax.swing.JButton();
        jlb_tiempo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        setLayout(null);

        jtb_agrandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_pequeño.png"))); // NOI18N
        jtb_agrandar.setBorder(null);
        jtb_agrandar.setBorderPainted(false);
        jtb_agrandar.setContentAreaFilled(false);
        jtb_agrandar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_agrandar.png"))); // NOI18N
        jtb_agrandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_agrandarActionPerformed(evt);
            }
        });
        add(jtb_agrandar);
        jtb_agrandar.setBounds(270, 60, 25, 25);

        karaoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/barramusical.png"))); // NOI18N
        karaoke.setBorder(null);
        karaoke.setBorderPainted(false);
        karaoke.setContentAreaFilled(false);
        karaoke.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/karaoke.png"))); // NOI18N
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
        karaoke.setBounds(230, 295, 35, 35);

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
        START.setBounds(172, 47, 56, 56);

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
        customButton1.setBounds(250, 125, 25, 25);

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
        js_volumen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                js_volumenStateChanged(evt);
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
        js_volumen.setBounds(245, 41, 35, 90);

        jtb_aleatorio.setBorder(null);
        jtb_aleatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_aleatorio_off.png"))); // NOI18N
        jtb_aleatorio.setBorderPainted(false);
        jtb_aleatorio.setContentAreaFilled(false);
        jtb_aleatorio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_aleatorio_on.png"))); // NOI18N
        add(jtb_aleatorio);
        jtb_aleatorio.setBounds(30, 112, 20, 20);

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
        jb_repetir.setBounds(130, 112, 20, 20);

        jp_Progreso.setOpaque(false);
        jp_Progreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_ProgresoMouseClicked(evt);
            }
        });
        jp_Progreso.setLayout(null);
        add(jp_Progreso);
        jp_Progreso.setBounds(160, 34, 80, 80);

        jp_Letras.setOpaque(false);
        jp_Letras.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jp_LetrasComponentShown(evt);
            }
        });
        jp_Letras.setLayout(null);

        js_Letras.setBackground(new java.awt.Color(153, 255, 255));
        js_Letras.setBorder(null);
        js_Letras.setViewportBorder(javax.swing.BorderFactory.createCompoundBorder());
        js_Letras.setAlignmentX(0.0F);
        js_Letras.setAlignmentY(0.0F);
        js_Letras.setAutoscrolls(true);
        js_Letras.setHorizontalScrollBar(null);
        js_Letras.setMaximumSize(new java.awt.Dimension(230, 140));
        js_Letras.setMinimumSize(new java.awt.Dimension(230, 140));
        js_Letras.setOpaque(false);
        js_Letras.setPreferredSize(new java.awt.Dimension(230, 140));
        js_Letras.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                js_LetrasComponentShown(evt);
            }
        });

        jtxt_letra.setEditable(false);
        jtxt_letra.setBackground(new java.awt.Color(153, 255, 255));
        jtxt_letra.setOpaque(false);
        jtxt_letra.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jtxt_letraComponentShown(evt);
            }
        });
        js_Letras.setViewportView(jtxt_letra);

        jp_Letras.add(js_Letras);
        js_Letras.setBounds(0, 0, 248, 138);

        add(jp_Letras);
        jp_Letras.setBounds(25, 155, 248, 138);

        jp_Informacion.setOpaque(false);
        jp_Informacion.setLayout(null);

        jlb_album.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jlb_album.setForeground(new java.awt.Color(255, 255, 255));
        jlb_album.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_album.setText("TOOOOOOOOOOODOS");
        jp_Informacion.add(jlb_album);
        jlb_album.setBounds(5, 40, 115, 20);

        jlb_cancion.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jlb_cancion.setForeground(new java.awt.Color(255, 255, 255));
        jlb_cancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_cancion.setText("COMO ESTAAAAAAAAN");
        jp_Informacion.add(jlb_cancion);
        jlb_cancion.setBounds(5, 22, 115, 20);

        jlb_artista.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jlb_artista.setForeground(new java.awt.Color(255, 255, 255));
        jlb_artista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_artista.setText("HOLAAAAAAAAAAAAA");
        jp_Informacion.add(jlb_artista);
        jlb_artista.setBounds(5, 8, 115, 15);

        add(jp_Informacion);
        jp_Informacion.setBounds(30, 40, 120, 68);

        jb_add_letras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_agregar_letras.png"))); // NOI18N
        jb_add_letras.setText("jButton3");
        jb_add_letras.setBorderPainted(false);
        jb_add_letras.setContentAreaFilled(false);
        jb_add_letras.setFocusPainted(false);
        jb_add_letras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_add_letras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_agregar_letras2.png"))); // NOI18N
        jb_add_letras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add_letrasActionPerformed(evt);
            }
        });
        add(jb_add_letras);
        jb_add_letras.setBounds(190, 300, 30, 30);

        jlb_tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_tiempo.setText("00:27 - 04:58");
        add(jlb_tiempo);
        jlb_tiempo.setBounds(30, 110, 120, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/repro_nombre.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(30, 40, 125, 68);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ecupeq.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(20, 290, 40, 40);

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
        if(!karaoke.isSelected()){
            js_Letras.setLocation(0, 0);
           
            jp_Letras.removeAll();
            
            jp_Letras.add(js_Letras);
            jp_Letras.revalidate();
            jp_Letras.repaint();
           
            /*
           jlb_barras.setIcon(new ImageIcon( getClass().getResource("/Recursos/imagen_letras.png")));
            jlb_barras.repaint();
            jlb_barras.revalidate();
*/
        }else{
            
           /*JLabel  jlb_barras = new JLabel();
           jlb_barras.setSize(230, 140);
           jlb_barras.setLocation(0, 0);
            jlb_barras.setIcon(new ImageIcon( getClass().getResource("/Recursos/repro_barras.png")));
           jp_Letras.removeAll();
            jp_Letras.add(jlb_barras);
            jp_Letras.revalidate();
            jp_Letras.repaint();*/
           
           jp_Letras.removeAll();
       if(ventana.espectrometro==null){   
       ventana.espectrometro = new SpectrumTimeAnalyzer();//DISPLAY_MODE_SPECTRUM_ANALYSER
       ventana.espectrometro.setDisplayMode(SpectrumTimeAnalyzer.DISPLAY_MODE_SCOPE);
      
        ventana.espectrometro.setSpectrumAnalyserBandCount(20);
        ventana.espectrometro.setSpectrumAnalyserDecay(0.2f);
        
        int fps = SpectrumTimeAnalyzer.DEFAULT_FPS;
        ventana.espectrometro.setFps(fps);
        ventana.espectrometro.setPeakDelay((int) (fps * SpectrumTimeAnalyzer.DEFAULT_SPECTRUM_ANALYSER_PEAK_DELAY_FPS_RATIO));
        ventana.espectrometro.setSize(248,138);
       //ventana.espectrometro.setVisColor(getViscolor("viscolor.txt"));
       
       }     
          ventana.espectrometro.setBackground(new Color(0,255,120));
          ventana.espectrometro.setOpaque(false);
       ventana.espectrometro.setScopeColor(Color.RED);
            ventana.espectrometro.repaint();
            jp_Letras.add(ventana.espectrometro, BorderLayout.CENTER);
      
            jp_Letras.revalidate();
            
            jp_Letras.repaint();
            
            
            
            if (ventana.audioInfo.containsKey("basicplayer.sourcedataline")) {
                if (ventana.espectrometro != null) {
                    ventana.espectrometro.setupDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));
                    ventana.espectrometro.startDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));

                   ventana.espectrometro.setupDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));
                    ventana.espectrometro.startDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));
                }
            }
        
            
        }

    }//GEN-LAST:event_karaokeActionPerformed
    public String getViscolor(String path) {
        String viscolor = "";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File(path);
            if (!archivo.exists()) {
                archivo = new File("viscolor.txt");
            }
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                viscolor += (linea + "\n");
            }
        } catch (Exception e) {
            System.out.println("archivo no leido");
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return viscolor;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
        // TODO add your handling code here:
       
        if(!START.isSelected()){
            try {
                // peppermusic.Barra.suspend();
                peppermusic.mi_reproductor.Pausa();
                
            } catch (Exception ex) {
                Logger.getLogger(jp_Reproduccion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                // if(!peppermusic.Barra.t.isAlive())peppermusic.Barra.start();
                peppermusic.mi_reproductor.Continuar();
          //      peppermusic.mi_reproductor.control.getTitle();
            } catch (Exception ex) {
                Logger.getLogger(jp_Reproduccion.class.getName()).log(Level.SEVERE, null, ex);
            }

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

    private void jtb_agrandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_agrandarActionPerformed
        // TODO add your handling code here:
       
        if(jtb_agrandar.isSelected()){
           // jtb_agrandar.setLocation(238,150);
          
            peppermusic.setSize(300, 168);
            Shape forma = new RoundRectangle2D.Double(0,0,peppermusic.getBounds().width,peppermusic.getBounds().height,110,110);
            AWTUtilities.setWindowShape(peppermusic, forma);
            jLabel1.setIcon(new ImageIcon( getClass().getResource("/Recursos/Fondo_Celeste2.png")));
         //   jlb_barras.setVisible(false);
            jp_Letras.setVisible(false);
            jp_Letras.setLocation(300, 170);
            jp_Letras.repaint();
            jLabel1.setSize(300,168);
            jLabel1.repaint();
            super.setEnabled_Lista(false);
            
            jLabel1.revalidate();

        }else{

            peppermusic.setSize(300, 336);
            Shape forma = new RoundRectangle2D.Double(0,0,peppermusic.getBounds().width,peppermusic.getBounds().height,125,125);
            AWTUtilities.setWindowShape(peppermusic, forma);
            jLabel1.setIcon(new ImageIcon( getClass().getResource("/Recursos/Fondo_Celeste.png")));
            jLabel1.setLocation(0, 0);
            jLabel1.setSize(300,336);
            jLabel1.repaint();
            jp_Letras.setVisible(true);
            jp_Letras.setLocation(30, 160);
            jp_Letras.repaint();
//            jlb_barras.setVisible(true);
            super.setEnabled_Lista(true);
            jLabel1.revalidate();
           // jtb_agrandar.setLocation(238,315);
        }

    }//GEN-LAST:event_jtb_agrandarActionPerformed
   double valor;
    private void jp_ProgresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_ProgresoMouseClicked
        // TODO add your handling code here:
         
      int x = evt.getX();
      int y = evt.getY();
     // JOptionPane.showMessageDialog(canc,x + "+"+y+"="+(x + y)); 
       
      if(x==40)return;//reiniciar cancion
         
         valor = Math.toDegrees( Math.atan(((double)y-40)/((double)x-40)));
         int z;
          
         if(x>40)
         { 
             z = (int)Math.floor((valor+90)/3.6);
            
         }else{
             
             z = (int)Math.floor((valor+270)/3.6);
         }
         
       //  System.out.println("cambio; "+(ventana.bits_total*z/100));
         
        try {
            peppermusic.mi_reproductor.seeked( ventana.bits_total*z/100);
            // JOptionPane.showMessageDialog(canc,valor);
            //jp_Progreso.ActualizarProgreso(z);
            //     canc.venta.Barra.n=z;
        } catch (BasicPlayerException ex) {
            Logger.getLogger(jp_Reproduccion.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jp_ProgresoMouseClicked

    private void js_volumenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_js_volumenStateChanged
        // TODO add your handling code here:
           try { 
            peppermusic.mi_reproductor.control.setGain((double)js_volumen.getValue()/100); 
        } catch (BasicPlayerException ex) { 
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex); 
        } 
        

    
    }//GEN-LAST:event_js_volumenStateChanged

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formPropertyChange

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
        
                   jp_Letras.removeAll();
                   
                   
        
    }//GEN-LAST:event_formComponentHidden
    public void leer_txt(String ruta){
     
     String codigo = new String(), path = ruta;
			File archivo = new File(path);
     if (archivo.exists()){
			FileReader fr = null;
			BufferedReader entrada = null;
			try {
				fr = new FileReader(path);
				entrada = new BufferedReader(fr);

				while(entrada.ready()){
					codigo += entrada.readLine()+"\n";
				}

			}catch(IOException e) {
				e.printStackTrace();
			}finally{
				try{                    
					if(null != fr){   
						fr.close();     
					}                  
				}catch (Exception e2){ 
					e2.printStackTrace();
				}
			}
            
     }else{codigo="\n\n\n No hay letra, Porfavor Ingresela manualmente";}
                      jtxt_letra.setText(codigo);
                      StyledDocument doc = jtxt_letra.getStyledDocument();
                       SimpleAttributeSet center = new SimpleAttributeSet();
                      StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
                       doc.setParagraphAttributes(0, doc.getLength(), center, false);
                      jtxt_letra.revalidate();
                      
                    
                      
 }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        if(!karaoke.isSelected()){
            js_Letras.setLocation(0, 0);
            js_Letras.setVisible(true);
         /*   if(ventana.jp_Principal.getComponent(2)==ventana.inicio.p1)leer_txt("C:\\PepperMusic_Datos\\Letras\\"+ventana.lista_completa.get(ventana.indice).nom_cancion+".txt");
             if(ventana.jp_Principal.getComponent(2)==ventana.inicio.p2)leer_txt("C:\\PepperMusic_Datos\\Letras\\"+ventana.Lista_album.get(ventana.indice_album).items_album().get(ventana.indice_cancion).nom_cancion+".txt");
            if(ventana.jp_Principal.getComponent(2)==ventana.inicio.p3)leer_txt("C:\\PepperMusic_Datos\\Letras\\"+ventana.Lista_artista.get(ventana.indice_album).items_artista().get(ventana.indice_cancion).nom_cancion+".txt");
             if(ventana.jp_Principal.getComponent(2)==ventana.inicio.p4)leer_txt("C:\\PepperMusic_Datos\\Letras\\"+ventana.Lista_genero.get(ventana.indice_album).items_genero().get(ventana.indice_cancion).nom_cancion+".txt");
             */jp_Letras.removeAll();
             System.out.println("RUTA="+ventana.ruta_txt);
           // leer_txt(ventana.ruta_txt);
           leer_txt("C:\\PepperMusic_Datos\\Letras\\"+ventana.nom_cancion+".txt");
            jp_Letras.add(js_Letras);
           //jp_Letras.revalidate();
           //jp_Letras.repaint();
           
            jlb_artista.setText(ventana.nom_artista);
           jlb_cancion.setText(ventana.nom_cancion);
            jlb_album.setText(ventana.nom_album);
             Clase_Progreso cal =new  Clase_Progreso(ventana);
             cal.start();
            // js_Letras.getVerticalScrollBar().setValue(0); 
            /*
           jlb_barras.setIcon(new ImageIcon( getClass().getResource("/Recursos/imagen_letras.png")));
            jlb_barras.repaint();
            jlb_barras.revalidate();
*/
        }else{
            
           /*JLabel  jlb_barras = new JLabel();
           jlb_barras.setSize(230, 140);
           jlb_barras.setLocation(0, 0);
            jlb_barras.setIcon(new ImageIcon( getClass().getResource("/Recursos/repro_barras.png")));
           jp_Letras.removeAll();
            jp_Letras.add(jlb_barras);
            jp_Letras.revalidate();
            jp_Letras.repaint();*/
           
           jp_Letras.removeAll();
       if(ventana.espectrometro==null){   
       ventana.espectrometro = new SpectrumTimeAnalyzer();//DISPLAY_MODE_SPECTRUM_ANALYSER
       ventana.espectrometro.setDisplayMode(SpectrumTimeAnalyzer.DISPLAY_MODE_SCOPE);
      
        ventana.espectrometro.setSpectrumAnalyserBandCount(20);
        ventana.espectrometro.setSpectrumAnalyserDecay(0.2f);
        
        int fps = SpectrumTimeAnalyzer.DEFAULT_FPS;
        ventana.espectrometro.setFps(fps);
        ventana.espectrometro.setPeakDelay((int) (fps * SpectrumTimeAnalyzer.DEFAULT_SPECTRUM_ANALYSER_PEAK_DELAY_FPS_RATIO));
       
       //ventana.espectrometro.setVisColor(getViscolor("viscolor.txt"));
       
       }     
          ventana.espectrometro.setBackground(new Color(0,255,120));
          ventana.espectrometro.setOpaque(false);
       ventana.espectrometro.setScopeColor(Color.RED);
            ventana.espectrometro.repaint();
            jp_Letras.add(ventana.espectrometro, BorderLayout.CENTER);
      
            jp_Letras.revalidate();
            
            jp_Letras.repaint();
            
            
            
            if (ventana.audioInfo.containsKey("basicplayer.sourcedataline")) {
                if (ventana.espectrometro != null) {
                    ventana.espectrometro.setupDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));
                    ventana.espectrometro.startDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));

                   ventana.espectrometro.setupDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));
                    ventana.espectrometro.startDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));
                }
            }
        
            
        }
        jlb_cancion.setText(ventana.nom_cancion);
        jlb_artista.setText(ventana.nom_artista);
        jlb_album.setText(ventana.nom_album);
        js_Letras.getVerticalScrollBar().setValue(0);

        js_Letras.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_formComponentShown

    private void jb_add_letrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add_letrasActionPerformed
        // TODO add your handling code here:
        Add_letra add= new Add_letra(ventana);
        add.setVisible(true);
        add.setAlwaysOnTop(true);
          
        
    }//GEN-LAST:event_jb_add_letrasActionPerformed

    private void js_LetrasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_js_LetrasComponentShown
        // TODO add your handling code here:
       
    }//GEN-LAST:event_js_LetrasComponentShown

    private void jtxt_letraComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jtxt_letraComponentShown
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jtxt_letraComponentShown

    private void jp_LetrasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jp_LetrasComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jp_LetrasComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            VistaEcualizador ecu = new VistaEcualizador(peppermusic);
            ControlEcualizador control = new ControlEcualizador(ecu);
            ecu.setState(control.getState());
            ecu.setControl(control);
            ecu.setLocationRelativeTo(null);
            ecu.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(ventana, "Error al abrir ecualizador. Contactar al desarrollador 0996408107"+e.getMessage());
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public peppermusic.CustomButton START;
    private peppermusic.CustomButton customButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jb_add_letras;
    private javax.swing.JButton jb_repetir;
    private javax.swing.JLabel jlb_album;
    private javax.swing.JLabel jlb_artista;
    private javax.swing.JLabel jlb_cancion;
    public javax.swing.JLabel jlb_tiempo;
    private javax.swing.JPanel jp_Informacion;
    private javax.swing.JPanel jp_Letras;
    public peppermusic.CustomPanel jp_Progreso;
    public javax.swing.JScrollPane js_Letras;
    private javax.swing.JSlider js_volumen;
    private javax.swing.JToggleButton jtb_agrandar;
    private peppermusic.CustomButton jtb_aleatorio;
    private javax.swing.JTextPane jtxt_letra;
    private javax.swing.JToggleButton karaoke;
    // End of variables declaration//GEN-END:variables
}
