import Entidades.*;
import Enums.TipoMineral;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4 (Agricultura / Lotes y Cereales) - Demostracion\n");

        // Creamos Minerales
        Mineral nitrogeno = new Mineral("Nitrogeno", TipoMineral.PRIMARIO);
        Mineral fosforo = new Mineral("Fosforo", TipoMineral.PRIMARIO);
        Mineral potasio = new Mineral("Potasio", TipoMineral.SECUNDARIO);

        // Creamos Cereales
        Cereal maiz = new CosechaGruesa("Maiz");
        maiz.agregarMineralRequerido(nitrogeno);
        maiz.agregarMineralRequerido(potasio);

        Cereal trigo = new CosechaFina("Trigo");
        trigo.agregarMineralRequerido(potasio);

        Cereal alfalfa = new Pastura("Alfalfa");
        alfalfa.agregarMineralRequerido(potasio);

        Cereal trebol = new Pastura("Trebol Subterraneo");
        trebol.agregarMineralRequerido(potasio);

        // Creamos Lote inicialmente comun (Solo minerales secundarios)
        Lote loteNorte = new Lote("Lote Norte");
        loteNorte.agregarMineral(potasio);

        System.out.println("--- Clasificacion Derivada del Lote ---");
        System.out.println("¿Lote Norte es Especial?: " + loteNorte.esEspecial());

        // Añadimos un mineral primario:
        loteNorte.agregarMineral(nitrogeno);
        System.out.println("Luego de agregar Nitrógeno -> ¿Es Especial?: " + loteNorte.esEspecial());

        // Probamos Requerimientos de Minerales
        System.out.println("\n--- Verificacion de Requerimientos de Minerales ---");
        System.out.println("¿Lote Norte satisface Maiz (Requiere Nitrógeno y Potasio)?: " + loteNorte.satisface(maiz));
        System.out.println("¿Lote Norte satisface Trigo (Requiere Potasio)?: " + loteNorte.satisface(trigo));

        // Probamos la regla de Pastura Previa
        System.out.println("\n--- Regla del Historial de Pasturas ---");
        System.out.println("¿Lote Norte satisface Alfalfa (Pastura)?: " + loteNorte.satisface(alfalfa));

        System.out.println("Sembrando Alfalfa...");
        boolean siembraExitosa1 = loteNorte.sembrar(alfalfa);
        System.out.println("¿Siembra de Alfalfa exitosa?: " + siembraExitosa1);

        System.out.println("¿Lote Norte satisface Trébol Subterráneo (Otra Pastura)?: " + loteNorte.satisface(trebol));
        boolean siembraExitosa2 = loteNorte.sembrar(trebol);
        System.out.println("¿Siembra de Trébol exitosa?: " + siembraExitosa2);

        System.out.println("¿Lote Norte satisface Trigo (Cosecha Fina) luego de la pastura?: " + loteNorte.satisface(trigo));
    }
}