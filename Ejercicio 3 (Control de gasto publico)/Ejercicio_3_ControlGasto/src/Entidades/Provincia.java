package Entidades;
import java.util.ArrayList;
import java.util.List;

public class Provincia {
    // Atributos
    private String nombre;
    private List<Ciudad> ciudades;

    // Constructor
    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void agregarCiudad(Ciudad ciudad) {
        if (!ciudades.contains(ciudad)) {
            ciudades.add(ciudad);
        }
    }

    // Metodo Derivado - devuelve true si tiene la mitad de ciudades en Déficit.
    public boolean mitadCiudadesEnDeficit() {
        if (ciudades.isEmpty()) return false;

        long enDeficitCount = ciudades.stream().filter(Ciudad::enDeficit).count();
        return enDeficitCount > (ciudades.size() / 2.0);
    }

    // toString
    @Override
    public String toString() {
        return nombre;
    }
}