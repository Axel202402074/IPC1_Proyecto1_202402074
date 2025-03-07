
package Modelo;

public class ModeloLogin {
    private  String usuarioCorrecto="axel";
    private  String contraseñaCorrecta="1234";
    
    
    //constructor

    public ModeloLogin(String usuarioCorrecto, String contraseñaCorrecta) {
        this.usuarioCorrecto = usuarioCorrecto;
        this.contraseñaCorrecta = contraseñaCorrecta;
    }

    public ModeloLogin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsuarioCorrecto() {
        return usuarioCorrecto;
    }

    public void setUsuarioCorrecto(String usuarioCorrecto) {
        this.usuarioCorrecto = usuarioCorrecto;
    }

    public String getContraseñaCorrecta() {
        return contraseñaCorrecta;
    }

    public void setContraseñaCorrecta(String contraseñaCorrecta) {
        this.contraseñaCorrecta = contraseñaCorrecta;
    }

   public boolean validarUsuario(String usuario, String password) {
        return usuario.equals(usuarioCorrecto) && password.equals(contraseñaCorrecta);
    }
 
    
  
}
