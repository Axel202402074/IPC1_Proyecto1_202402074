
package Controlador;

import Modelo.ModeloLogin;
import javax.swing.JOptionPane;
import VISTA.Interfazinicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import VISTA.PantallaPrincipal;


public class ControladorLogin {
    private ModeloLogin modeloLog;
    private Interfazinicio vistaLog;
    private PantallaPrincipal pantallapri;

    public ControladorLogin(ModeloLogin modelo, Interfazinicio vista) {
        this.modeloLog = modelo;
        this.vistaLog = vista;
        this.pantallapri= new PantallaPrincipal();
       
        vistaLog.BtnLogin.addActionListener(e -> verificarCredenciales());
    }

    private void verificarCredenciales() {
        String usuario = vistaLog.UserLogin.getText();
        String password = new String(vistaLog.PasswordLogin.getPassword());

        if (modeloLog.validarUsuario(usuario, password)) {
            vistaLog.setVisible(false);
            pantallapri.setVisible(true);
            JOptionPane.showMessageDialog(vistaLog, "Bienvenido " + usuario + "!", "Acceso concedido", JOptionPane.INFORMATION_MESSAGE);
        
            
        } else {
            JOptionPane.showMessageDialog(vistaLog, "Usuario o contraseña incorrectos. Por favor, vuelva a intentarlo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
}


    
    
    

