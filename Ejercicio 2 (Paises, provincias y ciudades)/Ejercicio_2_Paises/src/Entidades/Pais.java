package Entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Pais {
    // Atributos
    private String nombre;
    private Continente continente;
    private Ciudad capital;
    private List<Provincia> provincias;

    // Limita con otros paises
    private Set<Pais> paisesLimitrofes;

    // Constructor

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
        this.paisesLimitrofes = new HashSet<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public Ciudad getCapital() {
        return capital;
    }

    //Setea la capital del país verificando que sea una ciudad perteneciente a sus provincias
    public void setCapital(Ciudad c) {
        boolean pertenece = provincias.stream()
                .anyMatch(p -> p.getCiudades().contains(c));

        if (!pertenece) {
            throw new IllegalArgumentException("La capital del país (" + nombre + ") debe pertenecer a una de sus provincias.");
        }
        this.capital = c;
    }

    public Set<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }
    // Metodos

    // Agregar Provincia
    public void agregarProvincia(Provincia provincia) {
        if (!provincias.contains(provincia)) {
            provincias.add(provincia);
            provincia.setPais(this);
        }
    }

    // Limitar con Pais
    public void limitarCon(Pais otro) {
        if (otro == this) {
            throw new IllegalArgumentException("Un país no puede limitar consigo mismo.");
        }
        if (!this.paisesLimitrofes.contains(otro)) {
            this.paisesLimitrofes.add(otro);
            otro.paisesLimitrofes.add(this);
        }
    }
}
