package Ejercicio6;

import java.util.List;
import java.util.ArrayList;

public class RolInvestigador {
    private Personal personal;
    private String titulacion;
    private List<Investigacion> investigaciones = new ArrayList<>();

    public Personal getPersonal() { return personal; }
    public void setPersonal(Personal personal) { this.personal = personal; }

    public String getTitulacion() { return titulacion; }
    public void setTitulacion(String titulacion) { this.titulacion = titulacion; }

    public List<Investigacion> getInvestigaciones() { return investigaciones; }
}