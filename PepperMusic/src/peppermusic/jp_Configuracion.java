/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import static java.awt.Frame.ICONIFIED;

/**
 *
 * @author orlando
 */
public class jp_Configuracion extends javax.swing.JPanel {

    /**
     * Creates new form jp_Configuracion
     */
    PepperMusic_Frame venta;
    public jp_Configuracion(PepperMusic_Frame ventana) {
        initComponents();
        venta=ventana;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Regresar = new javax.swing.JButton();
        jb_Minimizar = new javax.swing.JButton();
        jb_Cerrar = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();
        jSlider4 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jb_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_regresar.png"))); // NOI18N
        jb_Regresar.setBorder(null);
        jb_Regresar.setBorderPainted(false);
        jb_Regresar.setContentAreaFilled(false);
        jb_Regresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_regresar2.png"))); // NOI18N
        jb_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_RegresarActionPerformed(evt);
            }
        });
        add(jb_Regresar);
        jb_Regresar.setBounds(90, 302, 123, 30);

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
        add(jb_Minimizar);
        jb_Minimizar.setBounds(193, 0, 30, 30);

        jb_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_Cerrar2.png"))); // NOI18N
        jb_Cerrar.setAlignmentY(0.0F);
        jb_Cerrar.setBorder(null);
        jb_Cerrar.setBorderPainted(false);
        jb_Cerrar.setContentAreaFilled(false);
        jb_Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_Cerrar.setIconTextGap(-3);
        jb_Cerrar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jb_Cerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_Cerrar.png"))); // NOI18N
        jb_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CerrarActionPerformed(evt);
            }
        });
        add(jb_Cerrar);
        jb_Cerrar.setBounds(230, 0, 30, 30);

        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        add(jSlider1);
        jSlider1.setBounds(230, 50, 30, 200);

        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        add(jSlider2);
        jSlider2.setBounds(170, 50, 30, 200);

        jSlider3.setOrientation(javax.swing.JSlider.VERTICAL);
        add(jSlider3);
        jSlider3.setBounds(110, 50, 30, 200);

        jSlider4.setOrientation(javax.swing.JSlider.VERTICAL);
        add(jSlider4);
        jSlider4.setBounds(40, 50, 30, 200);

        jLabel2.setText("GANANCIA");
        add(jLabel2);
        jLabel2.setBounds(220, 260, 70, 14);

        jLabel3.setText("BAJOS");
        add(jLabel3);
        jLabel3.setBounds(170, 260, 40, 14);

        jLabel4.setText("MEDIOS");
        add(jLabel4);
        jLabel4.setBounds(100, 260, 50, 14);

        jLabel5.setText("GRAVES");
        add(jLabel5);
        jLabel5.setBounds(40, 260, 60, 14);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Celeste.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 336);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_RegresarActionPerformed
        // TODO add your handling code here:
        jp_Inicio ini = new jp_Inicio(venta);
        ini.setSize(300, 336);
        ini.setLocation(0, 0);
        venta.jp_Principal.removeAll();
        venta.jp_Principal.add(ini);
        venta.jp_Principal.revalidate();
        venta.jp_Principal.repaint();

    }//GEN-LAST:event_jb_RegresarActionPerformed

    private void jb_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_MinimizarActionPerformed
        // TODO add your handling code here:
        venta.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jb_MinimizarActionPerformed

    private void jb_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CerrarActionPerformed
        // TODO add your handling code here:
        venta.dispose();
    }//GEN-LAST:event_jb_CerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider jSlider4;
    private javax.swing.JButton jb_Cerrar;
    private javax.swing.JButton jb_Minimizar;
    private javax.swing.JButton jb_Regresar;
    // End of variables declaration//GEN-END:variables
}