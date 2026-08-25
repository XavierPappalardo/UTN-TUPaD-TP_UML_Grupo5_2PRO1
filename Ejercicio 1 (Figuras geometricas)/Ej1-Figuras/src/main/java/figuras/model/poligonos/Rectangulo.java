package figuras.model.poligonos;

import figuras.model.Lado;
import java.util.List;

public class Rectangulo extends Cuadrilatero {
    public Rectangulo(List<Lado> lados) {
        super(lados);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Rectángulo.");
    }

    @Override
    public double calcularArea() {
        double base = getLados().get(0).getLongitud();
        double altura = getLados().get(1).getLongitud();
        return base * altura;
    }
}