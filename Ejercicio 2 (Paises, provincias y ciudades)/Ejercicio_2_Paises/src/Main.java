import Entidades.*;

public class Main {
    static void main(String[] args) {
        System.out.println("Ejercicio 2 (Continentes, Paises, Provincias, Ciudades) - Demostracion");

        // Creamos un continente
        Continente america = new Continente("America del Sur");

        // Creamos paises
        Pais argentina = new Pais("Argentina");
        Pais uruguay = new Pais("Uruguay");

        america.agregarPais(argentina);
        america.agregarPais(uruguay);

        // Creamos provincias y ciudades
        Provincia buenosAires = new Provincia("Buenos Aires");
        Ciudad buenosairesCap = new Ciudad("La Plata");
        Ciudad laMatanza = new Ciudad("La Matanza");
        buenosAires.agregarCiudad(buenosairesCap);
        buenosAires.agregarCiudad(laMatanza);

        Provincia cordoba = new Provincia("Cordoba");
        Ciudad cordobaCap = new Ciudad("Cordoba Capital");
        cordoba.agregarCiudad(cordobaCap);

        Provincia rioNegro = new Provincia("Rio Negro");
        Ciudad rionegroCap = new Ciudad("Capital Rio Negro");
        rioNegro.agregarCiudad(rionegroCap);

        argentina.agregarProvincia(buenosAires);
        argentina.agregarProvincia(cordoba);
        uruguay.agregarProvincia(rioNegro);

        // Probar Capitales
        System.out.println("--- Asignamos Capitales ---");
        buenosAires.setCapital(buenosairesCap);
        argentina.setCapital(buenosairesCap);
        System.out.println("Capital de Buenos Aires: " + buenosAires.getCapital());
        System.out.println("Capital de Argentina: " + argentina.getCapital());

        try {
            buenosAires.setCapital(cordobaCap); // Debe fallar
        } catch (IllegalArgumentException e) {
            System.out.println("Validación OK (Capital no pertenece a provincia): " + e.getMessage());
        }
    }
}
