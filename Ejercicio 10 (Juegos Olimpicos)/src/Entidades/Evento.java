package Entidades;

import java.util.ArrayList;
import java.util.Date;

public class Evento {

    //Atributos

    private Date fecha;

    private int duracion;

    private int numParticipantes;

    private int numComisarios = 0;

    private ArrayList<Comisario> comisarios;

    private ArrayList<Material> materiales;

    //Getters

    public Date getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public int getNumComisarios() {
        return numComisarios;
    }


    //Constructor

    public Evento(Date fecha, int duracion, int numParticipantes) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.numParticipantes = numParticipantes;
    }

    //Métodos

    //Agregar Comisario

    public void agregarComisario(Comisario comisario){

        this.comisarios.add(comisario);

        this.numComisarios += 1;

    }

    //Agregar Material

    public void agregarMaterial(Material material){

        this.materiales.add(material);

    }

    //Lista de Materiales

    public void listaMateriales(){

        for (Material material: materiales){

            material.getNombre();

        }

    }

    //Lista Comisarios

    public void listaComisarios(){

        for (Comisario comisario: comisarios){

            comisario.getNombre();

        }

    }

}
