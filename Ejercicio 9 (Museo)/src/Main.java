import Entidades.*;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Gestión de Museos y Colecciones de Arte - Demostración\n");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Creamos Artistas

        Artista picasso = new Artista(
                "Pablo Picasso",
                sdf.parse("25/10/1881"),
                sdf.parse("08/04/1973"),
                "España",
                "Siglo XX",
                "Cubismo",
                "Pintor y escultor, cofundador del cubismo."
        );

        Artista miguelAngel = new Artista(
                "Miguel Ángel",
                sdf.parse("06/03/1475"),
                sdf.parse("18/02/1564"),
                "Italia",
                "Renacimiento",
                "Renacentista",
                "Escultor, pintor y arquitecto italiano."
        );

        //Creamos objetos de arte y los asociamos a sus artistas

        Pintura guernica = new Pintura(1, "Guernica", picasso);
        Escultura david = new Escultura(2, "David", miguelAngel);
        Otro tapiz = new Otro(3, "Tapiz misterioso", null);

        picasso.agregarObjeto(guernica);

        miguelAngel.agregarObjeto(david);

        //Creamos Colecciones

        Coleccion museoReinaSofia = new Coleccion(
                "Museo Reina Sofía",
                "Museo Público",
                "Museo nacional de arte contemporáneo",
                "Calle Santa Isabel 52, Madrid",
                "+34 91 774 1000",
                "Ana Gómez"
        );

        Coleccion galeriaUffizi = new Coleccion(
                "Galería Uffizi",
                "Museo Público",
                "Galería de arte renacentista",
                "Piazzale degli Uffizi 6, Florencia",
                "+39 055 238 8651",
                "Marco Rossi"
        );

        // Obra 1: En Colección Permanente, en exposición

        ColeccionPermanente permanenciaGuernica = new ColeccionPermanente(
                guernica, museoReinaSofia, sdf.parse("10/09/1992"), 0f, true
        );

        //Obra 2: En Préstamo temporal

        EnPrestamo prestamoDavid = new EnPrestamo(
                david, museoReinaSofia, sdf.parse("01/06/2026"), sdf.parse("01/12/2026")
        );

        //Obra 3: En Colección Permanente, sin exponerse actualmente

        ColeccionPermanente permanenciaTapiz = new ColeccionPermanente(
                tapiz, galeriaUffizi, sdf.parse("15/03/1750"), 1500f, false
        );

        museoReinaSofia.agregarPertenencia(permanenciaGuernica);
        museoReinaSofia.agregarPertenencia(prestamoDavid);
        galeriaUffizi.agregarPertenencia(permanenciaTapiz);

        //Creamos una Exposicion temporal con obras de ambas colecciones

        Exposicion muestraTemporal = new Exposicion(
                "Maestros del Arte Universal",
                sdf.parse("01/07/2026"),
                sdf.parse("30/09/2026")
        );

        muestraTemporal.agregarObjeto(guernica);
        muestraTemporal.agregarObjeto(david);
        muestraTemporal.agregarObjeto(tapiz);

        //Ejecutamos Pruebas

        System.out.println("--- Artistas registrados ---");

        System.out.println("(Cada artista debe listar la cantidad de obras que se le agregaron):");

        for (Artista artista : new Artista[]{picasso, miguelAngel}) {
            System.out.println("- " + artista.getNombre());
        }

        //'tapiz' no fue agregado a ningun artista, por eso no suma obras a nadie.

        System.out.println("\n--- Pertenencias de " + museoReinaSofia.getNombre() + " ---");

        System.out.println("(Debe reportar la obra 'Guernica' en Colección Permanente y 'David' En Préstamo):");

        for (Pertenencia pertenencia : museoReinaSofia.getPertenencias()) {
            System.out.println("- [" + pertenencia.getClass().getSimpleName() + "] " + pertenencia.getColeccion().getNombre());
        }

        System.out.println("\n--- Pertenencias de " + galeriaUffizi.getNombre() + " ---");
        System.out.println("(Debe reportar el 'Tapiz misterioso' en Coleccion Permanente, sin exponerse):");
        for (Pertenencia pertenencia : galeriaUffizi.getPertenencias()) {
            System.out.println("- [" + pertenencia.getClass().getSimpleName() + "] " + pertenencia);
        }

        System.out.println("\n--- Obras en la Exposicion '" + muestraTemporal.getObras().size() + "' obras ---");
        System.out.println("(Debe listar las 3 obras agregadas, sin importar de que colección provienen):");
        for (ObjetoArte obra : muestraTemporal.getObras()) {
            System.out.println("- " + obra.getTitulo());
        }

    }

}

