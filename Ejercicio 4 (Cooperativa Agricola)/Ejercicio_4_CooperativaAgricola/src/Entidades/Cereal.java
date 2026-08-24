package Entidades;
import java.util.HashSet;
import java.util.Set;

public abstract class Cereal {
    private String nombre;
    private Set<Mineral> requeridos;

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.requeridos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Mineral> getRequeridos() {
        return requeridos;
    }

    public void agregarMineralRequerido(Mineral mineral) {
        this.requeridos.add(mineral);
    }
}