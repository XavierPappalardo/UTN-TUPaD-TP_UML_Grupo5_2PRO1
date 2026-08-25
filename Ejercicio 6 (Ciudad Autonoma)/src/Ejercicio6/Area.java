package Ejercicio6;

import java.util.List;
import java.util.ArrayList;

public class Area {
    private String nombre;
    private float km2;
    private Parque parque;
    private List<RolGuardia> guardasAsignados = new ArrayList<>();

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public float getKm2() { return km2; }
    public void setKm2(float km2) { this.km2 = km2; }

    public Parque getParque() { return parque; }
    public void setParque(Parque parque) { this.parque = parque; }

    public List<RolGuardia> getGuardasAsignados() { return guardasAsignados; }
}