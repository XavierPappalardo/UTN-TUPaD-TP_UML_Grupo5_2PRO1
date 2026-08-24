package ejercicio7;

import java.time.LocalDate;

public class Esquiador extends Participante {
    private String DNI;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int edad;

    private Equipo equipo;
    private Federacion federacion;

    public Esquiador(String DNI, String nombre, LocalDate fechaNacimiento, int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    void asignarEquipo(Equipo equipo) {
        if (this.equipo != null) {
            throw new IllegalStateException("El esquiador ya pertenece a un equipo");
        }
        this.equipo = equipo;
    }

    public Federacion getFederacion() {
        return federacion;
    }

    void asignarFederacion(Federacion federacion) {
        if (this.federacion != null) {
            throw new IllegalStateException("El esquiador ya está federado");
        }
        this.federacion = federacion;
    }

    @Override
    public String toString() {
        return nombre + " (DNI " + DNI + ")";
    }
}