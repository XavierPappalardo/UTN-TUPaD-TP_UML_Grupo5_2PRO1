package cosmeticanatural;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class RepresentanteVentas extends Persona {
    protected String cuitCuil;
    protected LocalDate fechaIncorporacion;
    protected List<Cliente> cartera = new ArrayList<>();
    protected List<TicketVenta> tickets = new ArrayList<>();

    public RepresentanteVentas(String nombre, String direccion, String telefono,
                               LocalDate fechaNacimiento, String cuitCuil,
                               LocalDate fechaIncorporacion) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cuitCuil = cuitCuil;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public void agregarTicket(TicketVenta t) { tickets.add(t); }
    public void agregarCliente(Cliente c) { cartera.add(c); }

    protected double totalVentasDesde(LocalDate desde) {
        double total = 0;
        for (TicketVenta t : tickets) {
            if (!t.getFecha().isBefore(desde)) {
                total += t.getPrecio();
            }
        }
        return total;
    }
    
    public abstract double calcularComision(double porcentaje, LocalDate desde);
}