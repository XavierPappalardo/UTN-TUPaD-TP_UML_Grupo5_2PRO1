package Entidades;

import java.util.Date;

import java.util.ArrayList;

public class Exposicion {

    //Atributos

    private String nombre;

    private Date fechaComienzo;

    private Date fechaFin;

    private ArrayList<ObjetoArte> obras = new ArrayList<>();

    //Getters

    public ArrayList<ObjetoArte> getObras() {
        return obras;
    }

    //Constructor

    public Exposicion(String nombre, Date fechaComienzo, Date fechaFin) {
        this.nombre = nombre;
        this.fechaComienzo = fechaComienzo;
        this.fechaFin = fechaFin;
    }

    //Métodos

    //Agregar obra a la exposición

    public void agregarObjeto(ObjetoArte objeto){

        obras.add(objeto);

    }

}
