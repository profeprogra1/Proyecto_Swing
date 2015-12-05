package swing00;
//LIBRERIA SWING
import java.awt.BorderLayout;
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
    JButton btn1=new JButton("MI boton");
    JButton btn2=new JButton("MI Segundo Btn");
    JButton btn3=new JButton("tercer");
    JButton btn4=new JButton("cuarto");
    JButton btn5=new JButton("quinto");
    JTextField txt1=new JTextField();
    //MENU
    JMenuBar barra=new JMenuBar();
    JMenu mnuArchivo=new JMenu("Archivo");
    JMenuItem mnuSalir=new JMenuItem("Salir");
    JMenu mnuEdit=new JMenu("Edit");
    JMenuItem mnuUndo=new JMenuItem("Undo");
    
    JTextArea txtArea=new JTextArea();
    JScrollPane scroll=new JScrollPane(txtArea);
    
     public PanelPrincipal(){
        barra.add(mnuArchivo);
        mnuArchivo.add(mnuSalir);
        mnuSalir.setEnabled(false);
        mnuArchivo.addSeparator();
        
        barra.add(mnuEdit);
        mnuEdit.add(mnuUndo);
        this.setLayout(new BorderLayout());
        this.add(barra,BorderLayout.NORTH);
        this.add(scroll,BorderLayout.CENTER);
        //this.add(btn3,BorderLayout.SOUTH);
        //this.add(txt1,BorderLayout.SOUTH);
        //this.add(btn4,BorderLayout.EAST);
        //this.add(btn5,BorderLayout.WEST);
        
    }
}

