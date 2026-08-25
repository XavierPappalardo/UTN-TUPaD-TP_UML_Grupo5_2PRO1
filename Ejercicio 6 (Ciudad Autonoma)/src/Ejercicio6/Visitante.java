package Ejercicio6;

import java.util.List;
import java.util.ArrayList;

public class Visitante {
    private String dni;
    private String nombre;
    private String direccion;
    private String profesion;

    private List<Excursion> excursionesInscritas = new ArrayList<>();
    private List<Estancia> estancias = new ArrayList<>();
}