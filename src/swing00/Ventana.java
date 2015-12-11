package swing00;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class Ventana extends JFrame {
    PanelVentana p=new PanelVentana();
    JMenuBar barra=new JMenuBar();
    JMenu mnuArchivo=new JMenu("Archivo");
    JMenuItem mnuSalir=new JMenuItem("Salir");
    public Ventana(){
        
        this.setTitle("CRUD JAVA SWING");
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(p);
        barra.add(mnuArchivo);
        mnuArchivo.add(mnuSalir);
        this.add(barra,BorderLayout.NORTH);
        
        
    }
}
