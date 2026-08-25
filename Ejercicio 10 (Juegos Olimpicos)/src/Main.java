import java.text.SimpleDateFormat;

import Entidades.*;

public class Main {

    public static void main (String[] args){

        System.out.println("Gestion de Sedes Olimpicas - Demostracion\n");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Creamos una Sede Olimpica con su presupuesto aproximado

        SedeOlimpica sedeParis = new SedeOlimpica(4_500_000_000f);

        //Creamos un Polideportivo (varios deportes bajo un mismo complejo)

        Polideportivo polideportivoCentral = new Polideportivo(
                "Zona Norte", "Laura Fernandez", 25_000f
        );

        polideportivoCentral.agregarArea(new Area("Habilitada", "Natacion"));
        polideportivoCentral.agregarArea(new Area("Habilitada", "Gimnasia Artistica"));
        polideportivoCentral.agregarArea(new Area("En construccion", "Esgrima"));

        //Creamos dos Complejos Monodeportivos (un solo deporte cada uno)

        ComplejoMonodeportivo estadioAtletismo = new ComplejoMonodeportivo(
                "Zona Sur", "Carlos Ibañez", 18_500f, "Atletismo"
        );

        estadioAtletismo.agregarArea(new Area("Habilitada", "Atletismo"));

        ComplejoMonodeportivo velodromo = new ComplejoMonodeportivo(
                "Zona Este", "Marina Solis", 9_200f, "Ciclismo"
        );
        velodromo.agregarArea(new Area("Habilitada", "Ciclismo en Pista"));

        //Agregamos los 3 complejos a la Sede Olimpica

        sedeParis.agregarComplejo(polideportivoCentral);
        sedeParis.agregarComplejo(estadioAtletismo);
        sedeParis.agregarComplejo(velodromo);

        //Creamos Comisarios y Materiales

        Comisario comisario1 = new Comisario("Jorge Peralta");
        Comisario comisario2 = new Comisario("Sofia Ramirez");
        Comisario comisario3 = new Comisario("Diego Molina");

        Material material1 = new Material("Cronometro oficial");
        Material material2 = new Material("Vallas reglamentarias");
        Material material3 = new Material("Sistema de sonido");

        //Creamos un Evento y le agregamos comisarios y materiales

        Evento finalAtletismo = new Evento(sdf.parse("15/08/2026"), 3, 12_000);
        finalAtletismo.agregarComisario(comisario1);
        finalAtletismo.agregarComisario(comisario2);
        finalAtletismo.agregarComisario(comisario3);
        finalAtletismo.agregarMaterial(material1);
        finalAtletismo.agregarMaterial(material2);
        finalAtletismo.agregarMaterial(material3);

        // Ejecutamos Pruebas

        System.out.println("--- Complejos de la Sede Olimpica ---");
        System.out.println("(Debe listar los 3 complejos agregados, cada uno con su cantidad de areas):");
        for (ComplejoDeportivo c : sedeParis.getComplejos()) {
            System.out.println("- " + c);
        }
        System.out.println(sedeParis);
        // La sede acumula numComplejos = 3 tras las 3 llamadas a agregarComplejo().

        System.out.println("\n--- Areas del Polideportivo Central ---");
        System.out.println("(Debe listar 3 areas: Natacion, Gimnasia Artistica y Esgrima):");
        for (Area a : polideportivoCentral.getAreas()) {
            System.out.println("- " + a);
        }

        System.out.println("\n--- Celebrando el evento en el Estadio de Atletismo ---");
        System.out.println("(celebrarEvento imprime fecha, duracion, participantes y comisarios):");
        estadioAtletismo.celebrarEvento(finalAtletismo);

        System.out.println("\n--- Comisarios asignados al evento ---");
        finalAtletismo.listaComisarios();
        // Deben listarse los 3 comisarios agregados anteriormente.

        System.out.println("\n--- Materiales asignados al evento ---");
        finalAtletismo.listaMateriales();
        // Deben listarse los 3 materiales agregados anteriormente.

        System.out.println("\n--- Resumen del evento ---");
        System.out.println(finalAtletismo);
        // numComisarios se actualiza en cada llamada a agregarComisario(), no depende del tamaño de la lista.

    }

}
