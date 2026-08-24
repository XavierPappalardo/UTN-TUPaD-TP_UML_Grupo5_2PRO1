package cosmeticanatural;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private LocalDate fechaUltimaReunion;
    private LocalDate fechaProximaReunion;
    private double porcentajeComision;
    private List<Lider> lideres = new ArrayList<>();

    public Empresa(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public void agregarLider(Lider l) { lideres.add(l); }

    public void fijarReunion(LocalDate ultima, LocalDate proxima) {
        this.fechaUltimaReunion = ultima;
        this.fechaProximaReunion = proxima;
    }

    // Liquida y muestra la comisión de toda la fuerza de ventas
    public void liquidarComisiones() {
        for (Lider l : lideres) {
            double comision = l.calcularComision(porcentajeComision, fechaUltimaReunion);
            System.out.printf("Líder %s -> comisión: $%.2f%n", l.getNombre(), comision);
        }
    }
}