
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModeloCrearCuenta {
    
    public static class Cuenta {
        private final String id;
        private final String cuiCliente;
        private double saldo;
        private final List<ModeloHistorial> mismovimientos;
        private static int contador = 0;

        public Cuenta(String cuiCliente) {
            contador++;
            this.id = "D2D025" + contador;
            this.cuiCliente = cuiCliente;
            this.saldo = 0; // Saldo inicial en 0
            this.mismovimientos = new ArrayList<>();
        }

        public String getId() { return id; }
        public String getCuiCliente() { return cuiCliente; }
        public double getSaldo() { return saldo; }
        public void setSaldo(double saldo) { this.saldo = saldo; }
        public List<ModeloHistorial> getMismovimientos() { return mismovimientos; }
    }

    private final List<Cuenta> cuentas;
    private final int maxCuentasPorCliente;
    private String ultimoMensaje;
    private final ModeloRegistroUsuario modeloUsuario;

    public ModeloCrearCuenta(int maxCuentasPorCliente, ModeloRegistroUsuario modeloUsuario) {
        this.maxCuentasPorCliente = maxCuentasPorCliente;
        this.cuentas = new ArrayList<>();
        this.modeloUsuario = modeloUsuario;
    }

    // Constructor alternativo en caso de no recibir un modelo de usuario (evita null)
    public ModeloCrearCuenta(int maxCuentasPorCliente) {
        this(maxCuentasPorCliente, null);
    }

    public boolean crearCuenta(String cuiCliente) {
        if (modeloUsuario == null || modeloUsuario.buscarUsuarioPorCUI(cuiCliente) == null) {
            this.ultimoMensaje = "El cliente no existe.";
            System.out.println("Creando cuenta para el CUI: " + cuiCliente);
            return true;
        }

        long cuentasExistentes = cuentas.stream()
                .filter(c -> c.getCuiCliente().equals(cuiCliente))
                .count();

        if (cuentasExistentes >= maxCuentasPorCliente) {
            this.ultimoMensaje = "No se pueden crear más de " + maxCuentasPorCliente + " cuentas por cliente.";
            return false;
        }

        Cuenta nuevaCuenta = new Cuenta(cuiCliente);
        cuentas.add(nuevaCuenta);
        this.ultimoMensaje = "Cuenta creada exitosamente. ID: " + nuevaCuenta.getId();
        return true;
    }

    public List<Cuenta> getCuentasPorCliente(String cui) {
        return cuentas.stream()
                .filter(c -> c.getCuiCliente().equals(cui))
                .collect(Collectors.toList());
    }

    public String getUltimoMensaje() {
        return this.ultimoMensaje;
    }
}
    