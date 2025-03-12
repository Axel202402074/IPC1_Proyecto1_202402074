package Controlador;

import Modelo.ModeloCrearCuenta;
import Modelo.ModeloRegistroUsuario;
import VISTA.CrearCuenta_2;
import java.util.ArrayList;
import java.util.List;

public class ControladorCrearCuenta {
    private final CrearCuenta_2 vista;
    private final ModeloCrearCuenta modeloCuenta;
    private final ModeloRegistroUsuario modeloUsuario;

    public ControladorCrearCuenta(CrearCuenta_2 vista, 
                                ModeloCrearCuenta modeloCuenta,
                                ModeloRegistroUsuario modeloUsuario) {
        this.vista = vista;
        this.modeloCuenta = modeloCuenta;
        this.modeloUsuario = modeloUsuario;
        
        cargarClientes();
        configurarEventos();
    }

    private void cargarClientes() {
        List<String> clientesFormateados = new ArrayList<>();
        modeloUsuario.usuarios.forEach(usuario -> {
            String item = usuario.getCui() + " - " + usuario.getNombre() + " " + usuario.getApellido();
            clientesFormateados.add(item);
        });
        vista.actualizarListaClientes(clientesFormateados);
    }

    private void configurarEventos() {
        vista.jButton1.addActionListener(e -> crearCuenta());
    }

    private void crearCuenta() {
        String seleccion = vista.getClienteSeleccionado();
        
        if (seleccion == null || seleccion.isEmpty()) {
            vista.mostrarMensaje("Seleccione un cliente de la lista", "error");
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
    