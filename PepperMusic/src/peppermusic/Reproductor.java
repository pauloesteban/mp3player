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

import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;
import java.io.InputStream;
import static java.lang.System.out;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.sound.sampled.SourceDataLine;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;
import javazoom.jlgui.player.amp.tag.APEInfo;

public class Reproductor  implements BasicPlayerListener{
    
    private BasicPlayer player  ;
    PepperMusic_Frame ventana;
    private APEInfo tas;
    jp_Reproduccion repro;
    BasicController control ;
    String dura_minu;
    public float[] equalizer; //Para pasar los parametros del ecualizador
    float[] eq = new float[32]; 
    public Reproductor(PepperMusic_Frame venta){
        ventana = venta;
        player = new BasicPlayer( );
       
       
        
        control = (BasicController) player;
        //repro = (jp_Reproduccion)ventana.jp_Principal.getComponent(1);
        
        // repro  = (jp_Reproduccion) component[1];
        
        //  control = (BasicController) tas;
        
        player.addBasicPlayerListener(this);
    }
    
    
 
    public void Pausa() throws Exception {
      control.pause();
      
    }
 
    public void Continuar() throws Exception {
     control.resume();
    }
 
    public void Stop() throws Exception {
      control.stop();
       
    }
    

    public void play(String filename)
     {
          
       // Instantiate BasicPlayer.
     
      // BasicPlayer is a BasicController.
      
      // Register BasicPlayerTest to BasicPlayerListener events.
      // It means that this object will be notified on BasicPlayer
      // events such as : opened(...), progress(...), stateUpdated(...)
     
   // tes = tas.getTagInfo(filename);
  try
     { 
      // Open file, or URL or Stream (shoutcast, icecast) to play.
         System.out.println(filename);
      control.open(new File(filename));
       
      // control.open(new URL("http://yourshoutcastserver.com:8000"));

      // Start playback in a thread.
      control.play();
   ventana.EnRepro=true;
      // If you want to pause/resume/pause the played file then
      // write a Swing player and just call control.pause(),
      // control.resume() or control.stop(). 
      // Use control.seek(bytesToSkip) to seek file
      // (i.e. fast forward and rewind). seek feature will
      // work only if underlying JavaSound SPI implements
      // skip(...). True for MP3SPI and SUN SPI's
      // (WAVE, AU, AIFF).

      // Set Volume (0 to 1.0).
      control.setGain(0.85);
      // Set Pan (-1.0 to 1.0).
      control.setPan(0.0);
    }
    catch (BasicPlayerException e)
    {
      e.printStackTrace();
    }
  }

