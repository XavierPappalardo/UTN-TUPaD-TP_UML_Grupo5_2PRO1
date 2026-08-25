package ejercicio5;
import java.util.ArrayList;
import java.util.List;

public class Plato {
    private String nombre;


    private List<PlatoServido> valoraciones;

    public Plato(String nombre) {
        this.nombre = nombre;
        this.valoraciones = new ArrayList<>();
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<PlatoServido> getValoraciones() { return valoraciones; }
}