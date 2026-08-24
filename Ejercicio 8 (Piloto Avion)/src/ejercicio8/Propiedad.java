package ejercicio8;

import java.util.Date;

abstract class Propiedad {
    private Persona propietario;
    private Avion avion;
    private Date fechaAdquisicion;

    public Propiedad(Persona propietario, Avion avion, Date fechaAdquisicion) {
        this.propietario = propietario;
        this.avion = avion;
        this.fechaAdquisicion = fechaAdquisicion;
        avion.agregarPropiedad(this);
    }

    public Persona getPropietario() { return propietario; }
    public Avion getAvion() { return avion; }
    public Date getFechaAdquisicion() { return fechaAdquisicion; }
}