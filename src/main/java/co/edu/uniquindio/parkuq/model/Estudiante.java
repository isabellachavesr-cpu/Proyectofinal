package co.edu.uniquindio.parkuq.model;

import co.edu.uniquindio.parkuq.model.enums.TipoUsuario;

/**
 * Usuario de tipo Estudiante de la Universidad del Quindío.
 * @author Equipo PARKUQ
 */
public class Estudiante extends co.edu.uniquindio.parkuq.model.Usuario {

    public Estudiante(String nombre, String identificacion) {
        super(nombre, identificacion, TipoUsuario.ESTUDIANTE);
    }

    /**
     *  Metodo para definir el descuento real para estudiantes
     *  20% descuento para estudiantes
     */


    @Override
    public double obtenerDescuento() {
        return 0.20;
    }
}