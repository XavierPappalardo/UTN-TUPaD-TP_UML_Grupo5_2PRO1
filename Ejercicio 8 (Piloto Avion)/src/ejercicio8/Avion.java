package ejercicio8;
import java.util.ArrayList;
import java.util.List;

class Avion {
    private String matricula;
    private TipoAvion tipo;
    private Hangar hangar;
    private List<Propiedad> propiedades = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();

    public Avion(String matricula, TipoAvion tipo, Hangar hangar) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.hangar = hangar;
        tipo.agregarAvion(this);
        hangar.agregarAvion(this);
    }

    void agregarPropiedad(Propiedad p) { propiedades.add(p); }

    void agregarServicio(Servicio s) {
        for (Servicio existente : servicios) {
            if (existente.getFecha().equals(s.getFecha())
                    && existente.getTipoTrabajo().equals(s.getTipoTrabajo())) {
                throw new IllegalArgumentException(
                        "Ya existe un servicio para " + matricula + " en esa fecha con ese tipo de trabajo");
            }
        }
        servicios.add(s);
    }

    public String getMatricula() { return matricula; }
    public TipoAvion getTipo() { return tipo; }
    public Hangar getHangar() { return hangar; }
    public List<Propiedad> getPropiedades() { return propiedades; }
    public List<Servicio> getServicios() { return servicios; }
}