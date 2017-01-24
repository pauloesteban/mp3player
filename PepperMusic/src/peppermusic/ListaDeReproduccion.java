/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

/**
 *
 * @author orlando
 */
public class ListaDeReproduccion  implements Comparable{
    String nom_cancion, nom_artista, nom_album, nom_genero, ruta;
    
    public ListaDeReproduccion(String nom_cancion, String nom_artista, String nom_album, String nom_genero, String ruta){
        
        this.nom_cancion = nom_cancion;
        this.nom_artista = nom_artista;
        this.nom_album = nom_album;
        this.nom_genero = nom_genero;
        this.ruta = ruta;
    }
  @Override 
        public int compareTo(Object object) {
          //Ordena la lista de canciones segun el nombre de la cancion
            int result=0; 
ListaDeReproduccion vehiculo = (ListaDeReproduccion)object; 
if(this.nom_cancion.compareTo(vehiculo.nom_cancion) < 0){ 
result = -1; 
}else if(this.nom_cancion.compareTo(vehiculo.nom_cancion) > 0) { 
result = 1; 
} 
 
return result; 
           /*if ( nom_cancion == null ) {
            return o.nom_cancion == null ? 0 : 1;
        }
        if ( o.nom_cancion == null ) {
            return 1;
        }
              return 0;
           */
}
        
        
    
}
