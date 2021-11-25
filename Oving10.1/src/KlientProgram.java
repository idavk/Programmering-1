import java.util.ArrayList;
import java.util.Scanner;

public class KlientProgram {


        public static void main(String[] args){
            ArrangementRegister arrangementer = new ArrangementRegister();
            Scanner scanner = new Scanner(System.in);
            int valg = 0;
            arrangementer.nyttArrangement(new Arrangement(1,"En dag","Oslo","Det nye","teater",202010292000L));
            arrangementer.nyttArrangement(new Arrangement(2,"Stavernfestivalen","Stavern","Stavernfestivalen AS","Musikkfestival",202010301800L));

            while(valg != 6){
                System.out.println("Velg hva du ønsker å gjøre fra menyen under:\n" +
                        "1. Registrer nytt arrangement:\n" +
                        "2. Finn alle arrangementene på et sted:\n" +
                        "3. Finn antall arangement på en bestemt dato:\n" +
                        "4. Finn alle arrangementene innenfor et tidsintervall gitt ved to datoer:\n" +
                        "5. Få ut en liste på alle arrangementer:\n" +
                        "6. Avslutt programmet\n");

                valg = Integer.parseInt(scanner.nextLine());

                switch (valg){
                    case 1: //Registrer nytt arrangement
                        System.out.printf("Nummer:\n");
                        int nummer = Integer.parseInt(scanner.nextLine());

                        System.out.println("Navn: ");
                        String ArrangementNavn = scanner.nextLine();

                        System.out.println("Sted: ");
                        String sted = scanner.nextLine();

                        System.out.println("Arrangør: ");
                        String arrangør = scanner.nextLine();

                        System.out.println("Type: ");
                        String type = scanner.nextLine();

                        System.out.println("Tidspunkt: ÅrMånedDatoKlokkeslett ");
                        long tidspunkt = Long.parseLong(scanner.nextLine());

                        if(arrangementer.nyttArrangement(new Arrangement(nummer, ArrangementNavn, sted, arrangør, type, tidspunkt)) == true){
                            System.out.println("\nNytt arrangement lagt til.\n");
                        } else{
                            System.out.println("\nPrøv et annet nummer\n");
                        }
                        break;

                    case 2: //Finn alle arrangementer på et gitt sted
                        System.out.println("Hvilket sted vil du sjekke arrangementer for?\n");
                        String finnSted = scanner.nextLine();
                        System.out.println(arrangementer.arrangementPåEtSted(finnSted));
                        break;

                    case 3: //Finn alle arrangementer på et gitt sted
                        long finnDato = Long.parseLong(scanner.nextLine());
                        System.out.println(arrangementer.arrangementerSammeDato(finnDato).toString());
                        break;

                    case 4: //Finn alle arrangementer innenfor et bestemt tidsintervall mellom to datoer
                        System.out.println("Fra dato: ");
                        long dato1 = Long.parseLong(scanner.nextLine());
                        System.out.println("Til dato: ");
                        long dato2 = Long.parseLong(scanner.nextLine());
                        System.out.println(arrangementer.argTidsintervall(dato1,dato2));
                        break;

                    case 5: //Få liste over alle arrangementer
                        System.out.println("Hvordan ønsker du å sortere listen:\n" +
                                "1. Sted\n" +
                                "2. Type\n" +
                                "3. Dato\n");
                        int valg2 = Integer.parseInt(scanner.nextLine());
                        if(valg2 == 1){
                            System.out.println(arrangementer.sorterSted());
                        } else if(valg2 == 2){
                            System.out.println(arrangementer.sorterType());
                        } else{
                            System.out.println(arrangementer.sorterTid());
                        }
                        break;
                }
            }
        }
}
