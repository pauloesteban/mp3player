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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javazoom.jlgui.player.amp.tag.TagInfo;
import javazoom.jlgui.player.amp.tag.TagInfoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.tritonus.share.sampled.file.TAudioFileFormat;
import peppermusic.contenedores.Contenedor_album;
import peppermusic.contenedores.Contenedor_artista;
import peppermusic.contenedores.Contenedor_genero;
import sun.security.krb5.Config;

/**
 *
 * @author orlando
 */

 
public class PepperMusic_Frame extends javax.swing.JFrame {

    /**
     * Creates new form PepperMusic_Frame
     */
   // ListaDeReproduccion[] lista_completa;
    ArrayList<ListaDeReproduccion> lista_completa = new ArrayList<>();
    ArrayList<Contenedor_album> Lista_album = new ArrayList<>();
    ArrayList<Contenedor_artista> Lista_artista = new ArrayList<>();
    ArrayList<Contenedor_genero> Lista_genero = new ArrayList<>();
    SeekAndDestroy inicial = new SeekAndDestroy(this);
   
    public boolean EnRepro = false;  //Usada para saber cuando se está reproducciendo una cancion
    public boolean NoRepro = true;   // idica si se ha salido del jp_Reproduccion (para no dibujar el progreso)
    public Clase_Progreso Barra;
    public jp_Reproduccion repro;
    public jp_Inicio inicio;
    public TagInfo informacion;
    public long duracion,tiempo,bits_total;
    public Map audioInfo = null;
    public SpectrumTimeAnalyzer espectrometro =null;
    public Reproductor mi_reproductor = new Reproductor(this);
    //declarar la direccion de la cancion a reproduccir como variable global
    public String nom_cancion;
    public String nom_artista;
    public String nom_album;
    public int  indice;
    public int indice_album;
    public int indice_cancion;
    public int modo;
        
    private static Log log = LogFactory.getLog(TagInfoFactory.class);
    private static TagInfoFactory instance = null;
    private Class  MpegTagInfoClass = null;
    private Class  VorbisTagInfoClass = null;
    private Config conf = null;

    public PepperMusic_Frame() {
       // repro = new jp_Reproduccion();
        this.setUndecorated(true);
        initComponents();
        //crea las carpetas en el directorio C
        File letras = new File("C:\\PepperMusic_Datos\\Letras");
        File configuracion = new File("C:\\PepperMusic_Datos\\Configuracion");
      
        if(!letras.exists())letras.mkdirs();
        if(!configuracion.exists())configuracion.mkdirs();
          
           
          
        this.setSize(new Dimension(300, 336));
        this.setMinimumSize(new Dimension(0, 0));
        this.setLocationRelativeTo(null);
        this.setResizable(false); // anula el boton maximizar
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,125,125);
        AWTUtilities.setWindowShape(this, forma);
        
        //abrir Jp_Inicio que contiene el menú principal 
        jp_Principal.removeAll();
            
        inicio = new jp_Inicio(this);
        inicio.setSize(300, 336);
        inicio.setLocation(0, 0);
        jp_Principal.add(inicio);

        repro = new jp_Reproduccion(this);
        repro.setSize(300, 336);
        repro.setLocation(0, 0);
        repro.setVisible(false);
        jp_Principal.add(repro);


        jp_Principal.revalidate();
        jp_Principal.repaint();

        inicial.start();
 }
     
public void Meta_Audio(String ruta,String propiedad){
    //"mp3.id3tag.genre"
    ///////////OBTENER DATOS DE LOS ARCHIVOS MP3     
    File file = new File(ruta);
    AudioFileFormat baseFileFormat = null;
    AudioFormat baseFormat = null;
        try {
            baseFileFormat = AudioSystem.getAudioFileFormat(file);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PepperMusic_Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PepperMusic_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
baseFormat = baseFileFormat.getFormat();
// TAudioFileFormat properties
if (baseFileFormat instanceof TAudioFileFormat)
{
    
    Map properties = ((TAudioFileFormat)baseFileFormat).properties();
    
    String val = (String) properties.get(propiedad);
    
    
   
}
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Cerrar = new javax.swing.JButton();
        jb_Minimizar = new javax.swing.JButton();
        jb_ayuda = new javax.swing.JButton();
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

        jb_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar.png"))); // NOI18N
        jb_Cerrar.setAlignmentY(0.0F);
        jb_Cerrar.setBorder(null);
        jb_Cerrar.setBorderPainted(false);
        jb_Cerrar.setContentAreaFilled(false);
        jb_Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_Cerrar.setIconTextGap(-3);
        jb_Cerrar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jb_Cerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar3.png"))); // NOI18N
        jb_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Cerrar);
        jb_Cerrar.setBounds(230, 0, 30, 30);

        jb_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_minimizar.png"))); // NOI18N
        jb_Minimizar.setBorder(null);
        jb_Minimizar.setBorderPainted(false);
        jb_Minimizar.setContentAreaFilled(false);
        jb_Minimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_minimizar2.png"))); // NOI18N
        jb_Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_MinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Minimizar);
        jb_Minimizar.setBounds(193, 0, 30, 30);

        jb_ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_ayuda.png"))); // NOI18N
        jb_ayuda.setBorderPainted(false);
        jb_ayuda.setContentAreaFilled(false);
        jb_ayuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_ayuda2.png"))); // NOI18N
        getContentPane().add(jb_ayuda);
        jb_ayuda.setBounds(255, 20, 35, 35);

        jp_Principal.setAlignmentX(0.0F);
        jp_Principal.setAlignmentY(0.0F);
        jp_Principal.setOpaque(false);
        jp_Principal.setLayout(null);
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

    private void jb_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CerrarActionPerformed
        // TODO add your handling code here:
        if(this.EnRepro==true){ 
            try {
                this.mi_reproductor.Stop();
            } catch (Exception ex) {
                Logger.getLogger(jp_Canciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            // ventana.Barra.resume();
            //ventana.Barra.stop();
        }
        this.dispose();
    }//GEN-LAST:event_jb_CerrarActionPerformed

    private void jb_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_MinimizarActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jb_MinimizarActionPerformed

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
    private javax.swing.JButton jb_Cerrar;
    private javax.swing.JButton jb_Minimizar;
    private javax.swing.JButton jb_ayuda;
    public javax.swing.JPanel jp_Principal;
    // End of variables declaration//GEN-END:variables
}
