package figuras.model.poligonos;

import figuras.model.Lado;
import java.util.List;

public class Triangulo extends Poligono {
    public Triangulo(List<Lado> lados) {
        super(lados);
        if (lados.size() != 3) {
            throw new IllegalArgumentException("Un triángulo debe tener exactamente 3 lados.");
        }
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Triángulo.");
    }

    @Override
    public double calcularArea() {
        double a = getLados().get(0).getLongitud();
        double b = getLados().get(1).getLongitud();
        double c = getLados().get(2).getLongitud();
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}