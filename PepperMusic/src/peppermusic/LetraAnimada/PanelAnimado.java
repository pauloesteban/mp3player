/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic.LetraAnimada;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author orlando
 */

public class PanelAnimado extends JPanel{
    JLabel lb1,lb2,lb3,fondo;
    public int x,y,z,mayor;
  
  movimiento mo;

    public PanelAnimado(){
        lb1 = new JLabel("");
        lb2 = new JLabel("");
        lb3 = new JLabel("");
        fondo = new JLabel(new ImageIcon(this.getClass().getResource("repro_nombre.png")));
        fondo.setBounds(0, 0, 125, 68);      
        
    }
    public void NuevaLetra(JLabel lb1,JLabel lb2,JLabel lb3){
        this.setLayout(null);
        fondo.setBounds(0, 0, 125, 68);
        this.lb1 = lb1;
        this.lb2 = lb2;
        this.lb3 = lb3;
        lb1.setFont(new Font("Arial", Font.PLAIN, 12));
         lb2.setFont(new Font("Arial", Font.BOLD, 15));
          lb3.setFont(new Font("Arial", Font.PLAIN, 12));
         
        x= lb1.getPreferredSize().width;
        y=lb2.getPreferredSize().width;
        z=lb3.getPreferredSize().width;
      mayor = (x>=y)? x:y;
      mayor = (mayor>=z)? mayor:z;
      
       
        this.removeAll();
        
        this.add(lb1);
        
        this.add(lb2);
        this.add(lb3);
        this.add(fondo);
        
         lb1.setForeground(Color.WHITE);
        lb2.setForeground(Color.WHITE);
        lb3.setForeground(Color.WHITE);
        lb1.setBounds(5, 3, (x<115)?115:mayor, 20);
        lb2.setBounds(5, 22,(y<115)?115:mayor,20);
        lb3.setBounds(5, 40, (z<115)?115:mayor, 20);
      
       
          
            
              
        mo=new movimiento(this);
        mo.start();
    }
    public void Actualizar(int x, int y){
        this.x = x;
        this.y = y;
        
    }
      @Override
    public void paint(Graphics g){
        
        
      // this.setSize(180, 240);
        
     super.paint(g);
     
     
       
     
    }
    public void stop(){
        
        if(mo!=null)mo.stop();
    }
     @Override
public Dimension getPreferredSize() {
    return new Dimension(500, 500);
    
}
     
    
}
