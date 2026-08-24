package Entidades;
import java.util.ArrayList;
import java.util.List;

public class Pais {
    // Atributos
    private String nombre;
    private List<Provincia> provincias;

    // Constructor
    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    // Metodos
    // Agregar Provincia
    public void agregarProvincia(Provincia provincia) {
        if (!provincias.contains(provincia)) {
            provincias.add(provincia);
        }
    }

    // Filtra unicamente las ciudades CONTROLADAS que se encuentran en DEFICIT
    public List<Ciudad> ciudadesDeficitarias() {
        List<Ciudad> res = new ArrayList<>();
        for (Provincia p : provincias) {
            for (Ciudad c : p.getCiudades()) {
                if (c.controlada() && c.enDeficit()) {
                    res.add(c);
                }
            }
        }
        return res;
    }

    // Devuelve las provincias que tienen mas de la mitad de sus ciudades en deficit.
    public List<Provincia> provinciasEnRiesgo() {
        List<Provincia> res = new ArrayList<>();
        for (Provincia p : provincias) {
            if (p.mitadCiudadesEnDeficit()) {
                res.add(p);
            }
        }
        return res;
    }
}