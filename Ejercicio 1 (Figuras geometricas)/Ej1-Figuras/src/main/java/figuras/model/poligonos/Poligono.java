package figuras.model.poligonos;

import figuras.model.Figura;
import figuras.model.Lado;
import java.util.List;

public abstract class Poligono extends Figura {
    private List<Lado> lados;

    public Poligono(List<Lado> lados) {
        this.lados = lados;
    }

    public int getNumeroDeLados() {
        return lados.size();
    }

    public List<Lado> getLados() {
        return lados;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        for (Lado lado : lados) {
            perimetro += lado.getLongitud();
        }
        return perimetro;
    }
}