/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import peppermusic.AutoComboBox.AutocompleteJComboBox;

/**
 *
 * @author orlando
 */
public class jp_Lista_ALBUM extends jp_Canciones {

    /**
     * Creates new form jp_Lista
     */
    
    
   
    jp_Canciones canc;
   
    PepperMusic_Frame ventana;
    public jp_Lista_ALBUM(PepperMusic_Frame venta) {
        super(venta);
        ventana=venta;
        initComponents();
        ventana=venta;
         
        
       
        if(ventana.EnRepro==false)super.setEnabled_Reproduccion(false);
        super.setSelected_Lista(true);
        super.setSelected_Reproduccion(false);

        
       /* jScrollPane2.setViewportView(cancion);

        jp_Album.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 230, 210);
        
        */
         if (ventana.skin == 0){
            
              fondo1.setIcon(new ImageIcon(ventana.getClass().getResource("/Recursos/Fondo_Celeste.png")));
             
         }
          if (ventana.skin == 1){
             
               fondo1.setIcon(new ImageIcon(ventana.getClass().getResource("/Recursos/clasica2.png")));
          }
           if (ventana.skin == 2){
              
                fondo1.setIcon(new ImageIcon(ventana.getClass().getResource("/Recursos/rock2.png")));
           }
            if (ventana.skin == 3){
                
                fondo1.setIcon(new ImageIcon(ventana.getClass().getResource("/Recursos/urbano2.png")));
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

        popup = new javax.swing.JPopupMenu();
        pop_tarde = new javax.swing.JMenuItem();
        jb_buscar = new javax.swing.JButton();
        btnActualizarCanciones = new javax.swing.JButton();
        jcm_buscar = new AutocompleteJComboBox(ventana.searchable);
        jb_Regresar_Album = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_Album = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_canciones = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lst_tarde = new javax.swing.JList<>();
        fondo1 = new javax.swing.JLabel();

        popup.setComponentPopupMenu(popup);
        popup.setInvoker(lst_canciones);

        pop_tarde.setText("Agregar a Escuchar más tarde");
        pop_tarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop_tardeActionPerformed(evt);
            }
        });
        popup.add(pop_tarde);

        setOpaque(false);
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                formVetoableChange(evt);
            }
        });
        setLayout(null);

        jb_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Boton 9.png"))); // NOI18N
        jb_buscar.setToolTipText("Buscar");
        jb_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });
        add(jb_buscar);
        jb_buscar.setBounds(230, 30, 27, 25);

        btnActualizarCanciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_actualizar.png"))); // NOI18N
        btnActualizarCanciones.setBorderPainted(false);
        btnActualizarCanciones.setContentAreaFilled(false);
        btnActualizarCanciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_actualizar2.png"))); // NOI18N
        btnActualizarCanciones.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_actualizar2.png"))); // NOI18N
        btnActualizarCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCancionesActionPerformed(evt);
            }
        });
        add(btnActualizarCanciones);
        btnActualizarCanciones.setBounds(245, 55, 30, 30);

        jcm_buscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcm_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcm_buscarMouseClicked(evt);
            }
        });
        jcm_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcm_buscarActionPerformed(evt);
            }
        });
        add(jcm_buscar);
        jcm_buscar.setBounds(38, 30, 190, 25);

        jb_Regresar_Album.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_regresar_total.png"))); // NOI18N
        jb_Regresar_Album.setBorder(null);
        jb_Regresar_Album.setBorderPainted(false);
        jb_Regresar_Album.setContentAreaFilled(false);
        jb_Regresar_Album.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_regresar_total2.png"))); // NOI18N
        jb_Regresar_Album.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Regresar_AlbumActionPerformed(evt);
            }
        });
        add(jb_Regresar_Album);
        jb_Regresar_Album.setBounds(125, 62, 25, 25);

        jp_Album.setAlignmentX(0.0F);
        jp_Album.setAlignmentY(0.0F);
        jp_Album.setOpaque(false);
        jp_Album.setLayout(null);

        jScrollPane2.setBackground(new java.awt.Color(255, 102, 102));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        lst_canciones.setBackground(new java.awt.Color(0, 0, 0));
        lst_canciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lst_canciones.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        lst_canciones.setForeground(new java.awt.Color(255, 255, 255));
        lst_canciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lst_canciones.setToolTipText("");
        lst_canciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lst_cancionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lst_canciones);

        jp_Album.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 240, 210);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Recursos/album_cancion.png")), jp_Album, "Todas las Canciones"); // NOI18N

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jScrollPane4.setBackground(new java.awt.Color(255, 102, 102));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setAlignmentX(0.0F);
        jScrollPane4.setAlignmentY(0.0F);

        lst_tarde.setBackground(new java.awt.Color(0, 0, 0));
        lst_tarde.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lst_tarde.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        lst_tarde.setForeground(new java.awt.Color(255, 255, 255));
        lst_tarde.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lst_tarde.setToolTipText("");
        lst_tarde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lst_tardeMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(lst_tarde);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(0, 0, 230, 210);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_mastarde.png")), jPanel3, "Escuchar más tarde"); // NOI18N

        add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 60, 250, 240);

        fondo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Celeste.png"))); // NOI18N
        fondo1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fondo1PropertyChange(evt);
            }
        });
        add(fondo1);
        fondo1.setBounds(0, 0, 300, 336);
    }// </editor-fold>//GEN-END:initComponents
