/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package peppermusic;

import java.awt.Component;
import static java.awt.Frame.ICONIFIED;
import javax.swing.JOptionPane;

/**
 *
 * @author orlando
 */
public class jp_Canciones extends javax.swing.JPanel {

    /** Creates new form jp_Canciones */
    PepperMusic_Frame venta;
    jp_Reproduccion repro;
    jp_Lista lista;
    Component Component[];
    public jp_Canciones(PepperMusic_Frame ventana) {
        initComponents();
        venta=ventana;
        venta.NoRepro=false;
        jtb_lista.setSelected(true);
        lista = new jp_Lista(this);
        
        lista.setSize(300, 336);
        lista.setLocation(0, 0);
        
        jp_Cancion.removeAll();
       
      
        
        jp_Cancion.add(lista);
        jp_Cancion.revalidate();
        jp_Cancion.repaint();
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtb_lista = new javax.swing.JToggleButton();
        jtb_repro = new javax.swing.JToggleButton();
        jb_Cerrar = new javax.swing.JButton();
        jb_Minimizar = new javax.swing.JButton();
        jb_Regresar = new javax.swing.JButton();
        jp_Cancion = new javax.swing.JPanel();

        setLayout(null);

        jtb_lista.setText("Lista");
        jtb_lista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtb_lista.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jtb_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_listaActionPerformed(evt);
            }
        });
        add(jtb_lista);
        jtb_lista.setBounds(40, 0, 50, 25);

        jtb_repro.setText("Reproducción");
        jtb_repro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtb_repro.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jtb_repro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_reproActionPerformed(evt);
            }
        });
        add(jtb_repro);
        jtb_repro.setBounds(90, 0, 90, 25);

        jb_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_Cerrar2.png"))); // NOI18N
        jb_Cerrar.setAlignmentY(0.0F);
        jb_Cerrar.setBorder(null);
        jb_Cerrar.setBorderPainted(false);
        jb_Cerrar.setContentAreaFilled(false);
        jb_Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_Cerrar.setIconTextGap(-3);
        jb_Cerrar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jb_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CerrarActionPerformed(evt);
            }
        });
        add(jb_Cerrar);
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
        add(jb_Minimizar);
        jb_Minimizar.setBounds(193, 0, 30, 30);

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

        jp_Cancion.setOpaque(false);
        jp_Cancion.setLayout(null);
        add(jp_Cancion);
        jp_Cancion.setBounds(0, 0, 300, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void jtb_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_listaActionPerformed
  
        if(jtb_lista.isSelected()==false){

            jtb_lista.setSelected(true);

        }else{
            if(venta.EnRepro==true){venta.Barra.resume();venta.Barra.stop();}
            jtb_repro.setSelected(false);
            //codigo pantalla LISTA
            lista = new jp_Lista(this);
        
        lista.setSize(300, 336);
        lista.setLocation(0, 0);
        
        jp_Cancion.removeAll();
       
      
        
        jp_Cancion.add(lista);
        jp_Cancion.revalidate();
        jp_Cancion.repaint();
         
        

        
        }
    }//GEN-LAST:event_jtb_listaActionPerformed

    private void jtb_reproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_reproActionPerformed
        // TODO add your handling code here:

        if(jtb_repro.isSelected()==false){

            jtb_repro.setSelected(true);

        }else{

            jtb_lista.setSelected(false);

            //codigo pantalla REPRODUCCIÓN
            
           /*        
            Component = this.getComponents();
            Component[5].setVisible(false);//activamos o desactivamos el JButton
            */
	
       
        
        repro = new jp_Reproduccion(this);
        repro.setSize(300, 336);
        repro.setLocation(0, 0);
        jp_Cancion.removeAll();
         jp_Cancion.add(repro);
         jp_Cancion.revalidate();
       jp_Cancion.repaint();
         
        
       
       
        
    //  Component[6].setVisible(false);
       //JOptionPane.showMessageDialog(venta, Component[5]);
       
      
        //Component[6].setVisible(true);
        
         /*
         {
             Component = this.getComponents();
             Component[6].setVisible(true);
         }*/

        }

    }//GEN-LAST:event_jtb_reproActionPerformed

    private void jb_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CerrarActionPerformed
        // TODO add your handling code here:
       if(venta.EnRepro==true){ venta.Barra.resume();
        venta.Barra.stop();}
        venta.dispose();
        
    }//GEN-LAST:event_jb_CerrarActionPerformed

    private void jb_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_MinimizarActionPerformed
        // TODO add your handling code here:
         venta.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jb_MinimizarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Cerrar;
    private javax.swing.JButton jb_Minimizar;
    private javax.swing.JButton jb_Regresar;
    public javax.swing.JPanel jp_Cancion;
    public javax.swing.JToggleButton jtb_lista;
    public javax.swing.JToggleButton jtb_repro;
    // End of variables declaration//GEN-END:variables

}
