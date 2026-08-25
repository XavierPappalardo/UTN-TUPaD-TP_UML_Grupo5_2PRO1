package Ejercicio6;

import java.util.List;
import java.util.ArrayList;

public class Entrada {
    private int numero;
    private Parque parque;
    private List<RolCelador> celadores = new ArrayList<>();

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public Parque getParque() { return parque; }
    public void setParque(Parque parque) { this.parque = parque; }

    public List<RolCelador> getCeladores() { return celadores; }
}