package cosmeticanatural;

import cosmeticanatural.Cliente;
import cosmeticanatural.Producto;
import cosmeticanatural.RepresentanteVentas;

import java.time.LocalDate;

public class TicketVenta {
    private LocalDate fecha;
    private Producto producto;
    private double precio;
    private Cliente cliente; // puede quedar null hasta completarse
    private RepresentanteVentas representante;

    public TicketVenta(LocalDate fecha, Producto producto, RepresentanteVentas representante) {
        this.fecha = fecha;
        this.producto = producto;
        this.precio = producto.getPrecio();
        this.representante = representante;
    }

    public void asignarCliente(Cliente cliente) { this.cliente = cliente; }

    public LocalDate getFecha() { return fecha; }
    public double getPrecio() { return precio; }
}