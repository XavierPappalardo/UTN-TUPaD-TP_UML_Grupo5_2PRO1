package cosmeticanatural;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Producto crema = new Producto("Crema Hidratante", 1500.0);
        Producto shampoo = new Producto("Shampoo Natural", 900.0);

        Vendedor v1 = new Vendedor("Ana Pérez", "Calle 1", "1111",
                LocalDate.of(1990,1,1), "20-12345678-9", LocalDate.of(2020,3,1));

        Lider l1 = new Lider("Marta Gómez", "Calle 2", "2222",
                LocalDate.of(1985,5,5), "27-98765432-1", LocalDate.of(2018,1,1),
                LocalDate.of(2021,6,1));

        l1.agregarVendedor(v1);

        LocalDate ultimaReunion = LocalDate.of(2026, 7, 1);

        v1.agregarTicket(new TicketVenta(LocalDate.of(2026,7,10), crema, v1));
        v1.agregarTicket(new TicketVenta(LocalDate.of(2026,7,15), shampoo, v1));
        l1.agregarTicket(new TicketVenta(LocalDate.of(2026,7,12), crema, l1));

        Empresa empresa = new Empresa(10.0); // 10% de comisión
        empresa.agregarLider(l1);
        empresa.fijarReunion(ultimaReunion, LocalDate.of(2026,8,1));

        empresa.liquidarComisiones();
    }
}