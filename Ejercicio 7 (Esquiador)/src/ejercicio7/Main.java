package ejercicio7;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // --- Federaciones y esquiadores ---
        Federacion fedAR = new Federacion("ejercicio7.Federacion Argentina de Ski", 0);

        Esquiador ana = new Esquiador("30111222", "Ana Perez", LocalDate.of(1998, 4, 12), 27);
        Esquiador luis = new Esquiador("29888777", "Luis Gomez", LocalDate.of(1995, 9, 3), 30);
        Esquiador sol = new Esquiador("31555444", "Sol Diaz", LocalDate.of(2000, 1, 20), 25);

        fedAR.federar(ana);
        fedAR.federar(luis);
        fedAR.federar(sol);

        // --- ejercicio7.Estacion y pistas ---
        Estacion lasLenas = new Estacion("EST01", "Las Leñas", "0260-4471234", "Ruta 222, Mendoza", "0260-4471234", 65.0, 0);
        fedAR.administrar(lasLenas);

        Pista pista1 = new Pista("EST01-01", "Roja", 1, 3.2);
        Pista pista2 = new Pista("EST01-02", "Negra", 2, 4.5);
        lasLenas.agregarPista(pista1);
        lasLenas.agregarPista(pista2);

        // ejercicio7.Pista compuesta por subpistas
        Pista pistaLargoRecorrido = new Pista("EST01-LR", "Negra", 3, 7.7);
        pistaLargoRecorrido.agregarSubpista(pista1);
        pistaLargoRecorrido.agregarSubpista(pista2);
        lasLenas.agregarPista(pistaLargoRecorrido);

        // ejercicio7.Equipo
        Equipo equipoAndes = new Equipo("EQ01", "Carlos Ruiz", 0);
        equipoAndes.agregarEsquiador(luis);
        equipoAndes.agregarEsquiador(sol);
        // Ana compite individualmente

        //  ejercicio7.Prueba individual (Ana)
        Prueba slalom = new Prueba("Slalom Las Leñas", "Slalom",
                new LocalDate[]{LocalDate.of(2026, 8, 20)},
                new LocalDate[]{LocalDate.of(2026, 8, 20)},
                0.0);
        slalom.agregarPistaUtilizada(pista1);

        Inscripcion inscAna = new Inscripcion("SLA-101", 65.0, 63.4, 1,
                new LocalDate[]{LocalDate.of(2026, 8, 20)});
        inscAna.setParticipante(ana);
        slalom.agregarInscripcion(inscAna);
        slalom.setVencedor(ana);
        slalom.setTiempoVencedor(63.4);

        //  ejercicio7.Prueba por equipos (ejercicio7.Equipo Andes)
        Prueba fondo = new Prueba("Fondo Las Leñas", "Fondo",
                new LocalDate[]{LocalDate.of(2026, 8, 22)},
                new LocalDate[]{LocalDate.of(2026, 8, 22)},
                0.0);
        fondo.agregarPistaUtilizada(pistaLargoRecorrido);

        Inscripcion inscEquipo = new Inscripcion("FON-201", 300.0, 295.7, 1,
                new LocalDate[]{LocalDate.of(2026, 8, 22)});
        inscEquipo.setParticipante(equipoAndes);
        fondo.agregarInscripcion(inscEquipo);
        fondo.setVencedor(equipoAndes);
        fondo.setTiempoVencedor(295.7);

        //  Resultados
        System.out.println("== ejercicio7.Federacion ==");
        System.out.println(fedAR.getNombre() + " - federados: " + fedAR.getNumFederados());
        System.out.println("Estaciones administradas: " + fedAR.getEstacionesAdministradas());

        System.out.println("\n== ejercicio7.Estacion ==");
        System.out.println(lasLenas.getNombre() + " - pistas: " + lasLenas.getCantPistas());
        System.out.println("Administrada por: " + lasLenas.getFederacionesAdministradoras());
        System.out.println("Subpistas de " + pistaLargoRecorrido.getCodigo() + ": " + pistaLargoRecorrido.getSubpistas());

        System.out.println("\n== ejercicio7.Equipo ==");
        System.out.println(equipoAndes.getCodigo() + " - esquiadores (" + equipoAndes.getCantEsquiadores() + "): " + equipoAndes.getEsquiadores());
        System.out.println("ejercicio7.Federacion de Luis: " + luis.getFederacion());
        System.out.println("ejercicio7.Equipo de Ana (debe ser null, compite individual): " + ana.getEquipo());

        System.out.println("\n== ejercicio7.Prueba individual ==");
        System.out.println(slalom.getNombre() + " - inscriptos: " + slalom.getInscripciones().size());
        System.out.println("Vencedor: " + slalom.getVencedor() + " tiempo: " + slalom.getTiempoVencedor());

        System.out.println("\n== ejercicio7.Prueba por equipos ==");
        System.out.println(fondo.getNombre() + " - inscriptos: " + fondo.getInscripciones().size());
        System.out.println("Vencedor: " + fondo.getVencedor() + " tiempo: " + fondo.getTiempoVencedor());
    }
}