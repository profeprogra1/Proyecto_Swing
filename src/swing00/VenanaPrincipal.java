package swing00;
//LIBRERIA SWING
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
public class VenanaPrincipal extends JFrame {
    PanelPrincipal p=new PanelPrincipal();
    public VenanaPrincipal(){
        this.add(p);
        this.setSize(500,500);
        this.setTitle("Mi primera Ventana");
        this.setVisible(true);
        
        
    }
}

class PanelPrincipal extends JPanel{
    JLabel lblNombre=new JLabel("Nombre:");
    JTextField txtNombre=new JTextField();
    JLabel lblApellido=new JLabel("Apellido");
    JTextField txtApellido=new JTextField();
    JButton btnMostrar=new JButton("Mostrar");
    JButton btnLimpiar=new JButton("Limpiar");
    public PanelPrincipal(){
        this.setLayout(new GridLayout(3,2));
        this.add(lblNombre);
        this.add(txtNombre);
        this.add(lblApellido);
        this.add(txtApellido);
        this.add(btnMostrar);
        this.add(btnLimpiar);
        
    }
}

