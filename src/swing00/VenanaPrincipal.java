package swing00;
//LIBRERIA SWING
import java.awt.BorderLayout;
import javax.swing.*;
public class VenanaPrincipal extends JFrame {
    PanelPrincipal p=new PanelPrincipal();
    public VenanaPrincipal(){
        this.setSize(500,500);
        this.setTitle("Mi primera Ventana");
        this.setVisible(true);
        this.add(p);
        
    }
}

class PanelPrincipal extends JPanel{
    JButton btn1=new JButton("MI boton");
    JButton btn2=new JButton("MI Segundo Btn");
    JButton btn3=new JButton("tercer");
    public PanelPrincipal(){
        this.setLayout(new BorderLayout());
        this.add(btn1,BorderLayout.NORTH);
        this.add(btn2,BorderLayout.CENTER);
        this.add(btn3,BorderLayout.SOUTH);
    }
}

