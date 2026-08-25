package Entidades;

public class ComplejoMonodeportivo extends ComplejoDeportivo{

    //Atributos

    private String deporte;

    //Constructor

    public ComplejoMonodeportivo(String localizacion, String jefeOrganizacion, float areaOcupada, String deporte) {
        super(localizacion, jefeOrganizacion, areaOcupada);
        this.deporte = deporte;
    }

    //Getters

    public String getDeporte() {
        return deporte;
    }

}
