import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student no1 = new Student("Ida", 8);
        Student no2 = new Student("Malin", 7);
        Student no3 = new Student("Chris", 3);
        Student[] student = new Student[0];
        Oppgaveoversikt oppgaveoversikt = new Oppgaveoversikt(student, 0);
        oppgaveoversikt.nyStud(no1);
        oppgaveoversikt.nyStud(no2);
        oppgaveoversikt.nyStud(no3);


        while (true) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Velg en av valgene i menyen:\n1. Skriv ut oversikt.\n2. Finn ut hvor mange oppgaver en student har løst.\n3. Registrer ny student.\n4. Øk antall oppgaver en student har gjennomført.\n5.Avslutt");
            int op = reader.nextInt();

            if (op == 5) {
                System.out.println("Programmet avsluttes");
                reader.close();
                System.exit(0);
            }

            switch (op) {
                case 1:
                    System.out.println(oppgaveoversikt.toString());
                    break;

                case 2:
                    System.out.println("Skriv inn navn på studenten: ");
                    reader.nextLine();
                    String navn = reader.nextLine();
                    System.out.println("Denne studenten har løst: " + oppgaveoversikt.getAntOppg(navn) + " oppgaver");
                    break;

                case 3:
                    System.out.println("Skriv inn navn på ny student: ");
                    reader.nextLine();
                    String nyStudNavn = reader.nextLine();
                    Student nyStud = new Student(nyStudNavn, 0);

                    System.out.println("Tast inn antall oppgaver en student har utført: ");
                    int tall = reader.nextInt();
                    nyStud.økantOppg(tall);
                    oppgaveoversikt.nyStud(nyStud);
                    break;

                case 4:
                    System.out.println("Skriv inn navn på student: ");
                    reader.nextLine();
                    String studNavn = reader.nextLine();
                    System.out.println("Legg til hvor mange nye oppgaver studenten har løst: ");
                    int num = reader.nextInt();
                    oppgaveoversikt.økStudOppg(studNavn, num);
                    break;
            }
        }
    }

}

