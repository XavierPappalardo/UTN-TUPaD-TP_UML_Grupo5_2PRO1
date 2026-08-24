/*
  El Main crea la milanesa servida en Don Pepe y en La Parrilla (dos PlatoServido distintos),
  y verifica que a Ana le gusta la de Don Pepe pero NO la de La Parrilla.
  El modelo distingue el gusto por restaurante.
 */

public class Main {
    public static void main(String[] args) {


        Restaurante donPepe = new Restaurante("Don Pepe");
        Restaurante laParrilla = new Restaurante("La Parrilla");


        Plato milanesa = new Plato("Milanesa");


        donPepe.agregarPlato(milanesa);
        laParrilla.agregarPlato(milanesa);


        Persona ana = new Persona("Ana");

        ana.getRestaurantesFrecuentados().add(donPepe);
        ana.getRestaurantesFrecuentados().add(laParrilla);


        PlatoServido servicioPepe = new PlatoServido(ana, milanesa, donPepe, 9);
        PlatoServido servicioParrilla = new PlatoServido(ana, milanesa, laParrilla, 3);

        ana.getValoracionesPlatos().add(servicioPepe);
        ana.getValoracionesPlatos().add(servicioParrilla);

        //VERIFICACIONES
        System.out.println("Resultados de las valoraciones:\n");

        if (servicioPepe.getValoracion() >= 6) {
            System.out.println("A Ana le gusta la milanesa de Don Pepe (Nota: " + servicioPepe.getValoracion() + ")");
        }

        if (servicioParrilla.getValoracion() < 6) {
            System.out.println("A Ana NO le gusta la milanesa de La Parrilla (Nota: " + servicioParrilla.getValoracion() + ")");
        }
    }
}