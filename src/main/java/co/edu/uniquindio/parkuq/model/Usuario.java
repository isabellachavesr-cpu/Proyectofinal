package co.edu.uniquindio.parkuq.model;

import co.edu.uniquindio.parkuq.model.enums.TipoUsuario;

/**
 * Clase abstracta que representa a un usuario registrado en el sistema.
 * Cada tipo de usuario define su propio descuento.
 *
 * @author Equipo PARKUQ
 */
public abstract class Usuario {

    protected String nombre;
    protected String identificacion;
    protected TipoUsuario tipoUsuario;

    /**
     * Constructor de la clase Usuario
     * @param nombre
     * @param identificacion
     * @param tipoUsuario
     */

    public Usuario(String nombre, String identificacion, TipoUsuario tipoUsuario) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Retorna el porcentaje de descuento
     * @return
     */
    public abstract double obtenerDescuento();

    /**
     * get y set
     * @return
     */

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public TipoUsuario getTipoUsuario() { return tipoUsuario; }
    public void setTipoUsuario(TipoUsuario tipoUsuario) { this.tipoUsuario = tipoUsuario; }
}