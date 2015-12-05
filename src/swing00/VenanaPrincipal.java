package swing00;
//LIBRERIA SWING

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VenanaPrincipal extends JFrame {

    PanelPrincipal p = new PanelPrincipal();

    public VenanaPrincipal() {
        this.add(p);
        this.setSize(500, 500);
        this.setTitle("Mi primera Ventana");
        this.setVisible(true);

    }
}

class PanelPrincipal extends JPanel {

    JLabel lblNombre = new JLabel("Nombre:");
    JTextField txtN1 = new JTextField();
    JLabel lblApellido = new JLabel("Numero2");
    JTextField txtN2 = new JTextField();
    JButton btnMostrar = new JButton("Mostrar");
    JButton btnLimpiar = new JButton("Limpiar");
    JLabel lblResultado = new JLabel("Resultado");
    JTextField txtResultado = new JTextField();
    JLabel lblOpciones = new JLabel("Opcion");
    JComboBox opciones = new JComboBox();

    {
        opciones.addItem("Sumar");
        opciones.addItem("Restar");
        opciones.addItem("Multiplicar");
        opciones.addItem("Dividir");
    }
    JCheckBox  check1=new JCheckBox("FUMA?");
    
    public PanelPrincipal() {
        
        this.setLayout(null);
        lblNombre.setBounds(20, 20, 120, 20);
        this.add(lblNombre);
        txtN1.setBounds(150, 20, 120, 20);
        this.add(txtN1);
        check1.setBounds(20, 50, 120, 20);
        this.add(check1);
       
        btnMostrar.setBounds(20, 110, 120, 20);
        btnLimpiar.setBounds(150, 110, 160, 20);
        this.add(btnMostrar);
        this.add(btnLimpiar);
        lblResultado.setBounds(20, 140, 120, 20);
        txtResultado.setBounds(150, 140, 160, 20);
        this.add(lblResultado);
        this.add(txtResultado);
        Oyente o1 = new Oyente();
        btnMostrar.addActionListener(o1);
        Oyente2 o2 = new Oyente2();
        btnLimpiar.addActionListener(o2);

    }

    class Oyente implements ActionListener {

        public void actionPerformed(ActionEvent e) {
              if(check1.isSelected()==true){
                  txtResultado.setText(""+txtN1.getText()+":Fumador ");
              }else{
                  txtResultado.setText(""+txtN1.getText()+":No Fumador ");
              }
            
              
            
        }
    }

    class Oyente2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtN1.setText("");
            txtN2.setText("");
            txtResultado.setText("");
        }
    }
}
