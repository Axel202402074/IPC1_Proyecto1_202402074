
package Modelo;

import java.time.LocalDateTime;

public class ModeloDepositos {
    private String idCuenta;
    private double monto;
    private LocalDateTime fecha;
    
    
    public ModeloDepositos(String idCuenta, double monto) {
        this.idCuenta = idCuenta;
        this.monto = monto;
        this.fecha = LocalDateTime.now();
    }
    
    
    // Getters
    public String getIdCuenta() { return idCuenta; }
    public double getMonto() { return monto; }
    public LocalDateTime getFecha() { return fecha; }
    
    
    
    
    
}
