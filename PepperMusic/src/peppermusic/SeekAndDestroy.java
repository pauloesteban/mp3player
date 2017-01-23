/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListModel;
import org.tritonus.share.sampled.file.TAudioFileFormat;

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
           ventana.lista_completa.clear();
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
                    //System.out.println(((!nom_cancion.isEmpty())?nom_cancion:modelo.getElementAt(i).toString()));
                    ListaDeReproduccion lista = new ListaDeReproduccion(nom_cancion,nom_artista,nom_album,rutas.getElementAt(i).toString());
                    ventana.lista_completa.add(lista);
                  }catch(NullPointerException e){
                      
                      
                  }
                }
                 Collections.sort(ventana.lista_completa);
                 
                 
                //imprimeArray(lista_completa);
                   //creamos el iterator para recorrer la lista sin ordenar
                   
        Iterator itListaempleado= ventana.lista_completa.iterator();
        
         DefaultListModel model = new DefaultListModel();
        while (itListaempleado.hasNext()) {
            ListaDeReproduccion elemento=(ListaDeReproduccion)itListaempleado.next();
            model.addElement(elemento.nom_cancion);
            //System.out.println(elemento.nom_cancion+" "+elemento.nom_artista+" "+elemento.nom_album);    
        }
         ventana.inicio.p1.lst_canciones.removeAll();
         ventana.inicio.p1.lst_canciones.setModel(model);
         ventana.inicio.p1.lst_canciones.revalidate();
         ventana.inicio.p1.lst_canciones.repaint();
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
