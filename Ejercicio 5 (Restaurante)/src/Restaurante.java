import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private List<Sucursal> sucursales;
    private List<Persona> clientesFrecuentes;
    private List<Plato> platosOfrecidos;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
        this.clientesFrecuentes = new ArrayList<>();
        this.platosOfrecidos = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }


    public boolean agregarPlato(Plato plato) {
        if (this.platosOfrecidos.size() < 20) {
            this.platosOfrecidos.add(plato);
            return true;
        } else {
            System.out.println("No se pueden agregar más de 20 platos al restaurante.");
            return false;
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Sucursal> getSucursales() { return sucursales; }
    public List<Persona> getClientesFrecuentes() { return clientesFrecuentes; }
    public List<Plato> getPlatosOfrecidos() { return platosOfrecidos; }
}