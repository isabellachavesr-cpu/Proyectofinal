package co.edu.uniquindio.parkuq.model;

public class Motocicleta extends Vehiculo {

    public Motocicleta(String placa, String nombreConductor, String identificacionConductor) {
        super (placa, nombreConductor, identificacionConductor);
    }

    @Override
    public double calcularTarifa(long horas, Tarifa tarifa) {
        double base = Math.max(horas, 1) * tarifa.getValorPorHora();
        return base * (1 - tarifa.getDescuento());
    }
}
