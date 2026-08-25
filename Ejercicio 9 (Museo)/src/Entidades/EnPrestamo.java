package Entidades;

import java.util.Date;

public class EnPrestamo extends Pertenencia {

    //Atributos

    private Date fechaRecepcion;

    private Date fechaDevolucion;

    //Constructor

    public EnPrestamo(ObjetoArte objeto, Coleccion coleccion, Date fechaRecepcion, Date fechaDevolucion) {
        super(objeto, coleccion);
        this.fechaRecepcion = fechaRecepcion;
        this.fechaDevolucion = fechaDevolucion;
    }

}
