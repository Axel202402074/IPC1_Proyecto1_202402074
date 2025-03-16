package Modelo;

public class ModeloPantallaPrincipal {
    private String rolUsuario; // Puede ser "Administrador", "Usuario", etc.

    public ModeloPantallaPrincipal(String rol) {
        this.rolUsuario = rol;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public boolean esAdministrador() {
        return "Administrador".equalsIgnoreCase(rolUsuario);
    }
    
    
}
