package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Estacion {
    private String codigo;
    private String nombre;
    private String contactos;
    private String direccion;
    private String telefono;
    private double kmEsquiables;
    private int cantPistas;

    private List<Pista> pistas;
    private List<Federacion> federacionesAdministradoras;

    public Estacion(String codigo, String nombre, String contactos, String direccion, String telefono, double kmEsquiables, int cantPistas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.contactos = contactos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.kmEsquiables = kmEsquiables;
        this.cantPistas = cantPistas;
        this.pistas = new ArrayList<>();
        this.federacionesAdministradoras = new ArrayList<>();
    }

    public void setContactos(String contactos) {
        this.contactos = contactos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setKmEsquiables(double kmEsquiables) {
        this.kmEsquiables = kmEsquiables;
    }

    public void setCantPistas(int cantPistas) {
        this.cantPistas = cantPistas;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContactos() {
        return contactos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getKmEsquiables() {
        return kmEsquiables;
    }

    public int getCantPistas() {
        return cantPistas;
    }

    public List<Pista> getPistas() {
        return pistas;
    }


    public void agregarPista(Pista p) {
        p.asignarEstacion(this);
        this.pistas.add(p);
        this.cantPistas = this.pistas.size();
    }

    void agregarFederacionAdministradora(Federacion f) {
        this.federacionesAdministradoras.add(f);
    }

    public List<Federacion> getFederacionesAdministradoras() {
        return federacionesAdministradoras;
    }

    @Override
    public String toString() {
        return nombre;
    }
}