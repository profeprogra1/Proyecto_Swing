/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing00;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ricardo
 */
public class PanelVentana extends JPanel {
    JLabel lblNombre=new JLabel("Nombre:");
    JTextField txtNombre=new JTextField();
    JLabel lblApellido=new JLabel("Apellido");
    JTextField txtApellido=new JTextField();
    public PanelVentana(){
        this.setLayout(null);
        lblNombre.setBounds(20,20,120,20);
        this.add(lblNombre);
        txtNombre.setBounds(150,20,120,20);
        this.add(txtNombre);
        
        
    }
    
}
