
package Controlador;


import Modelo.ModeloRegistroUsuario;
import VISTA.RegistroUsuario;
import VISTA.PantallaPrincipal;


public class ControladorRegistroUsuario {
    private RegistroUsuario vistausu;
    private ModeloRegistroUsuario modelo;

    public ControladorRegistroUsuario(RegistroUsuario vista, ModeloRegistroUsuario modelo) {
        this.vistausu = vista;
        this.modelo = modelo;

        // Agregar listener al botón "Crear Usuario"
        this.vistausu.BtnCrearUsuario.addActionListener(e -> crearUsuario());    
    }

    public void crearUsuario() {
        String cui = vistausu.TxtCuiUsuario.getText();
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
