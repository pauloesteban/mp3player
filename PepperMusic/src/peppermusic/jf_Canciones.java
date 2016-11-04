/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;


/**
 *
 * @author orlando
 */
public class jf_Canciones extends javax.swing.JFrame {

    /**
     * Creates new form jf_Canciones
     */
    
   
    public jf_Canciones() {
         this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
         this.setSize(new Dimension(300, 325));
        this.setMinimumSize(new Dimension(0, 0));
        
        this.setResizable(false); // anula el boton maximizar
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,100,100);
        AWTUtilities.setWindowShape(this, forma);
        
         
     jLabel2.setBackground(new Color(0,0,0,200));
        jLabel3.setBackground(new Color(103,50,200,200));
       jScrollPane2.setOpaque(false);
       jScrollPane2.getViewport().setOpaque(false);
       jScrollPane1.setOpaque(false);
       jScrollPane1.getViewport().setOpaque(false);
       
       lst_canciones.setCellRenderer(new TransparentListCellRenderer());
       lst_letras.setCellRenderer(new TransparentListCellRenderer());
        
       lst_canciones.setOpaque(false);
       lst_letras.setOpaque(false);
        
        
    }
    public class TransparentListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        setOpaque(isSelected);
        return this;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        lst_canciones = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_letras = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 325));
        setResizable(false);
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

        jScrollPane2.setBackground(new java.awt.Color(255, 102, 102));

        lst_canciones.setBackground(new java.awt.Color(0, 0, 0));
        lst_canciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lst_canciones.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        lst_canciones.setForeground(new java.awt.Color(255, 255, 255));
        lst_canciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "39", "Bohemian Rhapsody", "Bombtrack", "Bullet in the Head", "Bulls on Parade", "Death On Two Legs (Dedicated To...)", "God Save The Queen", "Good Company", "I'm In Love With My Car", "Killing in the Name", "Lazing On A Sunday Afternoon", "Love of My Life", "People of the Sun", "Seaside Rendezvous", "Sweet Lady", "The Prophet's Song", "You're My Best Friend" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_canciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lst_canciones.setToolTipText("");
        lst_canciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lst_cancionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lst_canciones);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 60, 220, 220);

        lst_letras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lst_letras.setForeground(new java.awt.Color(255, 255, 255));
        lst_letras.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "B", "D", "G", "I", "K", "L", "P", "S", "Y" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lst_letras);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 60, 20, 220);

        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(30, 30, 170, 25);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton 10.png"))); // NOI18N
        jButton1.setToolTipText("Por Voz");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 30, 35, 25);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Boton 9.png"))); // NOI18N
        jButton2.setToolTipText("Buscar");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 30, 27, 25);

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
        jButton3.setBounds(130, 280, 33, 32);

        jLabel3.setBackground(new java.awt.Color(128, 16, 181));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 60, 20, 220);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setAutoscrolls(true);
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(220, 200));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 220, 220);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo_Canciones.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 325));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 325);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked
int x,y;

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
         Point p = MouseInfo.getPointerInfo().getLocation();
          this.setLocation(p.x-x,p.y-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       PepperMusicGUI form2 = new PepperMusicGUI();
        form2.setVisible(true);
        Point p = this.getLocation();
        form2.setLocation(p.x,p.y);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lst_cancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lst_cancionesMouseClicked
        // TODO add your handling code here:
         if (evt.getClickCount() == 2) {
             jf_Reproduccion form2 = new jf_Reproduccion();
        form2.setVisible(true);
        Point p = this.getLocation();
        form2.setLocation(p.x,p.y);
        this.dispose();
          }
        
    }//GEN-LAST:event_lst_cancionesMouseClicked

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
            java.util.logging.Logger.getLogger(jf_Canciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jf_Canciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jf_Canciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf_Canciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_Canciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> lst_canciones;
    private javax.swing.JList<String> lst_letras;
    // End of variables declaration//GEN-END:variables
}