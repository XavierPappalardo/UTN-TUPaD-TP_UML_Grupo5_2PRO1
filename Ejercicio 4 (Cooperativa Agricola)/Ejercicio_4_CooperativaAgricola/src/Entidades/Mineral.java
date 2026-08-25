package Entidades;
import Enums.TipoMineral;

public class Mineral {
    // Atributos
    private String nombre;
    private TipoMineral tipo;

    // Constructor
    public Mineral(String nombre, TipoMineral tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public TipoMineral getTipo() {
        return tipo;
    }

    public boolean esPrimario() {
        return tipo == TipoMineral.PRIMARIO;
    }

    // Equals y HashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mineral mineral = (Mineral) obj;
        return nombre != null ? nombre.equalsIgnoreCase(mineral.nombre) : mineral.nombre == null;
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.toLowerCase().hashCode() : 0;
    }
}