import java.sql.SQLOutput;
import java.util.Scanner;

public class KlientProgram {

    public static void main(String[] args){
        ArrangementRegister arrangementer = new ArrangementRegister();
        Scanner scanner = new Scanner(System.in);
        int valg = 0;

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
                    System.out.println("Navn:");
                    String navn = scanner.nextLine();
                    System.out.println("Sted:");
                    String sted = scanner.nextLine();
                    System.out.println("Arrangør:");
                    String arrangør = scanner.nextLine();
                    System.out.println("Type:");
                    String type = scanner.nextLine();
                    System.out.println("Tidspunkt: ÅrMånedDatoKlokkeslett");
                    Long tidspunkt = Long.parseLong(scanner.nextLine());
                    if(arrangementer.nyttArrangement(new Arrangement(nummer, navn, sted, arrangør, type, tidspunkt)) == true){
                        System.out.println("Nytt arrangement lagt til.");
                    } else{
                        System.out.println("Prøv et annet nummer");
                    }
                    break;

                case 2: //Finn alle arrangementer på et gitt sted
                    String finnSted = scanner.nextLine();
                    System.out.println(arrangementer.arrangementPåEtSted(finnSted));
                    break;

                case 3: //Finn alle arrangementer på et gitt sted
                    long finnDato = Long.parseLong(scanner.nextLine());
                    System.out.println(arrangementer.arrangementerSammeDato(finnDato).toString());
                    break;

                case 4: //Finn alle arrangementer innenfor et bestemt tidsintervall mellom to datoer
                    int dato1 = Integer.parseInt(scanner.nextLine());
                    int dato2 = Integer.parseInt(scanner.nextLine());
                    System.out.println(arrangementer.argTidsintervall(dato1, dato2));
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
