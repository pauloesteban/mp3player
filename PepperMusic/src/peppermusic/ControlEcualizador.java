/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Erik Tirado
 */
public class ControlEcualizador implements ChangeListener, ActionListener{
    private VistaEcualizador vista;
    private float[] eq = new float[32];
    
    public ControlEcualizador(VistaEcualizador vista){
        this.vista = vista;
        eq = vista.vista.mi_reproductor.eq;
        System.out.println(eq[0]);
//        if(eq[0] == null){
//            for(int i = 0; i < 10; i++){
//                eq[i] = (float)0.5;
//            }
//        }
        
    }
    
    public float[] getState(){
        return eq;
    }
    
    
    @Override
    public void stateChanged(ChangeEvent e) {
        switch(((JSlider)e.getSource()).getName()){
            case "Eq1":
                eq[0] = (float)(((JSlider)e.getSource()).getValue())/100;
                break;
            case "Eq2":
                eq[1] = (float)(((JSlider)e.getSource()).getValue())/100;
                break;
            case "Eq3":
                eq[2] = (float)(((JSlider)e.getSource()).getValue())/100;
                break;
            case "Eq4":
                eq[3] = (float)(((JSlider)e.getSource()).getValue())/100;
                break;
            case "Eq5":
                eq[4] = (float)(((JSlider)e.getSource()).getValue())/100;
                break;
            case "Eq6":
                eq[5] = (float)(((JSlider)e.getSource()).getValue())/100;
                break;
            case "Eq7":
                eq[6] = (float)(((JSlider)e.getSource()).getValue())/100;
                break;
            case "Eq8":
                eq[7] = (float)(((JSlider)e.getSource()).getValue())/100;
                break;
            case "Eq9":
                eq[8] = (float)(((JSlider)e.getSource()).getValue())/100;
                break;
            case "Eq10":
                eq[9] = (float)(((JSlider)e.getSource()).getValue())/100;
                break;
            default :
                System.out.println("Ninguno");
                break;
        }        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Aceptar")){
            vista.dispose();
        }
    }
    
}
