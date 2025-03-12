package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ModeloCrearCuenta {
    public class Cuenta {
        private String id;
        private String cuiCliente;
        private double saldo;

        public Cuenta(String cuiCliente) {
            this.id = "D2D025" + UUID.randomUUID().toString().substring(0, 5);
            this.cuiCliente = cuiCliente;
            this.saldo = 0;
        }

        // Getters
        public String getId() { return id; }
        public String getCuiCliente() { return cuiCliente; }
        public double getSaldo() { return saldo; }
    }

    private List<Cuenta> cuentas;
    private int maxCuentasPorCliente;
    private String ultimoMensaje;

    public ModeloCrearCuenta(int maxCuentas) {
        this.cuentas = new ArrayList<>();
        this.maxCuentasPorCliente = maxCuentas;
    }

    public boolean crearCuenta(String cuiCliente) {
        int cuentasExistentes = (int) cuentas.stream()
                .filter(c -> c.getCuiCliente().equals(cuiCliente))
                .count();
        
        if(cuentasExistentes >= maxCuentasPorCliente) {
            ultimoMensaje = "No es posible crear más cuentas para el cliente";
            return false;
        }
        
        cuentas.add(new Cuenta(cuiCliente));
        ultimoMensaje = "Cuenta creada exitosamente. ID: " + cuentas.get(cuentas.size()-1).getId();
        return true;
    }

    public String getUltimoMensaje() {
        return ultimoMensaje;
    }
}
