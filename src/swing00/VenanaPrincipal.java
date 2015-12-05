package swing00;
//LIBRERIA SWING
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JLabel lblResultado=new JLabel("Resultado");
    JTextField txtResultado=new JTextField();
    public PanelPrincipal(){
        this.setLayout(null);
        lblNombre.setBounds(20, 20, 120, 20);
        this.add(lblNombre);
        txtNombre.setBounds(150,20,120,20);
        this.add(txtNombre);
        lblApellido.setBounds(20, 50, 120, 20);
        txtApellido.setBounds(150,50,120,20);
        this.add(lblApellido);
        this.add(txtApellido);
        btnMostrar.setBounds(20,80,120,20);
        btnLimpiar.setBounds(150,80,120,20);
        this.add(btnMostrar);
        this.add(btnLimpiar);
        lblResultado.setBounds(20,110,120,20);
        txtResultado.setBounds(150,110,120,20);
        this.add(lblResultado);
        this.add(txtResultado);
        Oyente o1=new Oyente();
        btnMostrar.addActionListener(o1);
        Oyente2 o2=new Oyente2();
        btnLimpiar.addActionListener(o2);
        
    }
    class Oyente implements ActionListener{
        public void actionPerformed(ActionEvent e){
           txtResultado.setText(""+txtNombre.getText()+" "+txtApellido.getText());
        }
    }
    class Oyente2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            txtNombre.setText("");
            txtApellido.setText("");
        }
    }
}

