package figuras;

import figuras.model.*;
import figuras.model.elipses.*;
import figuras.model.poligonos.*;
import figuras.model.compuestas.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(0, 3);

        Lado l1 = new Lado(p1, p2);
        Lado l2 = new Lado(p2, p3);
        Lado l3 = new Lado(p3, p1);

        Triangulo triangulo = new Triangulo(List.of(l1, l2, l3));
        Circulo circulo = new Circulo(5);

        FiguraCompuesta casita = new FiguraCompuesta();
        casita.agregarFigura(triangulo);
        casita.agregarFigura(circulo);

        casita.dibujar();
        System.out.println("Área total: " + casita.calcularArea());
    }
}