     
package Controlador;

import Modelo.ModeloCrearCuenta;
import Modelo.ModeloRegistroUsuario;
import VISTA.CrearCuenta_2;
import java.util.List;

public class ControladorCrearCuenta {
    private final CrearCuenta_2 vista;
    private final ModeloCrearCuenta modeloCuenta;
    private final ModeloRegistroUsuario modeloUsuario;

    public ControladorCrearCuenta(CrearCuenta_2 vista, ModeloCrearCuenta modeloCuenta, ModeloRegistroUsuario modeloUsuario) {
        this.vista = vista;
        this.modeloCuenta = modeloCuenta;
        this.modeloUsuario = modeloUsuario;
        
        cargarClientes();
        vista.addCrearCuentaListener(e -> crearCuenta());
    }

    private void cargarClientes() {
        List<String> clientesFormateados = modeloUsuario.getListaClientes().stream()
                .map(usuario -> usuario.getCui() + " - " + usuario.getNombre() + " " + usuario.getApellido())
                .toList();
        vista.actualizarListaClientes(clientesFormateados);
    }

    private void crearCuenta() {
        String seleccion = vista.getClienteSeleccionado();
        if (seleccion == null || !seleccion.contains(" - ")) {
            vista.mostrarMensaje("Seleccione un cliente válido.", "error");
            return;
        }

        String cui = seleccion.split(" - ")[0].trim();
        if (modeloCuenta.crearCuenta(cui)) {
            vista.mostrarMensaje(modeloCuenta.getUltimoMensaje(), "éxito");
        } else {
            vista.mostrarMensaje(modeloCuenta.getUltimoMensaje(), "error");
        }
    }
}