    /**
     * Open callback, stream is ready to play.
     *
     * properties map includes audio format dependant features such as
     * bitrate, duration, frequency, channels, number of frames, vbr flag, ... 
     *
     * @param stream could be File, URL or InputStream
     * @param properties audio stream properties.
     */
    public void opened(Object stream, Map properties)
    {
         ventana.audioInfo = properties;
       //   try {
              // Pay attention to properties. It's useful to get duration,
              // bitrate, channels, even tag such as ID3v2.
              display("opened : "+properties.toString());
              ventana.duracion = Long.valueOf( properties.get("duration").toString());
              display("tiempo: "+(ventana.duracion/1000));
              ventana.bits_total=Long.valueOf( properties.get("audio.length.bytes").toString());
              //
             // control.seek(5000);

              //this.getArtist();
         // } catch (BasicPlayerException ex) {
         //     Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
         // }
           ventana.nom_album=ventana.audioInfo.get("album").toString();
           //if(!ventana.audioInfo.get("title").toString().isEmpty()&&sonEspacios(ventana.audioInfo.get("title").toString()))ventana.nom_cancion=ventana.audioInfo.get("title").toString();
           System.out.println("indice_actual="+ventana.indice_actual);
           
           ventana.nom_cancion=(ventana.lista_actual!=null)? ventana.lista_actual.getElementAt(ventana.indice_actual).toString():ventana.lista_completa.get(ventana.indice).nom_cancion;
           ventana.nom_artista=ventana.audioInfo.get("author").toString();
          System.out.println(ventana.nom_cancion);
           long duri=ventana.duracion/1000000;
           dura_minu= (((duri/60<10)?"0":"")+(duri/60)+":"+((duri%60<10)?"0":"")+(duri%60));
          
    }
    boolean saltando=false;
    public void seeked(long l) throws BasicPlayerException{
      saltando=true;
      control.seek(l);
      saltando=false;
      
  }
    public boolean sonEspacios(String cad)
    {     cad = cad.trim();
          if(cad.isEmpty())return false;
          return true;
    }
    /**
    * Progress callback while playing.
    * 
    * This method is called severals time per seconds while playing.
    * properties map includes audio format features such as
    * instant bitrate, microseconds position, current frame number, ... 
    * 
    * @param bytesread from encoded stream.
    * @param microseconds elapsed (<b>reseted after a seek !</b>).
    * @param pcmdata PCM samples.
    * @param properties audio stream parameters.
    */
    private long secondsAmount = 0;
      @Override
    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties)
    {
        // Pay attention to properties. It depends on underlying JavaSound SPI
        // MP3SPI provides mp3.equalizer.

        //display("progress : "+properties.toString());

        // if(ventana.audioInfo.get("title").toString().isEmpty())System.out.println("_"+ventana.audioInfo.get("title").toString()+"_");else System.out.println("b"+ventana.audioInfo.get("title").toString()+"a");
        ventana.tiempo = Long.valueOf(properties.get("mp3.position.microseconds").toString());
        // display("bytes: "+ventana.bits_total);
                //repro.jp_Progreso.ActualizarProgreso(50);
           
          
        long temp = ventana.tiempo/1000000;
        long dura = ventana.duracion/1000000;
        ventana.repro.jp_Progreso.ActualizarProgreso(temp,dura);
        ventana.repro.jp_Progreso.repaint();

        ventana.repro.jlb_tiempo.setText((((temp/60<10)?"0":"")+temp/60)+":" +(((temp%60<10)? "0":"")+ temp%60)+ " - " + dura_minu);


         //if (ventana.audioInfo.containsKey("basicplayer.sourcedataline")) {
        // Spectrum/time analyzer

        if (ventana.audioInfo.containsKey("basicplayer.sourcedataline")) {
        // Spectrum/time analyzer
            if (ventana.espectrometro != null) {
                ventana.espectrometro.writeDSP(pcmdata);
                ventana.espectrometro.writeDSP(pcmdata);
            }
        
        }
        //Para el Ecualizador
        equalizer = (float[]) properties.get("mp3.equalizer");
        System.arraycopy(eq, 0, equalizer, 0, equalizer.length);
//        display("Propiedades: "+properties.toString());
        
        
        
    //repro = ventana.jp_Principal.getComponent(1);
    //display("gola : "+tes.getArtist());
    //display("long:"+UtilFeatures.getTimeLengthEstimation(map) / 1000);
    }
  

  /**
   * Notification callback for basicplayer events such as opened, eom ...
   * 
   * @param event
   */
  @Override
  public void stateUpdated(BasicPlayerEvent bpe)
  {
    // Notification of BasicPlayer states (opened, playing, end of media, ...)
    display("stateUpdated : "+bpe.toString());
    if(!ventana.NoRepro){
    int state = bpe.getCode();
        Object obj = bpe.getDescription();
        if (state == BasicPlayerEvent.EOM) {
            if (player.getStatus() == BasicPlayer.PAUSED || player.getStatus() == BasicPlayer.PLAYING) {
                //Avanzar Cursor
            }
        } else if (state == BasicPlayerEvent.PLAYING) {
            
            if (ventana.audioInfo.containsKey("basicplayer.sourcedataline")) {
                if (ventana.espectrometro != null) {
                    ventana.espectrometro.setupDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));
                    ventana.espectrometro.startDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));

                   ventana.espectrometro.setupDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));
                    ventana.espectrometro.startDSP((SourceDataLine) ventana.audioInfo.get("basicplayer.sourcedataline"));
                }
            }

        } else if (state == BasicPlayerEvent.SEEKING) {
        } else if (state == BasicPlayerEvent.SEEKED) {
        } else if (state == BasicPlayerEvent.OPENING) {
            if ((obj instanceof URL) || (obj instanceof InputStream)) {
                //Titulo de un stream de audio
            }
        } else if (state == BasicPlayerEvent.STOPPED) {
            if (ventana.espectrometro != null) {
                ventana.espectrometro.stopDSP();
                ventana.espectrometro.repaint();
                ventana.espectrometro.stopDSP();
                ventana.espectrometro.repaint();
            }
        }
    
    }
   ////////////////////////////////////////////
   //////////FIN DE CANCIÓN
   ///////////////////////////////////////////
    Random rnd = new Random();
    if(bpe.toString().equals("STOPPED:-1")&!saltando&&!ventana.cerrado){
        ////operacion de cerrado
        System.out.println("asd="+ventana.aleatorio+"-"+ventana.repetir_lista);
        if(ventana.lista_actual==null){
            ///////////siginifica que trabaja con la lista principal
            if(ventana.repetir_lista!=0){
             System.out.println("actual cancion="+ventana.indice);
             if(ventana.repetir_lista!=1){
            ventana.indice = (ventana.aleatorio) ? (int) (rnd.nextDouble() * ventana.lista_completa.size()):ventana.indice+1;
              if(ventana.indice==ventana.lista_completa.size()){
                ventana.indice=0;
                }
             }
             System.out.println("siguiente cancion="+ventana.indice);
             
             ventana.EnRepro=true;//"/Recursos/You're_My_Best_Friend.mp3"
                  
                    
            
           
                      
                     ventana.lista_actual=null;  //se trabaja con la lista completa
                     
                     ventana.mi_reproductor.play(ventana.lista_completa.get(ventana.indice).ruta);
                      if(ventana.repro.isVisible()) ventana.jp_Principal.getComponent(1).setVisible(false);{
                       ventana.jp_Principal.getComponent(1).setVisible(true);
                     
             }
             
            //comprobar el estado
             
            }
        
        }else{
              if(ventana.repetir_lista!=0){
            ///////esta trabajando con una lista mas pequeña
            System.out.println("Lista pequeña="+ventana.indice_actual);
            if(ventana.repetir_lista!=1){
             ventana.indice_actual = (ventana.aleatorio) ? (int) (rnd.nextDouble() * ventana.lista_actual.getSize()):ventana.indice_actual+1;
            if(ventana.indice_actual>=ventana.lista_actual.getSize())ventana.indice_actual=0;
            }
            ventana.mi_reproductor.play(buscarRuta(ventana.lista_actual.getElementAt(ventana.indice_actual).toString()));
             if(ventana.repro.isVisible()) ventana.jp_Principal.getComponent(1).setVisible(false);{
                       ventana.jp_Principal.getComponent(1).setVisible(true);
        }
            
        }
        }
        
    }
    
    
  }
    public String buscarRuta(String busca){
                
        Iterator itListaempleado= ventana.lista_completa.iterator();
        
         
        int h=0;
        while (itListaempleado.hasNext()) {
            ListaDeReproduccion elemento=(ListaDeReproduccion)itListaempleado.next();
            if(elemento.nom_cancion.equals(busca)){
                  ventana.nom_cancion=elemento.nom_cancion;
                
                
               
                return elemento.ruta;
          
            }
            h++;
            //System.out.println(elemento.nom_cancion+" "+elemento.nom_artista+" "+elemento.nom_album);    
        }
        return "NO EXISTE";
 }
  /**
   * A handle to the BasicPlayer, plugins may control the player through
   * the controller (play, stop, ...)
   * @param controller : a handle to the player
   */ 
  public void setController(BasicController controller)
  {
    display("setController : "+controller);
  }

  public void display(String msg)
  {
     if (out != null) out.println(msg);
  }
  
   
   
}
