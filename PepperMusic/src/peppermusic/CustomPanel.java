/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author orlando
 */
public class CustomPanel extends JPanel{
    
   long Progreso = 1;
   long duracion = 1;
   public void ActualizarProgreso(long nuevo,long dura){
    //System.out.println("total de progreso=" + nuevo);
       Progreso = nuevo;
       duracion = dura;
   } 
    
     @Override
    public void paint(Graphics g){
        
        
      // this.setSize(180, 240);
        
     super.paint(g);
     
     Graphics2D g2 = (Graphics2D)g;
     g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
     g2.translate(this.getWidth()/2,this.getHeight()/2);
     g2.rotate(Math.toRadians(270));
     Ellipse2D.Float circle = new Ellipse2D.Float(0,0,45,45);
     Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
     Arc2D.Float arc2 = new Arc2D.Float(Arc2D.PIE);
     
     int j=38;
     arc2.setFrameFromCenter(new Point(0,0),new Point(j+2,j+2));
     arc.setFrameFromCenter(new Point(0,0),new Point(j,j));
     circle.setFrameFromCenter(new Point(0,0),new Point(j+1,j+1));
     //circle.setFrameFromCenter(new Point(0,0), new Point(45,45));
    arc.setAngleStart(1);
    arc2.setAngleStart(1);
     
     double l = ((double)Progreso/duracion);
      arc.setAngleExtent((double)-l*360);
    // System.out.println("total de progreso="+l);
      arc2.setAngleExtent((double)-l*360);
     g2.setColor(new Color(12,32,32,53)); //http://colorizer.org/ colors hsb de esa pagina /100
    g2.draw(circle);
    g2.fill(circle);
   
    g2.setColor(Color.green); //http://colorizer.org/ colors hsb de esa pagina /100
    g2.draw(arc2);
    g2.fill(arc2);
    g2.setColor(Color.getHSBColor(1.26f,0.85f,0.8f)); //http://colorizer.org/ colors hsb de esa pagina /100
    g2.draw(arc);
    g2.fill(arc);
     
    
    
    /*  
    g2.setColor(Color.BLUE);
   
    g2.draw(circle);
    g2.fill(circle);*/
    }
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
   public void mouseClicked(MouseEvent me){
       

       
   }

}
