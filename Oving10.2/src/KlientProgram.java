import java.util.ArrayList;
import java.util.Scanner;

public class KlientProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valg = 0;

        MenyRegister menyReg = new MenyRegister();
        ArrayList<Rett> meny1 = new ArrayList<>();

        menyReg.nyRett(new Rett("Is", "Dessert", 45.70, "is, bær"));
        menyReg.nyRett(new Rett("Fiskeboller", "Hovedrett", 37.50,"Fisk, melk, smør"));
        menyReg.nyRett(new Rett("Tomatsuppe", "Forrett", 68.50, "Tomat, melk, makaroni"));



        while(valg != 6){
            System.out.println("Velg en metode fra menyen:\n" +
                    "1. Registrer en ny rett.\n" +
                    "2. Finn en rett, ved å skrive inn navnet.\n" +
                    "3. Finn alle retter av en gitt type.\n" +
                    "4. Registrer en ny meny som består av ett sett med retter.\n" +
                    "5. Finn alle menyer med totalpris innenfor et gitt intervall.\n" +
                    "6. Avslutt programmet.");
            valg = scanner.nextInt();

            if(valg == 6){
                System.out.println("Programmet avslutter");
                scanner.close();
                System.exit(0);

            }
            switch (valg){
                case 1: //Registrere en ny rett
                    System.out.println("Rett");
                    String rett = scanner.nextLine();
                    System.out.println("Type:");
                    String type = scanner.nextLine();
                    System.out.println("Pris");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Oppskrift");
                    String oppskrift = scanner.nextLine();
                    menyReg.nyRett((new Rett(rett, type, price, oppskrift)));
                    break;

                case 2: //Finne en rett, ved navn
                    System.out.println("Hvilken rett vil du sjekke?");
                    String finnRett = scanner.next() + scanner.nextLine();
                    System.out.println(menyReg.rettGittNavn(finnRett).toString());
                    break;

                case 3: //Finne alle retter av en gitt type
                    System.out.println("Hvilken type vil du sjekke?");
                    String finnType = scanner.next().trim();
                    System.out.println(menyReg.toString(menyReg.rettGittType(finnType)));
                    break;

                case 4: // Registrere en ny meny ved ett sett ved retter.
                    ArrayList<Rett> meny2 = new ArrayList<>();
                    System.out.println("Hva vil du kalle menyen?");
                    menyReg.nyMenyMedRetter(scanner.next() + scanner.nextLine(), meny2);
                    System.out.println("Hvor mange retter vil du ha på menyen?");
                    int antallRetter = scanner.nextInt();
                    System.out.println(menyReg.toString2());
                    System.out.println("Hvilke av rettene vil du ha med på menyen?");

                    for(int i = 0; i < antallRetter; i++){
                        meny2.add(menyReg.rettGittNummer(scanner.nextInt()));
                    }

                    System.out.println(menyReg.toString());
                    break;

                case 5: //Finne alle menyer med en totalpris innenfor et gitt prisintervall.
                    System.out.println("Skriv inn ønsket prisintervall:\n");
                    double pris1 = scanner.nextDouble();
                    double pris2 = scanner.nextDouble();
                    System.out.println(menyReg.prisintervall(pris1, pris2).toString());
                    break;

            }
        }
    }
}
