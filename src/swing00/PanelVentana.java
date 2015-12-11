/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing00;

import javax.swing.JButton;
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
    JLabel lblCiudad=new JLabel("Ciudad");
    JTextField txtCiudad=new JTextField();
    JButton btnAgregar=new JButton("Agregar");
    JButton btnLimpiar=new JButton("Limpiar");
    public PanelVentana(){
        this.setLayout(null);
        lblNombre.setBounds(20,20,120,20);
        this.add(lblNombre);
        txtNombre.setBounds(150,20,120,20);
        this.add(txtNombre);
        lblApellido.setBounds(20,50,120, 20);
        this.add(lblApellido);
        txtApellido.setBounds(150,50,120,20);
        this.add(txtApellido);
        lblCiudad.setBounds(20,80,120,20);
        this.add(lblCiudad);
        txtCiudad.setBounds(150,80,120,20);
        this.add(txtCiudad);
        btnAgregar.setBounds(20,110,120,20);
        this.add(btnAgregar);
        btnLimpiar.setBounds(150,110,120,20);
        this.add(btnLimpiar);
        
       
        
        
    }
    
}
