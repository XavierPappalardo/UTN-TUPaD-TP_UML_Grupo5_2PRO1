package Entidades;

public abstract class Pertenencia {

    //Atributos

    private ObjetoArte objeto;

    private Coleccion coleccion;

    //Getters

    public Coleccion getColeccion() {
        return coleccion;
    }

    //Constructor

    public Pertenencia(ObjetoArte objeto, Coleccion coleccion) {
        this.objeto = objeto;
        this.coleccion = coleccion;
    }

}
