package ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prueba {
    private String nombre;
    private String tipo;
    private LocalDate[] fechasPrevistas;
    private LocalDate[] fechasRealizacion;
    private double tiempoVencedor;

    private List<Pista> pistasUtilizadas;
    private List<Inscripcion> inscripciones;
    private Participante vencedor;

    public Prueba(String nombre, String tipo, LocalDate[] fechasPrevistas, LocalDate[] fechasRealizacion, double tiempoVencedor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechasPrevistas = fechasPrevistas;
        this.fechasRealizacion = fechasRealizacion;
        this.tiempoVencedor = tiempoVencedor;
        this.pistasUtilizadas = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }

    public void setFechasPrevistas(LocalDate[] fechasPrevistas) {
        this.fechasPrevistas = fechasPrevistas;
    }

    public void setFechasRealizacion(LocalDate[] fechasRealizacion) {
        this.fechasRealizacion = fechasRealizacion;
    }

    public void setTiempoVencedor(double tiempoVencedor) {
        this.tiempoVencedor = tiempoVencedor;
    }

    public void setPistasUtilizadas(List<Pista> pistasUtilizadas) {
        this.pistasUtilizadas = pistasUtilizadas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate[] getFechasPrevistas() {
        return fechasPrevistas;
    }

    public LocalDate[] getFechasRealizacion() {
        return fechasRealizacion;
    }

    public double getTiempoVencedor() {
        return tiempoVencedor;
    }

    public List<Pista> getPistasUtilizadas() {
        return pistasUtilizadas;
    }

    public void agregarPistaUtilizada(Pista p) {
        this.pistasUtilizadas.add(p);
    }

    public void agregarInscripcion(Inscripcion i) {
        i.setPrueba(this);
        this.inscripciones.add(i);
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public Participante getVencedor() {
        return vencedor;
    }

    public void setVencedor(Participante vencedor) {
        this.vencedor = vencedor;
    }

    @Override
    public String toString() {
        return nombre;
    }
}