package figuras.model.elipses;

import figuras.model.Figura;

public class Elipse extends Figura {
    private double radioMayor;
    private double radioMenor;

    public Elipse(double radioMayor, double radioMenor) {
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double getRadioMayor() { return radioMayor; }
    public double getRadioMenor() { return radioMenor; }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una Elipse.");
    }

    @Override
    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * (3 * (radioMayor + radioMenor) - Math.sqrt((3 * radioMayor + radioMenor) * (radioMayor + 3 * radioMenor)));
    }
}