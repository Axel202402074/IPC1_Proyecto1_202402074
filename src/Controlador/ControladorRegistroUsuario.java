
package Controlador;

import proyecto1.ipc.Usuario;
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
        vista.BtnCrearUsuario().addActionListener(e -> crearUsuario());
    }

    private void crearUsuario() {
        String cui = vistausu.getTxtCuiUsuario().getText();
        String nombress = vistausu.getTxtNombreUsuario().getText();
        String apellido = vistausu.getTxtApellidoUsuario().getText();

        if (modelo.crearUsuario(cui, nombre, apellido)) {
            vistausu.mostrarMensajeExito("Usuario creado exitosamente");
        } else {
            vistausu.mostrarMensajeError("Error al crear el usuario");
        }
    }
}
