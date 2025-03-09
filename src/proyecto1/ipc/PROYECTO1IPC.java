
package proyecto1.ipc;



import Modelo.ModeloLogin;
import VISTA.Interfazinicio;
import Controlador.ControladorLogin;
import VISTA.PantallaPrincipal;
import VISTA.RegistroUsuario;

public class PROYECTO1IPC {
    public static void main(String[] args) {
        // Inicializar el modelo y la vista
        ModeloLogin modelo = new ModeloLogin("axel", "1234");
        Interfazinicio vista = new Interfazinicio();
        
        // Inicializar el controlador
        ControladorLogin controlador = new ControladorLogin(modelo, vista);
        
        // Mostrar la vista
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
        
        //Inicializar la vista 
        PantallaPrincipal vista1 =new PantallaPrincipal();
        RegistroUsuario vistaregistro=new RegistroUsuario();
        
    }
}
