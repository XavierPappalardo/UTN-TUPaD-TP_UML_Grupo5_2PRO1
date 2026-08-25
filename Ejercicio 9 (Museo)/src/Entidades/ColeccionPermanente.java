package Entidades;

import java.util.Date;

public class ColeccionPermanente extends Pertenencia {

    //Atributos

    private Date fechaAdquisicion;

    private float coste;

    private boolean enExposicion;

    //Constructor

    public ColeccionPermanente(ObjetoArte objeto, Coleccion coleccion, Date fechaAdquisicion, float coste, boolean enExposicion) {
        super(objeto, coleccion);
        this.fechaAdquisicion = fechaAdquisicion;
        this.coste = coste;
        this.enExposicion = enExposicion;
    }

}
