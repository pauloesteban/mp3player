/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic.LetraAnimada;

import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author orlando
 */
public class movimiento implements Runnable{
     public Thread t;
     PanelAnimado pa;
     public movimiento(PanelAnimado pa){
         this.pa=pa;
         
          
           
     }
     boolean fin=true;
    @Override
           
            public void run(){
                 int x=115,y=115,z=115;  ///sumadores para los 3 labels
                 
                 // System.out.println(pa.x);
                while(fin){
                    if(pa.x>115){               
                     if(x<-(pa.mayor))x=115;
                      pa.lb1.setLocation(x, 3);
                      x--;
                    }
                     if(pa.y>115){     
                     if(y<-(pa.mayor)) y=115;
                      pa.lb2.setLocation(y, 22);
                      y--;
                    }
                      if(pa.z>115){     
                     if(z< -(pa.mayor)) z=115;
                        pa.lb3.setLocation(z, 40);
                        z--;
                    }
                     
                      
                    /*  pa.lb2.setLocation(0, 40);
                      pa.lb3.setLocation(0, 60);*/
                      
                 //    System.out.println("ajaja");
                            
                           
                            
                          try{
              //  reproduccion.canc.jtb_repro.setEnabled(true);
              //  reproduccion.canc.venta.EnRepro=true;
                
              // if(reproduccion.canc.venta.NoRepro==false){
                 
             //   reproduccion.jp_Progreso.ActualizarProgreso(n);
             //   reproduccion.jp_Progreso.repaint();
              // } 
              
               Thread.sleep(25);
                synchronized(this){
                  
                }
               
            }catch(InterruptedException ex){
                
            }
           //  int delay = 1000; //milliseconds
         
  
//  new Timer(delay, taskPerformer).start();
             
                }
              
            }
            public void start(){
                t = new Thread (this);
                
                t.start();
            }
            void stop() {
           fin =  false;
      
   }
    
}
