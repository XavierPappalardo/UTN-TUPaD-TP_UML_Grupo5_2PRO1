package ejercicio8;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // creo tipos de avion, hangar y avion
        TipoAvion cessna = new TipoAvion("C172", 4, 1100.0);
        Hangar hangarA = new Hangar(1, 10, "Zona Norte");
        Avion avion1 = new Avion("ABC123", cessna, hangarA);

        // personas
        Piloto piloto1 = new Piloto("111", "Juan Perez", "Calle Falsa 123", "1122334455",
                "LIC001", "Solo vuelos diurnos");
        Mecanico mecanico1 = new Mecanico("222", "Ana Gomez", "Av. Siempreviva 742", "1166778899",
                150000.0, "Manana");

        // habilitaciones sobre el tipo de avion
        piloto1.autorizar(cessna);
        mecanico1.autorizarMantenimiento(cessna);

        // propietario del avion
        new Propiedad(piloto1, avion1, sdf.parse("01/03/2020")) {};

        // servicio de mantenimiento
        new Servicio(sdf.parse("15/06/2024"), 3.5, "Cambio de aceite", mecanico1, avion1);

        // intento de servicio duplicado
        try {
            new Servicio(sdf.parse("15/06/2024"), 2.0, "Cambio de aceite", mecanico1, avion1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }

        System.out.println("Avion " + avion1.getMatricula() + " guardado en hangar " + avion1.getHangar().getNumero());
        System.out.println("Servicios del avion: " + avion1.getServicios().size());
    }
}