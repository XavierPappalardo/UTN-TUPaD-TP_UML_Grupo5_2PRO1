package Entidades;

public class Impuesto {
    // Atributos
    private String tipo;
    private float montoRecaudado;

    // Constructor
    public Impuesto(String tipo, float montoRecaudado) {
        this.tipo = tipo;
        this.montoRecaudado = montoRecaudado;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public float getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setMontoRecaudado(float montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }
}