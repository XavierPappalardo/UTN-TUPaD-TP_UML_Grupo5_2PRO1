package Entidades;

import java.util.ArrayList;

public abstract class ComplejoDeportivo {

    //Atributos

    protected String localizacion;

    protected String jefeOrganizacion;

    protected float areaOcupada;

    protected ArrayList<Area> areas;

    //Getters

    public String getLocalizacion() {
        return localizacion;
    }

    public String getJefeOrganizacion() {
        return jefeOrganizacion;
    }

    public float getAreaOcupada() {
        return areaOcupada;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    //Constructor

    public ComplejoDeportivo(String localizacion, String jefeOrganizacion, float areaOcupada) {
        this.localizacion = localizacion;
        this.jefeOrganizacion = jefeOrganizacion;
        this.areaOcupada = areaOcupada;
    }

    //Métodos

    //Celebrar eventos

    public void celebrarEvento(Evento evento){

        System.out.println("¡Celebramos un evento!\nDetalles del evento:");

        System.out.println("Fecha: " + evento.getFecha() + "\nDuración: " + evento.getDuracion() + "\nNúmero de participantes: " + evento.getNumParticipantes() + "\nNúmero de comisarios: " + evento.getNumComisarios());

    }

    //Agregar áreas

    public void agregarArea(Area area){

        areas.add(area);

    }

}
