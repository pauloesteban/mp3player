/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic.contenedores;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import peppermusic.ListaDeReproduccion;

/**
 *
 * @author orlando
 */
public class Contenedor_album implements Comparable{
    public String nom_album;
    ArrayList<ListaDeReproduccion> lista_album;
    
    public  Contenedor_album(String nom_album){
         lista_album=new ArrayList<ListaDeReproduccion>();
        this.nom_album=nom_album;
        
    }
    public void add_album(ListaDeReproduccion cancion){
        lista_album.add(cancion);
        
    }
    public ArrayList<ListaDeReproduccion> items_album(){
        
        
        return lista_album;
       
       
    }
   
    
    public int compareTo(Object object) {
          //Ordena la lista de canciones segun el nombre de la cancion
            int result=0; 
Contenedor_album vehiculo = (Contenedor_album)object; 
if(this.nom_album.compareTo(vehiculo.nom_album) < 0){ 
result = -1; 
}else if(this.nom_album.compareTo(vehiculo.nom_album) > 0) { 
result = 1; 
} 
 
return result; 
    }
}
