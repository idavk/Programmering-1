import java.util.Scanner;

/**
 * class TestKlient
 * Tar ikke inn noen metoder for jeg har laget et menystyrt program
 * @author Ida Angell Veglo Klæstad
 * @version 1.0
 * @sinze 2020.11.08
 */
public class TestKlient {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        EiendomsRegister eiendomsRegister = new EiendomsRegister();
        int valg = 0;

        eiendomsRegister.nyEiendom(new Eiendom(1445, "Gloppen", 77, 631, "", 1017.6, "Jens Olsen"));
        eiendomsRegister.nyEiendom(new Eiendom(1445,"Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
        eiendomsRegister.nyEiendom(new Eiendom(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen"));
        eiendomsRegister.nyEiendom(new Eiendom(1445, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten"));
        eiendomsRegister.nyEiendom(new Eiendom(1445,"Gloppen", 69, 47, "Høiberg", 1339.4,"Elsa Indregård"));

        while(valg != 5){
            System.out.println("Velg en metode fra menyen under:\n" +
                    "1. Registrer ny eiendom\n" +
                    "2. Skriv ut oversikt over alle eiendommer som er registrert\n" +
                    "3. Søk etter eiendom basert på kommunenummer, gårdsnummer og bruksnummer. (Alle samtidig)\n" +
                    "4. Regn ut og vis gjennmsnitsarealet av alle eiendommer i registeret.\n" +
                    "5. Avslutt");
            valg = Integer.parseInt(scanner.nextLine());
            if(valg ==5){
                System.out.println("Programmet avsluttes");
                scanner.close();
                System.exit(0);
            }

            switch (valg){
                case 1: //Registrer ny eiendom
                    System.out.printf("Kommunenummer:\n");
                    int kommunenummer = Integer.parseInt(scanner.nextLine());

                    System.out.println("Kommunenavn:\n");
                    String kommunenavn = scanner.nextLine();

                    System.out.printf("Gårdsnummer:\n");
                    int gnr = Integer.parseInt(scanner.nextLine());

                    System.out.printf("Bruksnummer:\n");
                    int bnr = Integer.parseInt(scanner.nextLine());

                    System.out.println("Bruksnavn (Hvis eksiterende):\n");
                    String bruksnavn = scanner.nextLine();

                    System.out.printf("Areal:\n");
                    double areal = Double.parseDouble(scanner.nextLine());

                    System.out.println("Navn på eier av eiendomen:\n");
                    String navnPåEier = scanner.nextLine();

                    eiendomsRegister.nyEiendom(new Eiendom(kommunenummer, kommunenavn, gnr, bnr, bruksnavn, areal, navnPåEier));
                    break;

                case 2://Oversikt over alle eiendommer i registeret
                    System.out.println("Oversikt over alle eiendommer i registeret:");
                    System.out.println(eiendomsRegister.toString());
                    break;

                case 3:
                    System.out.println("Søk etter eiendommer basert på kommunenummer, gårdsnummer, bruksnummer:(Alle samtidig) Skriv inn id på denne måten: 1445-77/99\n");
                    String sok = scanner.nextLine();
                    System.out.println(eiendomsRegister.sokEtterEiendom(sok));
                    break;

                case 4:
                    System.out.println("Regn ut og vis oversikt over gjennomstitsarealet på eiendomer i registere");
                    System.out.println(eiendomsRegister.getGjennomsnittAreal());
                    break;

            }
        }

    }
}
