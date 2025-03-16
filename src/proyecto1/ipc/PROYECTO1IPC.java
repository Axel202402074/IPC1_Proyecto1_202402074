
package proyecto1.ipc;



import Modelo.ModeloLogin;
import VISTA.Interfazinicio;
import Controlador.ControladorLogin;
import Controlador.ControladorCrearCuenta;
import Modelo.ModeloCrearCuenta;
import Modelo.ModeloPantallaPrincipal;
import Modelo.ModeloRegistroUsuario;
import VISTA.CrearCuenta_2;
import VISTA.PantallaPrincipal;
import VISTA.RegistroUsuario_1;

public class PROYECTO1IPC {
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            ModeloPantallaPrincipal modelo = new ModeloPantallaPrincipal("Usuario"); // Cambia a "Administrador" si es admin
           
        }
    });
        
        
        // Inicializar el modelo y la vista
        ModeloLogin modelo = new ModeloLogin("axel", "1234");
        Interfazinicio vista = new Interfazinicio();
        
        // Inicializar el controlador
        ControladorLogin controlador = new ControladorLogin(modelo, vista);
        
        // Mostrar la vista
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
        
        //Inicializar la vista 
        //PantallaPrincipal vista1 =new PantallaPrincipal();
        RegistroUsuario_1 vistaregistro=new RegistroUsuario_1();
        
    }
    
    
    
    
    //crear usuario
        ModeloRegistroUsuario modeloUsuarios = new ModeloRegistroUsuario(6); // 6 clientes máx
        ModeloCrearCuenta modeloCuentas = new ModeloCrearCuenta(3); // 3 cuentas por cliente
        CrearCuenta_2 vistaCuentas = new CrearCuenta_2();

        // El controlador se encarga de todo automáticamente
        ControladorCrearCuenta controladorCuenta= new ControladorCrearCuenta(vistaCuentas, modeloCuentas, modeloUsuarios);
   
        
        
        
        
        
        
        
        

}    

