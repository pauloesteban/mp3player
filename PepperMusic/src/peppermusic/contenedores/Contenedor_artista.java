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
public class Contenedor_artista implements Comparable{
    public String nom_artista;
    ArrayList<ListaDeReproduccion> lista_artista;
    
    public  Contenedor_artista(String nom_artista){
         lista_artista=new ArrayList<ListaDeReproduccion>();
        this.nom_artista=nom_artista;
        
    }
    public void add_artista(ListaDeReproduccion cancion){
        lista_artista.add(cancion);
        
    }
    public ArrayList<ListaDeReproduccion> items_artista(){
        
        
        return lista_artista;
       
       
    }
   
    
    public int compareTo(Object object) {
          //Ordena la lista de canciones segun el nombre de la cancion
            int result=0; 
Contenedor_artista vehiculo = (Contenedor_artista)object; 
if(this.nom_artista.compareTo(vehiculo.nom_artista) < 0){ 
result = -1; 
}else if(this.nom_artista.compareTo(vehiculo.nom_artista) > 0) { 
result = 1; 
} 
 
return result; 
    }
}