DefaultListModel modelo = new DefaultListModel();
    private void pop_tardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop_tardeActionPerformed
        // TODO add your handling code here:
          modelo.addElement(lista.getSelectedValue());
         
           lst_tarde.setModel(modelo);
        
        
    }//GEN-LAST:event_pop_tardeActionPerformed

    private void lst_tardeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lst_tardeMouseClicked
        // TODO add your handling code here:
        if(lista.getSelectedValue()!=null&&evt.getClickCount() == 2){
                 ventana.jp_Principal.getComponent(2).setVisible(false);
                 ventana.NoRepro = false;
                 super.setEnabled_Reproduccion(true);
                 ventana.jp_Principal.getComponent(1).setVisible(true);
         
               
                 try {
                     ventana.EnRepro=true;//"/Recursos/You're_My_Best_Friend.mp3"
                  
                     ventana.mi_reproductor.saltando=true;
                     ventana.nom_cancion=lst_tarde.getSelectedValue();
                     ventana.indice_actual=lst_tarde.getSelectedIndex();
                     ventana.lista_actual=modelo;
                   
                     
                     String ruta_tarde = buscarRuta(lst_tarde.getSelectedValue());
                     ventana.indice_actual=lst_tarde.getSelectedIndex();
//.getElementAt(index).toString()
                    // ventana.indice=(int)tarde_index.get(index);
                  //   System.out.println(lst_tarde.getSelectedValue().toString());
                     ventana.mi_reproductor.play(ruta_tarde);
                      ventana.mi_reproductor.saltando=false;
                     
                 } catch (Exception ex) {
                     System.out.println("Error men: " + ex.getMessage());
                 }
        }
    }//GEN-LAST:event_lst_tardeMouseClicked

  JList lista = new JList();
    DefaultListModel model_album = new DefaultListModel();
    private void lst_cancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lst_cancionesMouseClicked
        // TODO add your handling code here:
        
        if (evt.getClickCount() == 2&&lst_canciones.getSelectedValue()!=null) {
           
            
            
      
         if( jScrollPane2.getViewport().getComponent(0)==lst_canciones){
             
           lista.setBackground(new java.awt.Color(0, 0, 0));
        lista.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lista.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
       lista.setForeground(new java.awt.Color(255, 255, 255));
        
        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista.setToolTipText("");
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventana.indice_cancion = lista.locationToIndex(evt.getPoint());
                lst_cancionesMouseClicked(evt);
                
            }
        }); 
              ventana.indice_album = lst_canciones.locationToIndex(evt.getPoint());
            Iterator prueba = ventana.Lista_album.get(ventana.indice_album).items_album().iterator();
         
        while (prueba.hasNext()) {
             ListaDeReproduccion elemento=( ListaDeReproduccion)prueba.next();
             model_album.addElement(elemento.nom_cancion);
             
            System.out.println(elemento.nom_cancion);
            //System.out.println(elemento.nom_cancion+" "+elemento.nom_artista+" "+elemento.nom_album);    
        }
             
          lista.setModel(model_album );
          jScrollPane2.setViewportView(lista);
          jp_Album.add(jScrollPane2);
          jScrollPane2.setBounds(0, 0, 230, 210);
        
       
         
         }else{
             
             
             
                 ventana.EnRepro=true;
                 ventana.jp_Principal.getComponent(2).setVisible(false);
                 ventana.NoRepro = false;
                 super.setEnabled_Reproduccion(true);
                 ventana.jp_Principal.getComponent(1).setVisible(true);
                 
                 
                 try {
                    
                     ventana.mi_reproductor.saltando=true;
                     System.out.println("album="+model_album);
                     ventana.lista_actual=model_album;
                     String ruta_actual =buscarRuta(lista.getSelectedValue().toString());
                     ventana.indice_actual=lista.getSelectedIndex();
                    // System.out.println();//ventana.Lista_album.get(ventana.indice_album).items_album().get(ventana.indice_cancion).ruta
                    ventana.mi_reproductor.play(ruta_actual);
                     ventana.mi_reproductor.saltando=false;
                     
                 } catch (Exception ex) {
                     System.out.println("Error: " + ex.getMessage());
                 }
                 
       }
        }
        if(evt.getButton()==MouseEvent.BUTTON3&& jScrollPane2.getViewport().getComponent(0)!=lst_canciones){
           
            boolean isPopUp = evt.isPopupTrigger();

            if ( !isPopUp) {

               // int index= cancion.locationToIndex(evt.getPoint());
                    
                if (lista.getSelectedValue()!=null){
                    //lst_canciones.setSelectedIndex(cancion.locationToIndex(evt.getPoint()));
                    //Todo esto de debajo se puede poner en otro método si se quiere
                    //Tienes que borrar antes los elementos que hubiese en el popup

                    //Añades, por ejemplo, el nombre del elemento seleccionado como elemento del popup
                   

                    popup.setLocation(evt.getLocationOnScreen());

                    popup.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_lst_cancionesMouseClicked
    
    private void jb_Regresar_AlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Regresar_AlbumActionPerformed
        // TODO add your handling code here:
        jScrollPane2.setViewportView(lst_canciones);
        jp_Album.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 230, 210);
    }//GEN-LAST:event_jb_Regresar_AlbumActionPerformed

    private void formVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_formVetoableChange
        // TODO add your handling code here:
         
    }//GEN-LAST:event_formVetoableChange

    private void fondo1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fondo1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_fondo1PropertyChange

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        System.out.println("aqui="+ventana.EnRepro);
        if(ventana.EnRepro) super.setEnabled_Reproduccion(true);
        else  super.setEnabled_Reproduccion(false);
        
    }//GEN-LAST:event_formComponentShown

    private void btnActualizarCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCancionesActionPerformed

        if(!ventana.inicial.buscando)ventana.inicial.start();
    }//GEN-LAST:event_btnActualizarCancionesActionPerformed

    private void jcm_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcm_buscarMouseClicked
        // TODO add your handling code here:
        //  if(evt.getClickCount()==1){
            System.out.println(jcm_buscar.getSelectedItem());
            //}

    }//GEN-LAST:event_jcm_buscarMouseClicked

    private void jcm_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcm_buscarActionPerformed
        // TODO add your handling code here:
        //     System.out.println(jcm_buscar.getSelectedItem());
    }//GEN-LAST:event_jcm_buscarActionPerformed
 public String buscarRuta(String busca){
                
        Iterator itListaempleado= ventana.lista_completa.iterator();
        
           int h=0;
        
        while (itListaempleado.hasNext()) {
            ListaDeReproduccion elemento=(ListaDeReproduccion)itListaempleado.next();
          
            if(elemento.nom_cancion.equals(busca)){
                  ventana.nom_cancion=elemento.nom_cancion;
                  ventana.indice_actual=h;
                ventana.indice=h;
                return elemento.ruta;
          
            }
            h++;
            //System.out.println(elemento.nom_cancion+" "+elemento.nom_artista+" "+elemento.nom_album);    
        }
        return "NO EXISTE";
 }
    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        // TODO add your handling code here:

        if(jcm_buscar.getSelectedItem()!=null){

            String ruta = buscarRuta(jcm_buscar.getSelectedItem().toString());
            if(!ruta.equals("NO EXISTE")){

                ventana.jp_Principal.getComponent(2).setVisible(false);
                ventana.NoRepro = false;
                // ventana.cancion_actual= ventana.lista_completa.get(index);
                //   ventana.ruta_txt = "C:\\PepperMusic_Datos\\Letras\\"+ventana.lista_completa.get(ventana.indice).nom_cancion+".txt";
                // ventana.nom_cancion=lst_tarde.getSelectedValue().toString();
                super.setEnabled_Reproduccion(true);
                ventana.jp_Principal.getComponent(1).setVisible(true);

                try {
                    ventana.EnRepro=true;//"/Recursos/You're_My_Best_Friend.mp3"
                   ventana.lista_actual=null;
                    ventana.mi_reproductor.saltando=true;
                    ventana.mi_reproductor.play(ruta);
                     ventana.mi_reproductor.saltando=false;

                } catch (Exception ex) {
                    System.out.println("Error men: " + ex.getMessage());
                }
            }
        }

    }//GEN-LAST:event_jb_buscarActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
          if(ventana.EnRepro) super.setEnabled_Reproduccion(true);
        else  super.setEnabled_Reproduccion(false);
    }//GEN-LAST:event_formAncestorAdded
 
//AutocompleteJComboBox
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCanciones;
    private javax.swing.JLabel fondo1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_Regresar_Album;
    private javax.swing.JButton jb_buscar;
    public AutocompleteJComboBox jcm_buscar;
    private javax.swing.JPanel jp_Album;
    public javax.swing.JList<String> lst_canciones;
    public javax.swing.JList<String> lst_tarde;
    private javax.swing.JMenuItem pop_tarde;
    private javax.swing.JPopupMenu popup;
    // End of variables declaration//GEN-END:variables
}
