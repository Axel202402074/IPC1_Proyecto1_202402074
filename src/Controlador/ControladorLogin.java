package Controlador;

import Modelo.ModeloLogin;
import javax.swing.JOptionPane;
import VISTA.Interfazinicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLogin {
    
   private ModeloLogin modeloLog;
    private Interfazinicio vistaLog;

    
    
    public ControladorLogin (ModeloLogin modeloLog, Interfazinicio vistaLog) {
        this.modeloLog = modeloLog;
        this.vistaLog = vistaLog;

        this.vistaLog.BtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarCredenciales();
            }
        });
    }

    private void verificarCredenciales() {
        String usuario = vista.UserLogin.getText();
        String password = new String(vista.PasswordLogin.getPassword());

        if (modeloLog.validarUsuario(usuario, password)) {
            JOptionPane.showMessageDialog(vistaLog, "Bienvenid@ " + usuario + "!", "Acceso concedido", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(vistaLog, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    
    
    

