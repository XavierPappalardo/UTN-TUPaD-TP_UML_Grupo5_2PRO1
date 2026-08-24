package ejercicio8;

import java.util.ArrayList;
import java.util.List;

class Piloto extends Persona {
    private String numLicencia;
    private String restricciones;
    private List<TipoAvion> tiposAutorizados = new ArrayList<>();

    public Piloto(String numSegSocial, String nombre, String direccion, String telefono,
                  String numLicencia, String restricciones) {
        super(numSegSocial, nombre, direccion, telefono);
        this.numLicencia = numLicencia;
        this.restricciones = restricciones;
    }

    public void autorizar(TipoAvion tipo) {
        if (!tiposAutorizados.contains(tipo)) {
            tiposAutorizados.add(tipo);
            tipo.agregarPilotoAutorizado(this);
        }
    }

    public String getNumLicencia() { return numLicencia; }
    public List<TipoAvion> getTiposAutorizados() { return tiposAutorizados; }
}