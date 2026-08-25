package Entidades;

import java.util.Date;

import java.util.ArrayList;

public class Artista {

    //Atributos

    private ArrayList<ObjetoArte> obras = new ArrayList<>();

    private String nombre;

    private Date fechaNacimiento;

    private Date fechaDefuncion;

    private String paisOrigen;

    private String epoca;

    private String estiloPrincipal;

    private String descripcion;

    //Getters

    public String getNombre() {
        return nombre;
    }


    //Constructor

    public Artista(String nombre, Date fechaNacimiento, Date fechaDefuncion, String paisOrigen, String epoca, String estiloPrincipal, String descripcion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.paisOrigen = paisOrigen;
        this.epoca = epoca;
        this.estiloPrincipal = estiloPrincipal;
        this.descripcion = descripcion;
    }

    //Métodos

    //Crear Objetos

    public void agregarObjeto(ObjetoArte objeto){

        this.obras.add(objeto);

    }

}
