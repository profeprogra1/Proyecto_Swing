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
public class Ventana extends JFrame {
    PanelVentana p=new PanelVentana();
    public Ventana(){
        this.setTitle("CRUD JAVA SWING");
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(p);
        
    }
}
