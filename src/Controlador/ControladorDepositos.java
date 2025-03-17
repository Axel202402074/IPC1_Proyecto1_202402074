package Controlador;

import Modelo.ModeloRegistroUsuario;
import VISTA.Depositos_4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ControladorDepositos {
    private Depositos_4 vista;
    private List<ModeloRegistroUsuario> clientes;
    private ModeloRegistroUsuario clienteActual;

    public ControladorDepositos(Depositos_4 vista, List<ModeloRegistroUsuario> clientes) {
        this.vista = vista;
        this.clientes = clientes;
        configurarCombos();
        this.vista.addDepositoListener(new DepositoListener());
    }

    private void configurarCombos() {
        // Configurar combo de clientes
        DefaultComboBoxModel<String> modeloClientes = new DefaultComboBoxModel<>();
        modeloClientes.addElement("Seleccione cliente"); // Elemento por defecto
        clientes.forEach(c -> modeloClientes.addElement(c.getCui()));
        vista.boxidcuenta.setModel(modeloClientes);
        
        // Listener para selección de cliente
        vista.boxidcuenta.addActionListener(e -> {
            if(vista.boxidcuenta.getSelectedIndex() > 0) { // Ignorar primer elemento
                cargarCuentasCliente((String)vista.boxidcuenta.getSelectedItem());
            }
        });
    }

    private void cargarCuentasCliente(String cui) {
        clienteActual = clientes.stream()
                .filter(c -> c.getCui().equals(cui))
                .findFirst()
                .orElse(null);
        
        if(clienteActual != null) {
            DefaultComboBoxModel<String> modeloCuentas = new DefaultComboBoxModel<>();
            clienteActual.getIDsCuentas().forEach(modeloCuentas::addElement);
            vista.boxidcuenta.setModel(modeloCuentas);
            vista.getLblCliente().setText("Cliente: " + clienteActual.getNombre());
            
            // Habilitar componentes
            vista.boxidcuenta.setEnabled(!clienteActual.getIDsCuentas().isEmpty());
            vista.txtmontodep.setEnabled(true);
        }
    }

    class DepositoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Validación 1: Cliente seleccionado
            if(vista.boxidcuenta.getSelectedIndex() <= 0) {
                vista.mostrarMensaje("Seleccione un cliente primero", "error");
                return;
            }
            
            // Validación 2: Cuenta seleccionada
            if(vista.boxidcuenta.getSelectedIndex() == -1) {
                vista.mostrarMensaje("Seleccione una cuenta válida", "error");
                return;
            }
            
            // Validación 3: Monto numérico positivo
            try {
                double monto = Double.parseDouble(vista.getMonto());
                if(monto <= 0) throw new NumberFormatException();
                
                // Lógica de depósito
                if(clienteActual.realizarDeposito(
                    vista.getCuentaSeleccionada(), 
                    monto)) {
                    
                    vista.mostrarMensaje(
