/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JViewport;

/**
 *
 * @author orlando
 */
public class jp_Lista_ARTISTA extends javax.swing.JPanel {

    /**
     * Creates new form jp_Lista
     */
    JList cancion;
    JList guardar;
    jp_Canciones canc;
    private final String canciones[] = { "Good Times, Bad Times" ,
"Babe I'm Gonna Leave You" ,
"You Shook Me" ,
"Dazed and Confused" ,
"Your Time Is Gonna Come" ,
"Black Mountain Side" ,
"Communication Breakdown" ,
"I Can't Quit You Baby" ,
"How Many More Times" ,};
    
    public jp_Lista_ARTISTA(jp_Canciones can) {
        initComponents();
        canc=can;
        guardar=lst_canciones;
        cancion=new JList(canciones);
        
        
        

        cancion.setBackground(new java.awt.Color(0, 0, 0));
        cancion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cancion.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        cancion.setForeground(new java.awt.Color(255, 255, 255));
        cancion.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = canciones;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        cancion.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        cancion.setToolTipText("");
        cancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lst_cancionesMouseClicked(evt);
            }
        });
       /* jScrollPane2.setViewportView(cancion);

        jp_Album.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 230, 210);
        
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

        popup = new javax.swing.JPopupMenu();
        pop_tarde = new javax.swing.JMenuItem();
        pop_lista = new javax.swing.JMenu();
        lista_triste = new javax.swing.JMenuItem();
        lista_bailable = new javax.swing.JMenuItem();
        lista_Alegre = new javax.swing.JMenuItem();
        lista_Estudio = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        pop_letras = new javax.swing.JMenuItem();
        pop_Eliminar = new javax.swing.JMenuItem();
        jButton3 = new javax.swing.JButton();
        jtx_buscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_Album = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_canciones = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lst_tarde = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        popup.setComponentPopupMenu(popup);
        popup.setInvoker(lst_canciones);

        pop_tarde.setText("Agregar a Escuchar más tarde");
        pop_tarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop_tardeActionPerformed(evt);
            }
        });
        popup.add(pop_tarde);

        pop_lista.setText("Agregar a Lista de Reproducción");

        lista_triste.setText("Triste");
        pop_lista.add(lista_triste);

        lista_bailable.setText("Bailable");
        pop_lista.add(lista_bailable);

        lista_Alegre.setText("Alegre");
        pop_lista.add(lista_Alegre);

        lista_Estudio.setText("Estudio");
        pop_lista.add(lista_Estudio);

        popup.add(pop_lista);
        popup.add(jSeparator1);

        pop_letras.setText("AGREGAR LETRAS");
        popup.add(pop_letras);

        pop_Eliminar.setText("ELIMINAR");
        popup.add(pop_Eliminar);

        setOpaque(false);
        setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/album_retroceder.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(140, 65, 30, 21);

        jtx_buscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add(jtx_buscar);
        jtx_buscar.setBounds(35, 35, 170, 25);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Boton 9.png"))); // NOI18N
        jButton2.setToolTipText("Buscar");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jButton2);
        jButton2.setBounds(205, 35, 27, 25);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton 10.png"))); // NOI18N
        jButton1.setToolTipText("Buscar por voz");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jButton1);
        jButton1.setBounds(238, 35, 32, 27);

        jp_Album.setAlignmentX(0.0F);
        jp_Album.setAlignmentY(0.0F);
        jp_Album.setOpaque(false);
        jp_Album.setLayout(null);

        jScrollPane2.setBackground(new java.awt.Color(255, 102, 102));

        lst_canciones.setBackground(new java.awt.Color(0, 0, 0));
        lst_canciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lst_canciones.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        lst_canciones.setForeground(new java.awt.Color(255, 255, 255));
        lst_canciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Freddie Mercury", "Queen", "Pink Floyd", "Rage Against The Machine", "Metallica", "HED PE", "Coldplay", "Sandro", "Camilo Sesto", "Leodan", "The beatles", "Led Zeppelin", "Guns and Roses", "Motorhead", "Pantera", "Slayer", "Ludovico Eanaudi", "Chopin", "C.P.E Bach", "J.S Bach", " " };
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

        jp_Album.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 230, 210);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Recursos/artista_cancion.png")), jp_Album, "Todas las Canciones"); // NOI18N

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jScrollPane4.setBackground(new java.awt.Color(255, 102, 102));
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
        jTabbedPane1.setBounds(30, 60, 240, 240);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Celeste.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 300, 336);
    }// </editor-fold>//GEN-END:initComponents
DefaultListModel modelo = new DefaultListModel();
    private void pop_tardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop_tardeActionPerformed
        // TODO add your handling code here:
        
        
        
            if( jScrollPane2.getViewport().getComponent(0)==cancion) modelo.addElement((String)cancion.getSelectedValue());
         else  modelo.addElement((String)lst_canciones.getSelectedValue());
           lst_tarde.setModel(modelo);
        
        
    }//GEN-LAST:event_pop_tardeActionPerformed

    private void lst_tardeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lst_tardeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lst_tardeMouseClicked

    private void lst_cancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lst_cancionesMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {

            
         if( jScrollPane2.getViewport().getComponent(0)==lst_canciones){
        jScrollPane2.setViewportView(cancion);
        jp_Album.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 230, 210);
         }else{
         jp_Reproduccion repro = new jp_Reproduccion(canc);
            repro.setSize(300, 336);
            repro.setLocation(0, 0);
            canc.jp_Cancion.removeAll();
            canc.jp_Cancion.add(repro);
            canc.jp_Cancion.revalidate();
            canc.jp_Cancion.repaint();
            canc.jtb_repro.setSelected(true);
            canc.jtb_lista.setSelected(false);
         
         
         }
            /*
            jp_Reproduccion repro = new jp_Reproduccion(canc);
            repro.setSize(300, 336);
            repro.setLocation(0, 0);
            canc.jp_Cancion.removeAll();
            canc.jp_Cancion.add(repro);
            canc.jp_Cancion.revalidate();
            canc.jp_Cancion.repaint();
            canc.jtb_repro.setSelected(true);
            canc.jtb_lista.setSelected(false);
*/
            /*    jf_Reproduccion form2 = new jf_Reproduccion();
            form2.setVisible(true);
            Point p = this.getLocation();
            form2.setLocation(p.x,p.y);
            this.dispose();*/
        }

        if(evt.getButton()==MouseEvent.BUTTON3){

            boolean isPopUp = evt.isPopupTrigger();

            if ( !isPopUp) {

                int index= cancion.locationToIndex(evt.getPoint());

                if (index !=-1){
                    lst_canciones.setSelectedIndex(cancion.locationToIndex(evt.getPoint()));
                    //Todo esto de debajo se puede poner en otro método si se quiere
                    //Tienes que borrar antes los elementos que hubiese en el popup

                    //Añades, por ejemplo, el nombre del elemento seleccionado como elemento del popup
                    // popup.add((String)lst_canciones.getSelectedValue());
                    // popup.add("Agregar a Lista de reproducción");

                    popup.setLocation(evt.getLocationOnScreen());

                    popup.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_lst_cancionesMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jScrollPane2.setViewportView(lst_canciones);
        jp_Album.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 230, 210);
    }//GEN-LAST:event_jButton3ActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jp_Album;
    private javax.swing.JTextField jtx_buscar;
    private javax.swing.JMenuItem lista_Alegre;
    private javax.swing.JMenuItem lista_Estudio;
    private javax.swing.JMenuItem lista_bailable;
    private javax.swing.JMenuItem lista_triste;
    private javax.swing.JList<String> lst_canciones;
    public javax.swing.JList<String> lst_tarde;
    private javax.swing.JMenuItem pop_Eliminar;
    private javax.swing.JMenuItem pop_letras;
    private javax.swing.JMenu pop_lista;
    private javax.swing.JMenuItem pop_tarde;
    private javax.swing.JPopupMenu popup;
    // End of variables declaration//GEN-END:variables
}