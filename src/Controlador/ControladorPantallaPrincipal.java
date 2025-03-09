package Controlador;

import Modelo.ModeloPantallaPrincipal;
import VISTA.PantallaPrincipal;
import VISTA.RegistroUsuario; 
import javax.swing.JOptionPane;

public class ControladorPantallaPrincipal {
    
    private PantallaPrincipal pantallaPrin;
    private ModeloPantallaPrincipal modeloPrin;
    private RegistroUsuario vistaregistroUsu; 

    public ControladorPantallaPrincipal(ModeloPantallaPrincipal modelo1, PantallaPrincipal pantalla1) {
        this.modeloPrin = modelo1;
    this.pantallaPrin = pantalla1;
    this.vistaregistroUsu = new RegistroUsuario(); 

    pantalla1.btnRegistroUsu.addActionListener(e -> iniciarRegistro());
    }

    private void iniciarRegistro() {
       
    if (pantallaPrin.btnRegistroUsu != null) {
        pantallaPrin.setVisible(false);
        vistaregistroUsu.setVisible(true);
    } 
}
}
    