package proyecto1.ipc;

import Modelo.ModeloLogin;
import VISTA.Interfazinicio;
import Controlador.ControladorLogin;


public class PROYECTO1IPC {
    public static void main(String[] args) {
        /*ModeloLogin modelo = new ModeloLogin();
        InterfazLogin vista = new InterfazLogin();
        ControladorLogin controlador = new ControladorLogin(modelo, vista);
        controlador.iniciar();*/
        
        Interfazinicio princLog  = new Interfazinicio();
        princLog.setVisible(true);
        princLog.setLocationRelativeTo(null);
    }
}

