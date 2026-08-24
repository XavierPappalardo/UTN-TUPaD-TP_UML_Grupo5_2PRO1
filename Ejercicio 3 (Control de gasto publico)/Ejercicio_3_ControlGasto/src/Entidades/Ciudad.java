package Entidades;
import java.util.ArrayList;
import java.util.List;

public class Ciudad {

    // Atributos
    public static final int UMBRAL_CONTROL = 100_000;
    private String nombre;
    private int habitantes;
    private float gastosMantenimiento;
    private List<Impuesto> impuestos;

    // Constructor
    public Ciudad(String nombre, int habitantes, float gastosMantenimiento) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.gastosMantenimiento = gastosMantenimiento;
        this.impuestos = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public float getGastosMantenimiento() {
        return gastosMantenimiento;
    }

    public void setGastosMantenimiento(float gastosMantenimiento) {
        this.gastosMantenimiento = gastosMantenimiento;
    }

    public List<Impuesto> getImpuestos() {
        return impuestos;
    }

    // Metodos
    // Agregar Impuesto
    public void agregarImpuesto(Impuesto impuesto) {
        if (this.impuestos.size() >= 5) {
            throw new IllegalStateException("Una ciudad solo puede tener un máximo de 5 impuestos.");
        }
        this.impuestos.add(impuesto);
    }

    // Total Recaudado (suma de lo recaudado por sus impuestos)
    public float totalRecaudado() {
        float suma = 0f;
        for (Impuesto i : impuestos) {
            suma += i.getMontoRecaudado();
        }
        return suma;
    }

    // Boolean Controlada (Si tiene > 100.000 habitantes)
    public boolean controlada() {
        return habitantes > UMBRAL_CONTROL;
    }
    // Boolean en Deficit
    public boolean enDeficit() {
        return gastosMantenimiento > totalRecaudado();
    }

    // toString
    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", habitantes=" + habitantes +
                ", gastosMantenimiento=" + gastosMantenimiento +
                ", impuestos=" + impuestos +
                '}';
    }
}