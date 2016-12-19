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
           
   public   boolean suspended = false;
       public Thread t;
       public int n;
       public boolean fin;
     jp_Reproduccion reproduccion;
             public  Clase_Progreso(){
                 /*jp_Reproduccion repro
                 reproduccion=repro;
                 fin=false;*/
             }
    
           @Override
           
            public void run(){
                
                   for( n = 1; n<=300&&!fin;n++){
                        if(true) {//reproduccion.canc.venta.NoRepro== 
            try{
              //  reproduccion.canc.jtb_repro.setEnabled(true);
              //  reproduccion.canc.venta.EnRepro=true;
                
              // if(reproduccion.canc.venta.NoRepro==false){
                 
             //   reproduccion.jp_Progreso.ActualizarProgreso(n);
             //   reproduccion.jp_Progreso.repaint();
              // } 
              
                Thread.sleep(50);
                synchronized(this){
                    while(suspended)wait();
                }
               
            }catch(InterruptedException ex){
                Logger.getLogger(PepperMusic.class.getName()).log(Level.SEVERE,null, ex);
            }
            }
             
        }
               //reproduccion.canc.venta.EnRepro=false;
               //reproduccion.START.setSelected(false);
              
               
               fin=false;
              
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
        
    

