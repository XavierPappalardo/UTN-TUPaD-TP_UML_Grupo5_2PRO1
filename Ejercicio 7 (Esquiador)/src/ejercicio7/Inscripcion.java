package ejercicio7;

import java.time.LocalDate;

public class Inscripcion {
    private String codigoDorsal;
    private double tiempoPrevisto;
    private double timepoReal;
    private int posicion;
    private LocalDate[] fechaCompeticion;

    private Participante participante;
    private Prueba prueba;

    public Inscripcion(String codigoDorsal, double tiempoPrevisto, double timepoReal, int posicion, LocalDate[] fechaCompeticion) {
        this.codigoDorsal = codigoDorsal;
        this.tiempoPrevisto = tiempoPrevisto;
        this.timepoReal = timepoReal;
        this.posicion = posicion;
        this.fechaCompeticion = fechaCompeticion;
    }

    public void setCodigoDorsal(String codigoDorsal) {
        this.codigoDorsal = codigoDorsal;
    }

    public void setTimepoReal(double timepoReal) {
        this.timepoReal = timepoReal;
    }

    public void setTiempoPrevisto(double tiempoPrevisto) {
        this.tiempoPrevisto = tiempoPrevisto;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    public String getCodigoDorsal() {
        return codigoDorsal;
    }

    public double getTiempoPrevisto() {
        return tiempoPrevisto;
    }

    public double getTimepoReal() {
        return timepoReal;
    }

    public int getPosicion() {
        return posicion;
    }

    public LocalDate[] getFechaCompeticion() {
        return fechaCompeticion;
    }

    public Participante getParticipante() {
        return participante;
    }

    public Prueba getPrueba() {
        return prueba;
    }
}