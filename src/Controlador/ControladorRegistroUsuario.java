
package Controlador;


import Modelo.ModeloRegistroUsuario;
import VISTA.RegistroUsuario_1;
import VISTA.PantallaPrincipal;
import javax.swing.JOptionPane;


public class ControladorRegistroUsuario {
    private RegistroUsuario_1 vistausu;
    private ModeloRegistroUsuario modelo;

    public ControladorRegistroUsuario(RegistroUsuario_1 vista, ModeloRegistroUsuario modelo) {
        this.vistausu = vista;
        this.modelo = modelo;

        // Agregar listener al botón "Crear Usuario"
        //this.vistausu.BtnCrearUsuario.addActionListener(e -> crearUsuario());    
    }

    public void crearUsuario() {
        String cui = vistausu.TxtCuiUsuario.getText();
            if (cui.length() != 13) {
        JOptionPane.showMessageDialog(vistausu, "Necesita 13 dígitos", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        
            
            }
        String nombre = vistausu.TxtNombreUsuario.getText();
        String apellido = vistausu.TxtApellidoUsuario.getText();

          boolean resultado = modelo.crearUsuario(cui, nombre, apellido);
    String mensaje = modelo.getUltimoMensaje();

    if (resultado) {
        vistausu.mostrarMensajeExito(mensaje);
    } else {
        vistausu.mostrarMensajeError(mensaje);
        }
    }
}
