package figuras.model;

public class Lado {
    private Punto inicio;
    private Punto fin;

    public Lado(Punto inicio, Punto fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public Punto getInicio() { return inicio; }
    public Punto getFin() { return fin; }

    public double getLongitud() {
        return inicio.distanciaA(fin);
    }
}