package swing00;
import javax.swing.JFrame;
public class Ventana extends JFrame {
    PanelVentana p=new PanelVentana();
    public Ventana(){
        this.setTitle("CRUD JAVA SWING");
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(p);
        
    }
}
