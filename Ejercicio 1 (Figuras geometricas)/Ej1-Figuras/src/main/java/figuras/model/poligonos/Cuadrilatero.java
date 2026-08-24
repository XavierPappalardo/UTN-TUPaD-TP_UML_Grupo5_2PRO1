package figuras.model.poligonos;

import figuras.model.Lado;
import java.util.List;

public class Cuadrilatero extends Poligono {
    public Cuadrilatero(List<Lado> lados) {
        super(lados);
        if (lados.size() != 4) {
            throw new IllegalArgumentException("Un cuadrilátero debe tener exactamente 4 lados.");
        }
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Cuadrilátero.");
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}