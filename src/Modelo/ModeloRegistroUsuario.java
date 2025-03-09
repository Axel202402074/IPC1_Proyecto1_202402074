
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
    private int maxClientes; // Cantidad máxima de clientes permitidos

    public ModeloRegistroUsuario(int maxClientes) {
        this.usuarios = new ArrayList<>();
        this.maxClientes = maxClientes;
    }

    public boolean crearUsuario(String cui, String nombre, String apellido) {
        // Validar que no exista un usuario con el mismo CUI
        if (existeUsuario(cui)) {
            return false;
        }

        // Validar que no se haya alcanzado el máximo de clientes permitidos
        if (usuarios.size() >= maxClientes) {
            return false;
        }

        // Crear y agregar el nuevo usuario a la lista
        Usuario nuevoUsuario = new Usuario(cui, nombre, apellido);
        usuarios.add(nuevoUsuario);
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
}
