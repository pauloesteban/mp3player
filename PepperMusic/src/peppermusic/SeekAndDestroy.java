/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListModel;
import org.tritonus.share.sampled.file.TAudioFileFormat;
import peppermusic.contenedores.Contenedor_album;
import peppermusic.contenedores.Contenedor_artista;
import peppermusic.contenedores.Contenedor_genero;

/**
 *
 * @author orlando
 */
public class SeekAndDestroy implements Runnable{
    public   boolean suspended = false,fin=false;
    PepperMusic_Frame ventana;
     public Thread t;
    public boolean buscando = false;
     
    public SeekAndDestroy(PepperMusic_Frame ventana){
        this.ventana = ventana;
       
    }
    
    @Override
     public void run(){
         
         //////mp3.id3tag.genre
           ventana.lista_completa.clear();
           ventana.Lista_album.clear();
           ventana.Lista_artista.clear();
           ventana.Lista_genero.clear();
          modelo.clear();
        rutas.clear();
                  buscando = true;
                buscar(new File("C:\\Users\\"+System.getProperty("user.name").toString()+"\\Desktop"));
                
                for (int i =0; i<modelo.getSize();i++){
                  //  ((!nom_cancion.isEmpty())?nom_cancion:modelo.getElementAt(i).toString()) // Meta_Audio(rutas.getElementAt(i).toString()//modelo.getElementAt(i).toString()
                
                  try{
                   String nom_cancion = (!Meta_Audio(rutas.getElementAt(i).toString(),"title").isEmpty()&&sonEspacios(Meta_Audio(rutas.getElementAt(i).toString(),"title"))) ? Meta_Audio(rutas.getElementAt(i).toString(),"title"):modelo.getElementAt(i).toString();
                   
                    
                   String nom_album = Meta_Audio(rutas.getElementAt(i).toString(),"album");
                   String nom_artista = Meta_Audio(rutas.getElementAt(i).toString(),"author");////((nom_cancion.isEmpty())?nom_cancion:modelo.getElementAt(i).toString()),((nom_album.isEmpty())?nom_album:"no album"),((nom_artista.isEmpty())?nom_artista:"no artista")
                   String nom_genero = Meta_Audio(rutas.getElementAt(i).toString(),"mp3.id3tag.genre");
                  
                   //System.out.println(((!nom_cancion.isEmpty())?nom_cancion:modelo.getElementAt(i).toString()));
                    ListaDeReproduccion lista = new ListaDeReproduccion(nom_cancion,nom_artista,nom_album,nom_genero,rutas.getElementAt(i).toString());
                    ventana.lista_completa.add(lista);
                    
                    ////////////////////////////////
                    ////////Lista por al albumnes
                    //////////////////////////////
                    
                    
                    ////comprobar que si tiene nombre de album
                    if(sonEspacios(nom_album)){
                        //no son espacios vacios entonces
                        //comprobamos con los albumnes agregados antes si pertenece a alguno con un iterator
                        String nom_album_sinE = nom_album.trim();
                        
                        if(ventana.Lista_album.isEmpty()){
                            // se lo realiza una vez para tener algo que comparar
                            Contenedor_album album = new Contenedor_album(nom_album);
                            ventana.Lista_album.add(album);
                            ventana.Lista_album.get(0).add_album(lista);
                           
                            // ventana.Lista_album.add(e);
                        }else{
                             
                            //despues compara cada album y mira en cual pertenece
                          Iterator ite_album = ventana.Lista_album.iterator();
                           boolean pertenece = false;
                             while (ite_album.hasNext()&&!pertenece) {
                               
                              Contenedor_album elemento2 =(Contenedor_album)ite_album.next();
                              if(nom_album_sinE.equalsIgnoreCase(elemento2.nom_album.trim())){
                                 
                                  // si pertenece
                                  elemento2.add_album(lista);
                                  pertenece=true;
                              }
                               }
                              if(pertenece==false){
                                   /// no ha existido ese album y lo agrega
                                    Contenedor_album album2 = new Contenedor_album(nom_album);
                                    ventana.Lista_album.add(album2);
                                    ventana.Lista_album.get(ventana.Lista_album.size()-1).add_album(lista);
                              }
                                 
                          
                        }
                    }
                    /////////////////////////////////////////
                    ////////////////////Ordenar por artista
                    ////////////////////////////////////////
                    
                    ////comprobar que si tiene nombre de album
                    if(sonEspacios(nom_artista)){
                        //no son espacios vacios entonces
                        //comprobamos con los albumnes agregados antes si pertenece a alguno con un iterator
                        String nom_artista_sinE = nom_artista.trim();
                        
                        if(ventana.Lista_artista.isEmpty()){
                            // se lo realiza una vez para tener algo que comparar
                           Contenedor_artista artista = new Contenedor_artista(nom_artista);
                            ventana.Lista_artista.add(artista);
                            ventana.Lista_artista.get(0).add_artista(lista);
                           
                            // ventana.Lista_album.add(e);
                        }else{
                             
                            //despues compara cada album y mira en cual pertenece
                          Iterator ite_artista = ventana.Lista_artista.iterator();
                           boolean pertenece = false;
                             while (ite_artista.hasNext()&&!pertenece) {
                               
                              Contenedor_artista elemento2 =(Contenedor_artista)ite_artista.next();
                              if(nom_artista_sinE.equalsIgnoreCase(elemento2.nom_artista.trim())){
                                 
                                  // si pertenece
                                  elemento2.add_artista(lista);
                                  pertenece=true;
                              }
                               }
                              if(pertenece==false){
                                  
                                   /// no ha existido ese album y lo agrega
                                    Contenedor_artista artista2 = new Contenedor_artista(nom_artista);
                                    ventana.Lista_artista.add(artista2);
                                    ventana.Lista_artista.get(ventana.Lista_artista.size()-1).add_artista(lista);
                              }
                                 
                          
                        }
                    }
                     /////////////////////////////////////////
                    ////////////////////Ordenar por genero
                    ////////////////////////////////////////
                    
                    ////comprobar que si tiene nombre de album
                    if(sonEspacios(nom_genero)){
                         
                        //no son espacios vacios entonces
                        //comprobamos con los albumnes agregados antes si pertenece a alguno con un iterator
                        String nom_genero_sinE = nom_genero.trim();
                        
                        if(ventana.Lista_genero.isEmpty()){
                         
                            // se lo realiza una vez para tener algo que comparar
                           Contenedor_genero genero = new Contenedor_genero(nom_genero);
                            ventana.Lista_genero.add(genero);
                            ventana.Lista_genero.get(0).add_genero(lista);
                           
                            // ventana.Lista_album.add(e);
                        }else{
                            
                            //despues compara cada album y mira en cual pertenece
                          Iterator ite_genero = ventana.Lista_genero.iterator();
                           boolean pertenece = false;
                             while (ite_genero.hasNext()&&!pertenece) {
                               
                              Contenedor_genero elemento2 =(Contenedor_genero)ite_genero.next();
                             
                              if(nom_genero_sinE.equalsIgnoreCase(elemento2.nom_genero.trim())){
                                
                                  // si pertenece
                                  elemento2.add_genero(lista);
                                  pertenece=true;
                                 }
                               }
                              if(pertenece==false){
                                   /// no ha existido ese album y lo agrega
                                  
                                    Contenedor_genero genero2 = new Contenedor_genero(nom_genero);
                                    ventana.Lista_genero.add(genero2);
                                    ventana.Lista_genero.get(ventana.Lista_genero.size()-1).add_genero(lista);
                                     
                              }
                                 
                          
                        }
                    }
                    
                    
                    
                  }catch(NullPointerException e){
                      
                      
                  }
                }
                 Collections.sort(ventana.lista_completa);
                Collections.sort(ventana.Lista_album);
                 Collections.sort(ventana.Lista_artista);
                 Collections.sort(ventana.Lista_genero);
                //imprimeArray(lista_completa);
                   //creamos el iterator para recorrer la lista sin ordenar
                   
        Iterator itListaempleado= ventana.lista_completa.iterator();
        
         DefaultListModel model = new DefaultListModel();
         
        while (itListaempleado.hasNext()) {
            ListaDeReproduccion elemento=(ListaDeReproduccion)itListaempleado.next();
            model.addElement(elemento.nom_cancion);
            //System.out.println(elemento.nom_cancion+" "+elemento.nom_artista+" "+elemento.nom_album);    
        }
        
        //agrupado por album MOTHERFUCKERSS!!!!!!!!
         ventana.inicio.p1.lst_canciones.removeAll();
         ventana.inicio.p1.lst_canciones.setModel(model);
         ventana.inicio.p1.lst_canciones.revalidate();
         ventana.inicio.p1.lst_canciones.repaint();
        
        Iterator prueba = ventana.Lista_album.iterator();
        DefaultListModel model_album = new DefaultListModel();
        while (prueba.hasNext()) {
            Contenedor_album elemento=(Contenedor_album)prueba.next();
            model_album.addElement(elemento.nom_album);
             
            //System.out.println(elemento.nom_album);
            //System.out.println(elemento.nom_cancion+" "+elemento.nom_artista+" "+elemento.nom_album);    
        }
        ventana.inicio.p2.lst_canciones.removeAll();
         ventana.inicio.p2.lst_canciones.setModel(model_album);
         ventana.inicio.p2.lst_canciones.revalidate();
         ventana.inicio.p2.lst_canciones.repaint();
       
         Iterator prueba_ar = ventana.Lista_artista.iterator();
        DefaultListModel model_artista = new DefaultListModel();
        while (prueba_ar.hasNext()) {
            Contenedor_artista elemento=(Contenedor_artista)prueba_ar.next();
            model_artista.addElement(elemento.nom_artista);
             
            //System.out.println(elemento.nom_album);
            //System.out.println(elemento.nom_cancion+" "+elemento.nom_artista+" "+elemento.nom_album);    
        }
        ventana.inicio.p3.lst_canciones.removeAll();
         ventana.inicio.p3.lst_canciones.setModel(model_artista);
         ventana.inicio.p3.lst_canciones.revalidate();
         ventana.inicio.p3.lst_canciones.repaint();
         
         
          Iterator prueba_ge = ventana.Lista_genero.iterator();
        DefaultListModel model_genero = new DefaultListModel();
        while (prueba_ge.hasNext()) {
            Contenedor_genero elemento=(Contenedor_genero)prueba_ge.next();
            model_genero.addElement(elemento.nom_genero);
             
            
            //System.out.println(elemento.nom_cancion+" "+elemento.nom_artista+" "+elemento.nom_album);    
        }
        ventana.inicio.p4.lst_canciones.removeAll();
         ventana.inicio.p4.lst_canciones.setModel(model_genero);
         ventana.inicio.p4.lst_canciones.revalidate();
         ventana.inicio.p4.lst_canciones.repaint();
         
         
              //System.out.println(lista_completa[4].nom_cancion);
           
                buscando = false;
          }
     
