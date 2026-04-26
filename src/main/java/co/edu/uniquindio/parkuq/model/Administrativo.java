package co.edu.uniquindio.parkuq.model;

import co.edu.uniquindio.parkuq.model.enums.TipoUsuario;

//Clase Administrativa que extiende de la super clase Usuario

public class Administrativo extends Usuario {
    public Administrativo(String nombre, String identificacion){
        super(nombre, identificacion, TipoUsuario.ADMINISTRATIVO);
    }
    /**
     * Metodo que calcula el descuento del Administrativo
     * 15% de descuento
     */

    @Override
    public double obtenerDescuento(){
        return 0.15;
    }
}
