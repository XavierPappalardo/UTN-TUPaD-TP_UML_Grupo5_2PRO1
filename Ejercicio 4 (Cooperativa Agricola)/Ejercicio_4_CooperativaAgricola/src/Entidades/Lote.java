package Entidades;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lote {
    // Atributos
    private String nombre;
    private Set<Mineral> contiene;
    private List<Cereal> historicoSiembra;

    // Constructor
    public Lote(String nombre) {
        this.nombre = nombre;
        this.contiene = new HashSet<>();
        this.historicoSiembra = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void agregarMineral(Mineral mineral) {
        this.contiene.add(mineral);
    }

    public Set<Mineral> getContiene() {
        return contiene;
    }

    public List<Cereal> getHistoricoSiembra() {
        return historicoSiembra;
    }

    // Metodos

    // Un lote es especial si posee al menos un mineral primario
    public boolean esEspecial() {
        return contiene.stream().anyMatch(Mineral::esPrimario);
    }

    // Evalua si el lote satisface los requerimientos de un cereal
    public boolean satisface(Cereal c) {
        // Validacion de minerales
        if (!contiene.containsAll(c.getRequeridos())) {
            return false;
        }

        // Regla del historial para pasturas
        if (c instanceof Pastura) {
            boolean pasturaPrevia = historicoSiembra.stream()
                    .anyMatch(x -> x instanceof Pastura);
            if (pasturaPrevia) {
                return false;
            }
        }

        return true;
    }

    // Efectua la siembra del cereal si el lote satisface las condiciones
    public boolean sembrar(Cereal c) {
        if (satisface(c)) {
            historicoSiembra.add(c);
            return true;
        }
        return false;
    }
}