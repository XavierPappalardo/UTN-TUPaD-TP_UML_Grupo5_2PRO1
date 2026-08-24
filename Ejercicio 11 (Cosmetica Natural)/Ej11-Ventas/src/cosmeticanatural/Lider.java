package cosmeticanatural;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lider extends Vendedor {
    private LocalDate fechaPromocion;
    private List<Vendedor> equipo = new ArrayList<>();

    public Lider(String nombre, String direccion, String telefono,
                 LocalDate fechaNacimiento, String cuitCuil,
                 LocalDate fechaIncorporacion, LocalDate fechaPromocion) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIncorporacion);
        this.fechaPromocion = fechaPromocion;
    }

    public void agregarVendedor(Vendedor v) { equipo.add(v); }

    @Override
    public double calcularComision(double porcentaje, LocalDate desde) {
        double comisionPropia = super.calcularComision(porcentaje, desde); // como vendedor
        double comisionEquipo = 0;
        for (Vendedor v : equipo) {
            comisionEquipo += v.calcularComision(porcentaje, desde);
        }
        return comisionPropia + comisionEquipo;
    }
}