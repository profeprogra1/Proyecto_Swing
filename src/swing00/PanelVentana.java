package swing00;

import com.ricardo.Negocio.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
    JLabel lblId=new JLabel("ID");
    JTextField txtId=new JTextField();
    
    //CREAMOS EL MODELO Y DEFINIMOS LA COLUMNAS CABECERA
    DefaultTableModel modelo=new DefaultTableModel();{
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("CIUDAD");
    }
    //CREAMOS LA TABLA Y AGREGAMOS EL MODELO
    JTable tabla=new JTable(modelo);
    //CREAMOS UN SCROLL Y LE PASAOS LA TABLA
    JScrollPane scrollTabla=new JScrollPane(tabla);
    
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
        lblId.setBounds(280, 80, 120, 20);
        this.add(lblId);
        txtId.setBounds(410, 80, 120, 20);
        this.add(txtId);
        scrollTabla.setBounds(20,150, 500,380);
        this.add(scrollTabla);
        
        
        OyenteLimpiar oLimpiar = new OyenteLimpiar();
        btnLimpiar.addActionListener(oLimpiar);
        OyenteAgregar oAgregar = new OyenteAgregar();
        btnAgregar.addActionListener(oAgregar);
        OyenteEliminar oEliminar=new OyenteEliminar();
        btnEliminar.addActionListener(oEliminar);
        OyenteEditar oEditar=new OyenteEditar();
        btnEditar.addActionListener(oEditar);
        
        //LLAMAMOS AL METODO CADA VES QUE SE ABRA LA VENTANA LLENA LA TABLA
        llenarTabla();
        

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
            llenarTabla();
        }
    }
    
    class OyenteEliminar implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Usuario usu=new Usuario();
            int id=Integer.parseInt(txtId.getText());
            usu.setUsuario_id(id);
            usu.delete();
            Limpiar();
            llenarTabla();
        }
    }
    
    class OyenteEditar implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Usuario usu=new Usuario();
            int id=Integer.parseInt(txtId.getText());
            String nom=txtNombre.getText();
            String ape=txtApellido.getText();
            int ciudad_id=Integer.parseInt(txtCiudad.getText());
            usu.setUsuario_id(id);
            usu.setNombre(nom);
            usu.setApellido(ape);
            usu.setCiudad_id(ciudad_id);
            usu.update();
            Limpiar();
            llenarTabla();
        }
    
    }
    
    public void llenarTabla(){
        //CON ESTO EVITAMOS QUE QUE SOBREESCRIBA EL MODELO
        modelo.setRowCount(0);
        Usuario usuario=new Usuario();
        List<Usuario> lista=usuario.list();
        //CREAMOS UN OBJECTO PARA ALMACENAR LOS ELEMENTOS
       Object[] list=new Object[4];
        for(int i=0;i<lista.size();i++){
            //POSICION 0 ES LA COLUMNA ID
            list[0]=""+lista.get(i).getUsuario_id();
            //POSICION 1 ES LA COLUMNA NOMBRE
            list[1]=""+lista.get(i).getNombre();
            //POSICION 2 ES LA COLUMNA APELLIDO
            list[2]=""+lista.get(i).getApellido();
            //POSICION 3 ES LA COLUMNA CIUDAD
            list[3]=""+lista.get(i).getCiudad_id();
            //AGREGALOS LA LISTA AL MODELO
            modelo.addRow(list);
            
        }
        
    }
    //TAREA
    public void buscarTabla(){
    
    
    }
    
    
    public void Limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCiudad.setText("");
        txtId.setText("");
    }

}
