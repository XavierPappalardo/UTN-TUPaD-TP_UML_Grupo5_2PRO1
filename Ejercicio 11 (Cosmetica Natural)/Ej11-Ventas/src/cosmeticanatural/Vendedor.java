package cosmeticanatural;

import java.time.LocalDate;

public class Vendedor extends RepresentanteVentas {

    public Vendedor(String nombre, String direccion, String telefono,
                    LocalDate fechaNacimiento, String cuitCuil,
                    LocalDate fechaIncorporacion) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIncorporacion);
    }

    @Override
    public double calcularComision(double porcentaje, LocalDate desde) {
        return totalVentasDesde(desde) * (porcentaje / 100.0);
    }
}