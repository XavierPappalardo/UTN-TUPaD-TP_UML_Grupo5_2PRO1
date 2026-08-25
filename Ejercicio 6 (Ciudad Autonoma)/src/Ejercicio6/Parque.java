package Ejercicio6;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Parque {
    private String nombre;
    private Date fechaDeclaracionPN;

    private List<ComunidadAutonoma> comunidades = new ArrayList<>();
    private List<Area> areas = new ArrayList<>();
    private List<Alojamiento> alojamientos = new ArrayList<>();
    private List<Entrada> entradas = new ArrayList<>();
    private List<Personal> personal = new ArrayList<>();

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFechaDeclaracionPN() { return fechaDeclaracionPN; }
    public void setFechaDeclaracionPN(Date fechaDeclaracionPN) { this.fechaDeclaracionPN = fechaDeclaracionPN; }

    public List<ComunidadAutonoma> getComunidades() { return comunidades; }
    public List<Area> getAreas() { return areas; }
    public List<Alojamiento> getAlojamientos() { return alojamientos; }
    public List<Entrada> getEntradas() { return entradas; }
    public List<Personal> getPersonal() { return personal; }
}