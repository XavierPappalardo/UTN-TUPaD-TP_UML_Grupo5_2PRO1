package Entidades;

public class Ciudad {
    // Atributo
    private String nombre;

    // Constructor - Getter
    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // toString
    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
