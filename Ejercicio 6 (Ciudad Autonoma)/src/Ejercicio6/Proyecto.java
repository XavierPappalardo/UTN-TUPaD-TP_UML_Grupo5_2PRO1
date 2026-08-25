package Ejercicio6;

import java.util.Date;

public class Proyecto {
    private String nombre;
    private float presupuesto;
    private Date fechaInicio;
    private Date fechaFin;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public float getPresupuesto() { return presupuesto; }
    public void setPresupuesto(float presupuesto) { this.presupuesto = presupuesto; }

    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

    public Date getFechaFin() { return fechaFin; }
    public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }
}