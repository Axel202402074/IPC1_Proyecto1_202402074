
package Controlador;

import Modelo.ModeloPantallaPrincipal;
import VISTA.PantallaPrincipal;
import VISTA.RegistroUsuario_1; 
import javax.swing.JOptionPane;

public class ControladorPantallaPrincipal {
    
    private PantallaPrincipal pantallaPrin;
    public ModeloPantallaPrincipal modeloPrin;
    private RegistroUsuario_1 vistaregistroUsu; 
    
    
    public ControladorPantallaPrincipal(ModeloPantallaPrincipal modelo1, PantallaPrincipal pantalla1) {
        this.modeloPrin = modelo1;
    this.pantallaPrin = pantalla1;   
    this.vistaregistroUsu = new RegistroUsuario_1(); 

    pantalla1.btnRegistroUsu.addActionListener(e -> iniciarRegistro());
    }

    private void iniciarRegistro() {
    if (!modeloPrin.esAdministrador()) {
        JOptionPane.showMessageDialog(pantallaPrin, "Acceso denegado. No tiene permisos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
    
    pantallaPrin.setVisible(false);
    vistaregistroUsu.setVisible(true);

}
}
    