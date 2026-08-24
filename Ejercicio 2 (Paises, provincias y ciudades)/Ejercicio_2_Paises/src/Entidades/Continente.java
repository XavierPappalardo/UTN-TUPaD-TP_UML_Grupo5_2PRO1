package Entidades;
import java.util.List;
import java.util.ArrayList;

public class Continente {

    // Atributos
    private String nombre;
    private List<Pais> paises;

    // Constructor
    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    // Metodo
    // Agregar Paises
    public void agregarPais(Pais pais) {
        if (!paises.contains(pais)) {
            paises.add(pais);
            pais.setContinente(this);
        }
    }
}
