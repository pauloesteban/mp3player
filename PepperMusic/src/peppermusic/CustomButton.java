/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import java.awt.event.MouseListener;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.geom.*;
import javax.swing.*;
/**
 *
 * @author orlando
 */
public class CustomButton extends JToggleButton {
 /*    @Override
    public void paint(Graphics g){
     super.paint(g);
     Graphics2D g2 = (Graphics2D)g;
     g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
     g2.translate(this.getWidth()/2,this.getHeight()/2);
     g2.rotate(Math.toRadians(270));
     
     Ellipse2D.Float circle = new Ellipse2D.Float(0,0,45,45);
     
     
     circle.setFrameFromCenter(new Point(0,0), new Point(45,45));
   
   
    g2.setColor(Color.pink);
   
    g2.draw(circle);
    g2.fill(circle);
    }*/
    
    Shape figura;
    @Override
  public boolean contains( int x,int y ) {
    // En caso de que el botón cambie de tamaño, hay que conseguir una nueva
    // figura que se adapte a ese nuevo tamaño
    if( figura == null || !figura.getBounds().equals(getBounds()) ) {
      figura = new Ellipse2D.Float( 0,0,this.getWidth(),this.getHeight() );
      }
    return( figura.contains( x,y ) );
    }
   
  
}
