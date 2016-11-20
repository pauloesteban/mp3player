/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author orlando
 */
public class Clase_Progreso  implements Runnable{
            CustomPanel progreso;
   public   boolean suspended = false;
       public Thread t;
     jp_Reproduccion reproduccion;
             public  Clase_Progreso(CustomPanel progress,jp_Reproduccion repro){
                 progreso=progress;
                 reproduccion=repro;
             }
    
           @Override
           
            public void run(){
                   for(int n = 1; n<=100;n++){
            try{
                progreso.ActualizarProgreso(n);
                progreso.repaint();
                Thread.sleep(50);
                synchronized(this){
                    while(suspended)wait();
                }
               
            }catch(InterruptedException ex){
                Logger.getLogger(PepperMusic.class.getName()).log(Level.SEVERE,null, ex);
            }
            
        }
               reproduccion.START.setSelected(false);
              
            }
            public void start(){
                t = new Thread (this);
                t.start();
            }
   
      void suspend() {
      suspended = true;
      
   }
   
   synchronized void resume() {
      suspended = false;
      notify();
      
   }
        
        }
        
    

