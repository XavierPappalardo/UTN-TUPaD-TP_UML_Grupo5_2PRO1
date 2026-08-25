package Ejercicio6;

import java.util.List;
import java.util.ArrayList;

public abstract class Animal extends Especie {
    private String periodoCelo;
    private List<Especie> seAlimentaDe = new ArrayList<>();
}