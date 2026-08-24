package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Pista {
    private String codigo;
    private String dificultad;
    private int numCorrelativo;
    private double longitud;

    private Estacion estacion;
    private List<Pista> subpistas;

    public Pista(String codigo, String dificultad, int numCorrelativo, double longitud) {
        this.codigo = codigo;
        this.dificultad = dificultad;
        this.numCorrelativo = numCorrelativo;
        this.longitud = longitud;
        this.subpistas = new ArrayList<>();
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setNumCorrelativo(int numCorrelativo) {
        this.numCorrelativo = numCorrelativo;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public int getNumCorrelativo() {
        return numCorrelativo;
    }

    public double getLongitud() {
        return longitud;
    }

    public Estacion getEstacion() {
        return estacion;
    }

    void asignarEstacion(Estacion estacion) {
        this.estacion = estacion;
    }

    public void agregarSubpista(Pista p) {
        this.subpistas.add(p);
    }

    public List<Pista> getSubpistas() {
        return subpistas;
    }

    @Override
    public String toString() {
        return codigo;
    }
}