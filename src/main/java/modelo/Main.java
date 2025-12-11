package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CafeEspecialidad c1 = new CafeEspecialidad();
        CafeEspecialidad c2 = new CafeEspecialidad("Colombia", 70, 300,
                BigDecimal.valueOf(15000), 8, LocalDate.of(2024,1,10));

        Bicicleta b1 = new Bicicleta();
        Bicicleta b2 = new Bicicleta("GW", "Montaña", 12.5, true, 21, LocalDate.of(2023,5,3));

        PerfilRedSocial p1 = new PerfilRedSocial();
        PerfilRedSocial p2 = new PerfilRedSocial("mariafer", 1000, 500, true,
                "Amante del café", LocalDate.of(2020,2,14));

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
