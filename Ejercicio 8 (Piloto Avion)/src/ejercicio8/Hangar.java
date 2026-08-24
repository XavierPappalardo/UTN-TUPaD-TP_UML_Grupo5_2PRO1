package ejercicio8;

import java.util.ArrayList;
import java.util.List;

class Hangar {
    private int numero;
    private int capacidad;
    private String ubicacion;
    private List<Avion> aviones = new ArrayList<>();

    public Hangar(int numero, int capacidad, String ubicacion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }

    void agregarAvion(Avion a) { aviones.add(a); }

    public int getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }
    public String getUbicacion() { return ubicacion; }
    public List<Avion> getAviones() { return aviones; }
}