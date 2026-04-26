package co.edu.uniquindio.parkuq.model;

import co.edu.uniquindio.parkuq.model.enums.EstadoVehiculo;
import java.time.LocalDateTime;


public abstract class Vehiculo {
    protected String placa;
    protected String nombreConductor;
    protected String identificacionConductor;
    protected LocalDateTime horaIngreso;
    protected Espacio espacioAsignado;
    protected EstadoVehiculo estado;

    public Vehiculo (String placa, String nombreConductor, String identificacionConductor) {
        this. placa = placa;
        this. nombreConductor = nombreConductor;
        this. identificacionConductor = identificacionConductor;
        this. estado = EstadoVehiculo.DENTRO;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNombreConductor() {
        return nombreConductor;
    }
    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }
    public String getIdentificacionConductor() {
        return identificacionConductor;
    }
    public void setIdentificacionConductor(String identificacionConductor) {
        this.identificacionConductor = identificacionConductor;
    }

    public abstract double calcularTarifa(long horas, Tarifa tarifa);


}
