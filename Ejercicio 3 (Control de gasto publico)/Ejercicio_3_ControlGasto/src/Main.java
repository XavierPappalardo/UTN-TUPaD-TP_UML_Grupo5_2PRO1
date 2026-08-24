import Entidades.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3 (Control de Gasto Publico) - Demostracion\n");

        // Creamos País y Provincias
        Pais argentina = new Pais("Argentina");
        Provincia buenosAires = new Provincia("Buenos Aires");
        Provincia cordoba = new Provincia("Cordoba");

        argentina.agregarProvincia(buenosAires);
        argentina.agregarProvincia(cordoba);

        // Creamos Ciudades e Impuestos para Buenos Aires
        // Ciudad A: Controlada (>100k hab) y EN DEFICIT
        Ciudad laPlata = new Ciudad("La Plata", 150_000, 800_000f);
        laPlata.agregarImpuesto(new Impuesto("imp1", 200_000f));
        laPlata.agregarImpuesto(new Impuesto("imp2", 150_000f));

        // Ciudad B: NO Controlada (<100k hab) pero EN DEFICIT
        Ciudad tandil = new Ciudad("Tandil", 80_000, 500_000f);
        tandil.agregarImpuesto(new Impuesto("imp1", 100_000f));

        buenosAires.agregarCiudad(laPlata);
        buenosAires.agregarCiudad(tandil);

        // Creamos Ciudades e Impuestos para Cordoba
        // Ciudad C: Controlada y Sin deficit
        Ciudad cordobaCap = new Ciudad("Cordoba Capital", 200_000, 300_000f);
        cordobaCap.agregarImpuesto(new Impuesto("imp1", 250_000f));
        cordobaCap.agregarImpuesto(new Impuesto("imp2", 200_000f));

        cordoba.agregarCiudad(cordobaCap);

        // Ejecutamos Pruebas
        System.out.println("--- Ciudades Deficitarias del Pais ---");
        System.out.println("(Debe reportar solo ciudades >100.000 hab y en deficit):");
        for (Ciudad c : argentina.ciudadesDeficitarias()) {
            System.out.println("- " + c);
        }
        // 'Tandil' está en deficit, pero no entra porque tiene 80.000 hab.

        System.out.println("\n--- Provincias en Riesgo ---");
        System.out.println("(Provincias con mas de la mitad de sus ciudades en deficit):");
        for (Provincia p : argentina.provinciasEnRiesgo()) {
            System.out.println("- " + p.getNombre() + " (¿Mas de la mitad en deficit?: " + p.mitadCiudadesEnDeficit() + ")");
        }
        // Buenos Aires tiene 2 ciudades y las 2 están en deficit, por ende esta en riesgo.
    }
}