     public boolean sonEspacios(String cad)
 {     cad = cad.trim();
       if(cad.isEmpty())return false;
       return true;
     
     /*
        for(int i =0; i<cad.length(); i++)
        if(cad.charAt(i) != ' ')
        return false;

        return true;*/
 }
     public String Meta_Audio(String ruta,String propiedad){
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
String val = null;
if (baseFileFormat instanceof TAudioFileFormat)
{
    
    Map properties = ((TAudioFileFormat)baseFileFormat).properties();
    
     val = (String) properties.get(propiedad);
    
    
   
}
return val;
}
     
     DefaultListModel modelo = new DefaultListModel();
     
     DefaultListModel rutas = new DefaultListModel();
     
    public void buscar(File ruta){
       
        File archivos[] = ruta.listFiles();
//       display(archivos[1].getName());
//        ArrayList<String>lista=new ArrayList<String>();
        if (archivos!=null) {
           
            for (int i = 0; i <archivos.length; i++) {
                if(archivos[i].isDirectory()){
                  buscar(archivos[i]);   
                  //display(archivos[i].getName());
                  
                }
                else{
                    
                                       
                    
                    if (archivos[i].getName().endsWith("mp3")) {
                       
                        //lista.add(archivos[i].getName());
                        
                        
                        modelo.addElement(archivos[i].getName());
                        rutas.addElement(archivos[i]);
                    }
                    
                }
            }
           
        }
    }
    static void imprimeArray( ListaDeReproduccion array) {
        /*for (int i = 0; i < array.length; i++) {
            //System.out.println((i+1) + "cancion+" + array[i].nom_cancion + " - Artista: " + array[i].nom_artista + " - album: " + array[i].nom_album);
        }*/
    }
     
     public void start(){
                t = new Thread (this);
                
                t.start();
            }
   
      void suspend() {
      suspended = true;
      
   }
      void stop() {
      fin =  true;
      
   }
   
   synchronized void resume() {
      suspended = false;
      notify();
      
   }
            
            
    
}

