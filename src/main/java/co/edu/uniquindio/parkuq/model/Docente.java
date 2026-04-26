package co.edu.uniquindio.parkuq.model;

import co.edu.uniquindio.parkuq.model.enums.TipoUsuario;

public class Docente extends Usuario {
    public Docente(String nombre, String identificacion){
        super(nombre, identificacion, TipoUsuario.DOCENTE);
    }

    /**
     *  Metodo para definir el descuento real para docentes
     *  30% descuento para estudiantes
     */

    @Override
    public double obtenerDescuento(){
        return 0.30;
    }
}
