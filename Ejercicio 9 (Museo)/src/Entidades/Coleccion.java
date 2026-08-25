package Entidades;

import java.util.ArrayList;

public class Coleccion {

    //Atributos

    private String nombre;

    private String tipo;

    private String descripcion;

    private String direccion;

    private String telefono;

    private String personaContacto;

    private ArrayList<ObjetoArte> objetos;

    private ArrayList<Pertenencia> pertenencias = new ArrayList<>();

    //Getters

    public ArrayList<Pertenencia> getPertenencias() {
        return pertenencias;
    }

    public String getNombre() {
        return nombre;
    }

    //Constructor

    public Coleccion(String nombre, String tipo, String descripcion, String direccion, String telefono, String personaContacto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaContacto = personaContacto;
    }

    //Métodos

    //Agregar pertenencia

    public void agregarPertenencia(Pertenencia pertenencia) {
        pertenencias.add(pertenencia);
    }

}
