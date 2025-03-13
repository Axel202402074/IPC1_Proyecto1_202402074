
package Controlador;


import Modelo.ModeloRegistroUsuario;
import VISTA.CrearCuenta_2;
import VISTA.RegistroUsuario_1;
import VISTA.PantallaPrincipal;
import static VISTA.RegistroUsuario_1.listaClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Action;



public class ControladorRegistroUsuario  implements ActionListener{
    private RegistroUsuario_1 vistausu;
    
    private ModeloRegistroUsuario modelo;
    
    private CrearCuenta_2 pantallaPrincipal;
    
    

    public ControladorRegistroUsuario(RegistroUsuario_1 vista, ModeloRegistroUsuario modelo) {
        this.vistausu = vista;
        this.modelo = modelo;
        this.pantallaPrincipal=pantallaPrincipal;
        this.vistausu.BtnCrearUsuario.addActionListener(this);
   
  
        
    }
    
    public ControladorRegistroUsuario(RegistroUsuario_1 vista, ModeloRegistroUsuario modelo, CrearCuenta_2 pantallaPrincipal) {
        this.vistausu = vista;
        this.modelo = modelo;
        this.pantallaPrincipal = pantallaPrincipal;

        // Agregar listener al botón "Crear Usuario"
        vista.BtnCrearUsuario.addActionListener(e -> crearUsuario());
    }
    

    public void crearUsuario() {
        String cui = vistausu.TxtCuiUsuario.getText();
            if (cui.length() != 13) {
        JOptionPane.showMessageDialog(vistausu, "Necesita 13 dígitos", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        
            
            }
        String nombre = vistausu.TxtNombreUsuario.getText();
        String apellido = vistausu.TxtApellidoUsuario.getText();

        /*  boolean resultado = modelo.crearUsuario(cui, nombre, apellido);
    String mensaje = modelo.getUltimoMensaje();

    if (resultado) {
        vistausu.mostrarMensajeExito(mensaje);
    } else {
        vistausu.mostrarMensajeError(mensaje);
        }*/
    }
    
    public void actionPerformed(ActionEvent bt){
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
