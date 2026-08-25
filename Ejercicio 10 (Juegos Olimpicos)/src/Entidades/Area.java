package Entidades;

public class Area {

    //Atributos

    private String situacion;

    private String deporte;

    //Getters

    public String getSituacion() {
        return situacion;
    }

    public String getDeporte() {
        return deporte;
    }

    //Constructor

    public Area(String situacion, String deporte) {
        this.situacion = situacion;
        this.deporte = deporte;
    }

}
