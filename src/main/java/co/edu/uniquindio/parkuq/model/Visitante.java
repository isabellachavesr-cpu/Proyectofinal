package co.edu.uniquindio.parkuq.model;

//clase Visitante que extiende de la Super Clase Usuario

import co.edu.uniquindio.parkuq.model.enums.TipoUsuario;

public class Visitante extends Usuario{
    public Visitante(String nombre, String identificacion){
        super(nombre, identificacion, TipoUsuario.VISITANTE);
    }

    /**
     * metodo que obtiene el descuento de la clase visitante
     * los visitantes no obtienen descuentos
     */

    @Override
    public double obtenerDescuento(){
        return 0.0;
    }
}
