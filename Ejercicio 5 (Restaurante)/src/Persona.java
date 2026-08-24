import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;


    private List<Restaurante> restaurantesFrecuentados;


    private List<PlatoServido> valoracionesPlatos;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.restaurantesFrecuentados = new ArrayList<>();
        this.valoracionesPlatos = new ArrayList<>();
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Restaurante> getRestaurantesFrecuentados() { return restaurantesFrecuentados; }
    public List<PlatoServido> getValoracionesPlatos() { return valoracionesPlatos; }
}