package ejercicio8;

import java.util.ArrayList;
import java.util.List;

class TipoAvion {
    private String numModelo;
    private double capacidad;
    private double peso;
    private List<Avion> aviones = new ArrayList<>();
    private List<Piloto> pilotosAutorizados = new ArrayList<>();
    private List<Mecanico> mecanicosAutorizados = new ArrayList<>();

    public TipoAvion(String numModelo, double capacidad, double peso) {
        this.numModelo = numModelo;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    void agregarAvion(Avion a) { aviones.add(a); }
    void agregarPilotoAutorizado(Piloto p) { pilotosAutorizados.add(p); }
    void agregarMecanicoAutorizado(Mecanico m) { mecanicosAutorizados.add(m); }

    public String getNumModelo() { return numModelo; }
    public double getCapacidad() { return capacidad; }
    public double getPeso() { return peso; }
    public List<Avion> getAviones() { return aviones; }
    public List<Piloto> getPilotosAutorizados() { return pilotosAutorizados; }
    public List<Mecanico> getMecanicosAutorizados() { return mecanicosAutorizados; }
}