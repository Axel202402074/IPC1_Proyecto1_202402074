
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



public class ControladorRegistroUsuario  {
    private RegistroUsuario_1 vistausu;
    
    private ModeloRegistroUsuario modelo;
    
    private CrearCuenta_2 pantallaPrincipal;
    
    

    public ControladorRegistroUsuario(RegistroUsuario_1 vista, ModeloRegistroUsuario modelo) {
        this.vistausu = vista;
        this.modelo = modelo;
        this.pantallaPrincipal=pantallaPrincipal;
       
   
  
        
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
    String nombre = vistausu.TxtNombreUsuario.getText();
    String apellido = vistausu.TxtApellidoUsuario.getText();

    if (!validarCampos(cui, nombre, apellido)) {
        vistausu.mostrarMensajeError("Todos los campos son obligatorios.");
        return;
    }

    if (modelo.crearUsuario(cui, nombre, apellido)) {
        vistausu.borrarFormCliente();
        vistausu.mostrarMensajeExito("Cliente creado exitosamente.");
    } else {
        vistausu.mostrarMensajeError(modelo.getUltimoMensaje());
    }
}

private boolean validarCampos(String cui, String nombre, String apellido) {
    return !cui.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty() && cui.length() == 13;
}
    
    
    
    
    
    
    
    
    
    
    
}
