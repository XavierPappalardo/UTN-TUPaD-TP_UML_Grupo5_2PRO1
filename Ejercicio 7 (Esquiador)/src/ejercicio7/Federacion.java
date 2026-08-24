package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Federacion {
    private String nombre;
    private int numFederados;

    private List<Estacion> estacionesAdministradas;
    private List<Esquiador> esquiadoresFederados;

    public Federacion(String nombre, int numFederados) {
        this.nombre = nombre;
        this.numFederados = numFederados;
        this.esquiadoresFederados = new ArrayList<>();
        this.estacionesAdministradas = new ArrayList<>();
    }

    public void setNumFederados(int numFederados) {
        this.numFederados = numFederados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumFederados() {
        return numFederados;
    }

    public List<Estacion> getEstacionesAdministradas() {
        return estacionesAdministradas;
    }

    public List<Esquiador> getEsquiadoresFederados() {
        return esquiadoresFederados;
    }

    // "federa" -> ejercicio7.Federacion 1 -- 1..* ejercicio7.Esquiador
    public void federar(Esquiador e) {
        e.asignarFederacion(this);
        this.esquiadoresFederados.add(e);
        this.numFederados = this.esquiadoresFederados.size();
    }

    public void administrar(Estacion estacion) {
        estacion.agregarFederacionAdministradora(this);
        this.estacionesAdministradas.add(estacion);
    }

    @Override
    public String toString() {
        return nombre;
    }
}