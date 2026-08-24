package ejercicio7;

import java.util.ArrayList;

public class Equipo extends Participante {
    private String codigo;
    private String entrenador;
    private int cantEsquiadores;

    private ArrayList<Esquiador> esquiadores;

    public Equipo(String codigo, String entrenador, int cantEsquiadores) {
        this.codigo = codigo;
        this.entrenador = entrenador;
        this.cantEsquiadores = cantEsquiadores;
        this.esquiadores = new ArrayList<>();
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public void setCantEsquiadores(int cantEsquiadores) {
        this.cantEsquiadores = cantEsquiadores;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public int getCantEsquiadores() {
        return cantEsquiadores;
    }

    public ArrayList<Esquiador> getEsquiadores() {
        return esquiadores;
    }

    public void agregarEsquiador(Esquiador e) {
        e.asignarEquipo(this);
        this.esquiadores.add(e);
        this.cantEsquiadores = this.esquiadores.size();
    }

    @Override
    public String toString() {
        return "ejercicio7.Equipo " + codigo;
    }
}