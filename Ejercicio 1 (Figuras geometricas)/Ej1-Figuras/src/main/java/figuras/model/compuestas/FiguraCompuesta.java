package figuras.model.compuestas;

import figuras.model.Figura;
import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta extends Figura {
    private List<Figura> figuras;

    public FiguraCompuesta() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Figura Compuesta integrada por:");
        for (Figura f : figuras) {
            f.dibujar();
        }
    }

    @Override
    public double calcularArea() {
        double areaTotal = 0;
        for (Figura f : figuras) {
            areaTotal += f.calcularArea();
        }
        return areaTotal;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroTotal = 0;
        for (Figura f : figuras) {
            perimetroTotal += f.calcularPerimetro();
        }
        return perimetroTotal;
    }
}