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


}
