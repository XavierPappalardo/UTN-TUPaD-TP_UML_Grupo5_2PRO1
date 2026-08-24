package cosmeticanatural;

import cosmeticanatural.Persona;

import java.time.LocalDate;

public class Cliente extends Persona {
    private LocalDate fechaIngreso;

    public Cliente(String nombre, String direccion, String telefono,
                   LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.fechaIngreso = fechaIngreso;
    }
}