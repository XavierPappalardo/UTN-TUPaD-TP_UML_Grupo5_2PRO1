package ejercicio5;
public class PlatoServido {
    private int valoracion;
    private Persona persona;
    private Plato plato;

    private Restaurante restaurante;

    public PlatoServido(Persona persona, Plato plato, Restaurante restaurante, int valoracion) {
        this.persona = persona;
        this.plato = plato;
        this.restaurante = restaurante;
        this.valoracion = valoracion;
    }

    public int getValoracion() { return valoracion; }
    public void setValoracion(int valoracion) { this.valoracion = valoracion; }
    public Persona getPersona() { return persona; }
    public Plato getPlato() { return plato; }
    public Restaurante getRestaurante() { return restaurante; }
}