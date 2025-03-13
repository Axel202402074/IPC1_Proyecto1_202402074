package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ModeloRegistroUsuario {

    private String cui;
    private String nombre;
    private String apellido;
    private final List<ModeloRegistroUsuario> listaClientes;  // Lista de instancias de ModeloRegistroUsuario
    private String ultimoMensaje;
    private int maxClientes;  // Variable para almacenar el máximo número de clientes

    // Constructor modificado para aceptar el número máximo de clientes
    public ModeloRegistroUsuario(int maxClientes) {
        this.maxClientes = maxClientes;
        this.listaClientes = new ArrayList<>();
        this.ultimoMensaje = "";
    }

    // Constructor para un usuario específico
    public ModeloRegistroUsuario(String cui, String nombre, String apellido) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaClientes = null;
        this.ultimoMensaje = "";
    }




    // Constructor sin parámetros, que inicializa la lista de clientes
    public ModeloRegistroUsuario() {
        this.listaClientes = new ArrayList<>();
        cargarUsuariosDePrueba();  // Cargar algunos usuarios para pruebas
    }

    // Métodos de acceso (getters y setters)
    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
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

    public String getUltimoMensaje() {
        return this.ultimoMensaje;
    }

    public List<ModeloRegistroUsuario> getListaClientes() {
        return new ArrayList<>(this.listaClientes);  // Evita modificación externa
    }

    // Método para crear un nuevo usuario
    public boolean crearUsuario(String cui, String nombre, String apellido) {
        if (existeUsuario(cui)) {
            this.ultimoMensaje = "No se pueden crear clientes con CUI duplicados.";
            return false;
        }
        listaClientes.add(new ModeloRegistroUsuario(cui, nombre, apellido));
        this.ultimoMensaje = "Cliente creado exitosamente.";
        return true;
    }

    // Verifica si un usuario ya existe
    private boolean existeUsuario(String cui) {
        return listaClientes.stream().anyMatch(usuario -> usuario.getCui().equals(cui));
    }

    // Buscar un usuario por su CUI
    public ModeloRegistroUsuario buscarUsuarioPorCUI(String cui) {
        return listaClientes.stream()
                .filter(usuario -> usuario.getCui().equals(cui))
                .findFirst()
                .orElse(null);
    }

    // Cargar usuarios de prueba
    private void cargarUsuariosDePrueba() {
        listaClientes.add(new ModeloRegistroUsuario("12345678", "Juan", "Pérez"));
        listaClientes.add(new ModeloRegistroUsuario("87654321", "María", "López"));
    }
}
