package swing00;

import com.ricardo.Negocio.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelVentana extends JPanel {

    JLabel lblNombre = new JLabel("Nombre:");
    JTextField txtNombre = new JTextField();
    JLabel lblApellido = new JLabel("Apellido");
    JTextField txtApellido = new JTextField();
    JLabel lblCiudad = new JLabel("Ciudad");
    JTextField txtCiudad = new JTextField();
    JButton btnAgregar = new JButton("Agregar");
    JButton btnEliminar = new JButton("ELiminar");
    JButton btnEditar = new JButton("Editar");
    JButton btnLimpiar = new JButton("Limpiar");

    public PanelVentana() {
        this.setLayout(null);
        lblNombre.setBounds(20, 20, 120, 20);
        this.add(lblNombre);
        txtNombre.setBounds(150, 20, 120, 20);
        this.add(txtNombre);
        lblApellido.setBounds(20, 50, 120, 20);
        this.add(lblApellido);
        txtApellido.setBounds(150, 50, 120, 20);
        this.add(txtApellido);
        lblCiudad.setBounds(20, 80, 120, 20);
        this.add(lblCiudad);
        txtCiudad.setBounds(150, 80, 120, 20);
        this.add(txtCiudad);
        btnAgregar.setBounds(20, 110, 120, 20);
        this.add(btnAgregar);
        btnLimpiar.setBounds(150, 110, 120, 20);
        this.add(btnLimpiar);
        btnEliminar.setBounds(280, 110, 120, 20);
        this.add(btnEliminar);
        btnEditar.setBounds(410, 110, 120, 20);
        this.add(btnEditar);
        OyenteLimpiar oLimpiar = new OyenteLimpiar();
        btnLimpiar.addActionListener(oLimpiar);
        OyenteAgregar oAgregar = new OyenteAgregar();
        btnAgregar.addActionListener(oAgregar);

    }

    class OyenteLimpiar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Limpiar();
        }
    }

    class OyenteAgregar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Usuario usu = new Usuario();
            String nom = txtNombre.getText();
            String ape = txtApellido.getText();
            int ciudad_id = Integer.parseInt(txtCiudad.getText());

            usu.setNombre(nom);
            usu.setApellido(ape);
            usu.setCiudad_id(ciudad_id);
            usu.save();
            Limpiar();
        }
    }
    
    public void Limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCiudad.setText("");
    }

}
