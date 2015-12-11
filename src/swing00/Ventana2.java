/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing00;

import javax.swing.JFrame;

/**
 *
 * @author ricardo
 */
public class Ventana2 extends JFrame{
    public Ventana2(){
        this.setTitle("VENTANA CIUDADES");
        this.setSize(500,200);
       
        PanelVentana2 p2=new PanelVentana2();
        this.add(p2);
    }
}
