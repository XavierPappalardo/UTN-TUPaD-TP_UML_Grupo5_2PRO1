package ejercicio8;

import java.util.Date;

class Servicio {
    private Date fecha;
    private double horasInvertidas;
    private String tipoTrabajo;
    private Mecanico mecanico;
    private Avion avion;

    public Servicio(Date fecha, double horasInvertidas, String tipoTrabajo, Mecanico mecanico, Avion avion) {
        this.fecha = fecha;
        this.horasInvertidas = horasInvertidas;
        this.tipoTrabajo = tipoTrabajo;
        this.mecanico = mecanico;
        this.avion = avion;
        avion.agregarServicio(this);
        mecanico.agregarServicio(this);
    }

    public Date getFecha() { return fecha; }
    public double getHorasInvertidas() { return horasInvertidas; }
    public String getTipoTrabajo() { return tipoTrabajo; }
    public Mecanico getMecanico() { return mecanico; }
    public Avion getAvion() { return avion; }
}