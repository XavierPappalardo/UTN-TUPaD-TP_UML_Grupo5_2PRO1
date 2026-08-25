package Entidades;

import java.util.ArrayList;

public class SedeOlimpica {

    //Atributos

    private int numComplejos = 0;

    private float presupuestoAproximado;

    private ArrayList<ComplejoDeportivo> complejos;

    //Getters

    public ArrayList<ComplejoDeportivo> getComplejos() {
        return complejos;
    }

    //Constructor

    public SedeOlimpica(float presupuestoAproximado) {
        this.presupuestoAproximado = presupuestoAproximado;
    }

    //Métodos

    //Agregar Complejo

    public void agregarComplejo(ComplejoDeportivo complejo){

        complejos.add(complejo);

        this.numComplejos += 1;

    }

}
