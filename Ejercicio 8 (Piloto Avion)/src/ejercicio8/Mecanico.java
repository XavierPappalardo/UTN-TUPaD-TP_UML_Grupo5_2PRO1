package ejercicio8;

import java.util.ArrayList;
import java.util.List;

class Mecanico extends Persona {
    private double salario;
    private String turno;
    private List<TipoAvion> tiposMantenimiento = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();

    public Mecanico(String numSegSocial, String nombre, String direccion, String telefono,
                    double salario, String turno) {
        super(numSegSocial, nombre, direccion, telefono);
        this.salario = salario;
        this.turno = turno;
    }

    public void autorizarMantenimiento(TipoAvion tipo) {
        if (!tiposMantenimiento.contains(tipo)) {
            tiposMantenimiento.add(tipo);
            tipo.agregarMecanicoAutorizado(this);
        }
    }

    void agregarServicio(Servicio s) { servicios.add(s); }

    public double getSalario() { return salario; }
    public List<Servicio> getServicios() { return servicios; }
}