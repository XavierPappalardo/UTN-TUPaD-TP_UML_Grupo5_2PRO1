package Entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Provincia {
    // Atributos
    private String nombre;
    private Pais pais;
    private Ciudad capital;
    private List<Ciudad> ciudades;

    // Limita con otras provincias del mismo pais:
    private Set<Provincia> provinciasLimitrofes;

    // Limita con otros paises:
    private Set<Pais> paisesLimitrofes;

    // Constructor

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
        this.provinciasLimitrofes = new HashSet<>();
        this.paisesLimitrofes = new HashSet<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public Ciudad getCapital() {
        return capital;
    }

    //Setea la capital verificando que pertenezca a sus propias ciudades
    public void setCapital(Ciudad c) {
        if (!ciudades.contains(c)) {
            throw new IllegalArgumentException("La capital debe ser una ciudad de la provincia (" + nombre + ")");
        }
        this.capital = c;
    }

    public Set<Provincia> getProvinciasLimitrofes() {
        return provinciasLimitrofes;
    }

    public Set<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }

    // Metodos

    // Agregar Ciudad
    public void agregarCiudad(Ciudad ciudad) {
        if (!ciudades.contains(ciudad)) {
            ciudades.add(ciudad);
        }
    }

    // Limitar Con Pais
    public void limitarCon(Pais pais) {
        if (!this.paisesLimitrofes.contains(pais)) {
            this.paisesLimitrofes.add(pais);
        }
    }

    // Limitar con Provincia
    public void limitarCon(Provincia otra) {
        if (this.pais == null || otra.getPais() == null || this.pais != otra.getPais()) {
            throw new IllegalArgumentException("Restricción {Del mismo país}: " + this.nombre + " y " + otra.getNombre() + " no pertenecen al mismo país.");
        }
        if (!this.provinciasLimitrofes.contains(otra)) {
            this.provinciasLimitrofes.add(otra);
            otra.provinciasLimitrofes.add(this); // Bidireccional
        }
    }
}
