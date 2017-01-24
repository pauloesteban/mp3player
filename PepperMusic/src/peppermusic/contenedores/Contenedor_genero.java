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
public class Contenedor_genero implements Comparable{
    public String nom_genero;
    ArrayList<ListaDeReproduccion> lista_genero;
    
    public  Contenedor_genero(String nom_genero){
         lista_genero=new ArrayList<ListaDeReproduccion>();
        this.nom_genero=nom_genero;
        
    }
    public void add_genero(ListaDeReproduccion cancion){
        lista_genero.add(cancion);
        
    }
    public ArrayList<ListaDeReproduccion> items_genero(){
        
        
        return lista_genero;
       
       
    }
   
    
    public int compareTo(Object object) {
          //Ordena la lista de canciones segun el nombre de la cancion
            int result=0; 
Contenedor_genero vehiculo = (Contenedor_genero)object; 
if(this.nom_genero.compareTo(vehiculo.nom_genero) < 0){ 
result = -1; 
}else if(this.nom_genero.compareTo(vehiculo.nom_genero) > 0) { 
result = 1; 
} 
 
return result; 
    }
}
