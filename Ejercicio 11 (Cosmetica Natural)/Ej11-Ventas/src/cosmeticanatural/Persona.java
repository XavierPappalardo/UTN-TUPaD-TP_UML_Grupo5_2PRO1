package cosmeticanatural;

import java.time.LocalDate;

public abstract class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected LocalDate fechaNacimiento;

    public Persona(String nombre, String direccion, String telefono, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}