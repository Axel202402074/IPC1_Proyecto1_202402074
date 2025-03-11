
package Modelo;

import java.util.ArrayList;
import java.util.List;


public class ModeloRegistroUsuario {
    
    public class Usuario {
    private String cui;
    private String nombre;
    private String apellido;

    public Usuario(String cui, String nombre, String apellido) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCui() {
        return cui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
    
    
    private List<Usuario> usuarios; // Lista de usuarios registrados
    private int maxClientes =7; // Cantidad máxima de clientes permitidos
    private String ultimoMensaje;//ultimo mensaje generado
    private boolean mensajeGenerado; // Variable para controlar si se ha generado un mensaje
     
    public ModeloRegistroUsuario(int maxClientes) {
        this.usuarios = new ArrayList<>();
        this.maxClientes = maxClientes;
        this.mensajeGenerado = false; // Inicializar la variable en false
    }

    public boolean crearUsuario(String cui, String nombre, String apellido) {
        // Validar que no exista un usuario con el mismo CUI
        if (existeUsuario(cui)) {
            this.ultimoMensaje = "No se pueden crear clientes con CUI duplicados. El CUI ingresado ya existe en el sistema";
            this.mensajeGenerado = true; // Marcar que se ha generado un mensaje
            return false;
        }

        // Validar que no se haya alcanzado el máximo de clientes permitidos
        if (usuarios.size() >= maxClientes) {
            this.ultimoMensaje = "No es posible crear más clientes";
            this.mensajeGenerado = true; // Marcar que se ha generado un mensaje
            return false;
        }

        // Crear y agregar el nuevo usuario a la lista
        Usuario nuevoUsuario = new Usuario(cui, nombre, apellido);
        usuarios.add(nuevoUsuario);
        this.ultimoMensaje = "Cliente creado exitosamente";
        this.mensajeGenerado = true; // Marcar que se ha generado un mensaje
        return true;
    }

    private boolean existeUsuario(String cui) {
        // Buscar si ya existe un usuario con el mismo CUI
        for (Usuario usuario : usuarios) {
            if (usuario.getCui().equals(cui)) {
                return true;
            }
        }
        return false;
    }

    public String getUltimoMensaje() {
        this.mensajeGenerado = false; // Resetear la variable después de obtener el mensaje
        return this.ultimoMensaje;
    }

    public boolean getMensajeGenerado() {
        return this.mensajeGenerado;
    }
}
