package peppermusic;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JSlider;

/**
 *
 * @author Erik Tirado
 */
public class VistaEcualizador extends JDialog{
     private JSlider Eq1, Eq2, Eq3, Eq4, Eq5, Eq6, Eq7, Eq8, Eq9, Eq10;
     private JButton aceptar;
     public PepperMusic_Frame vista;
     
     public VistaEcualizador(PepperMusic_Frame vista){
         super(vista,true);
         this.vista = vista;
         iniciarComponentes();
         nombresEventos();
         pack();
     }
     
     private void iniciarComponentes(){
         setLayout(new GridBagLayout());
         GridBagConstraints conf = new GridBagConstraints();
         
         Eq1 = new JSlider(-100, 100, 0);
         Eq2 = new JSlider(-100, 100, 0);
         Eq3 = new JSlider(-100, 100, 0);
         Eq4 = new JSlider(-100, 100, 0);
         Eq5 = new JSlider(-100, 100, 0);
         Eq6 = new JSlider(-100, 100, 0);
         Eq7 = new JSlider(-100, 100, 0);
         Eq8 = new JSlider(-100, 100, 0);
         Eq9 = new JSlider(-100, 100, 0);
         Eq10 = new JSlider(-100, 100, 0);
         Eq1.setOrientation(JSlider.VERTICAL);
         Eq2.setOrientation(JSlider.VERTICAL);
         Eq3.setOrientation(JSlider.VERTICAL);
         Eq4.setOrientation(JSlider.VERTICAL);
         Eq5.setOrientation(JSlider.VERTICAL);
         Eq6.setOrientation(JSlider.VERTICAL);
         Eq7.setOrientation(JSlider.VERTICAL);
         Eq8.setOrientation(JSlider.VERTICAL);
         Eq9.setOrientation(JSlider.VERTICAL);
         Eq10.setOrientation(JSlider.VERTICAL);
         Eq1.setSize(20, 100);
         
         aceptar = new JButton("Aceptar");
         
         conf.gridx = 0;
         conf.gridy = 0;
         conf.insets = new Insets(10, 10, 10, 0);
         add(Eq1, conf);
         conf.gridx = 1;
         conf.gridy = 0;
         conf.insets = new Insets(10, 5, 10, 0);
         add(Eq2, conf);
         conf.gridx = 2;
         conf.gridy = 0;
         conf.insets = new Insets(10, 5, 10, 0);
         add(Eq3, conf);
         conf.gridx = 3;
         conf.gridy = 0;
         conf.insets = new Insets(10, 5, 10, 0);
         add(Eq4, conf);
         conf.gridx = 4;
         conf.gridy = 0;
         conf.insets = new Insets(10, 5, 10, 0);
         add(Eq5, conf);
         conf.gridx = 5;
         conf.gridy = 0;
         conf.insets = new Insets(10, 5, 10, 0);
         add(Eq6, conf);
         conf.gridx = 6;
         conf.gridy = 0;
         conf.insets = new Insets(10, 5, 10, 0);
         add(Eq7, conf);
         conf.gridx = 7;
         conf.gridy = 0;
         conf.insets = new Insets(10, 5, 10, 0);
         add(Eq8, conf);
         conf.gridx = 8;
         conf.gridy = 0;
         conf.insets = new Insets(10, 5, 10, 0);
         add(Eq9, conf);
         conf.gridx = 9;
         conf.gridy = 0;
         conf.insets = new Insets(10, 5, 10, 10);
         add(Eq10, conf);
         conf.gridx = 0;
         conf.gridy = 1;
         conf.insets = new Insets(0, 0, 10, 0);
         conf.gridwidth = 10;
         conf.anchor = GridBagConstraints.CENTER;
         add(aceptar, conf);
     } 
     private void nombresEventos(){
         Eq1.setName("Eq1");
         Eq2.setName("Eq2");
         Eq3.setName("Eq3");
         Eq4.setName("Eq4");
         Eq5.setName("Eq5");
         Eq6.setName("Eq6");
         Eq7.setName("Eq7");
         Eq8.setName("Eq8");
         Eq9.setName("Eq9");
         Eq10.setName("Eq10");
         aceptar.setActionCommand("Aceptar");
     }
     public void setControl(ControlEcualizador control){
         Eq1.addChangeListener(control);
         Eq2.addChangeListener(control);
         Eq3.addChangeListener(control);
         Eq4.addChangeListener(control);
         Eq5.addChangeListener(control);
         Eq6.addChangeListener(control);
         Eq7.addChangeListener(control);
         Eq8.addChangeListener(control);
         Eq9.addChangeListener(control);
         Eq10.addChangeListener(control);
         aceptar.addActionListener(control);
     }
     public void setState(float[] estados){
        Eq1.setValue((int)(estados[0]*100));
        Eq2.setValue((int)(estados[1]*100));
        Eq3.setValue((int)(estados[2]*100));
        Eq4.setValue((int)(estados[3]*100));
        Eq5.setValue((int)(estados[4]*100));
        Eq6.setValue((int)(estados[5]*100));
        Eq7.setValue((int)(estados[6]*100));
        Eq8.setValue((int)(estados[7]*100));
        Eq9.setValue((int)(estados[8]*100));
        Eq10.setValue((int)(estados[9]*100));
    }
}
