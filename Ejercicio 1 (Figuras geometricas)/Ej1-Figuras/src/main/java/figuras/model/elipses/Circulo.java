package figuras.model.elipses;

public class Circulo extends Elipse {
    public Circulo(double radio) {
        super(radio, radio);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Círculo.");
    }

    @Override
    public double calcularArea() {
        return Math.PI * getRadioMayor() * getRadioMayor();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * getRadioMayor();
    }
}