import java.util.Scanner;
public class Oppgave10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        while(true){
        System.out.println("Hvilken valuta ønsker du å konvertere? Trykk 1: Dollar, 2: Euro, 3: Danske Kroner eller 4: Avslutt");
        double currencey= sc.nextDouble();
        if(currencey<=0){
            System.out.println("Verdien må være større enn null");
            continue;
        } for(double i = currencey;; i--){
                    if(i==1){
                    System.out.println( " " + " Dollar " + " = " +" " + " Norske kroner");
                    break;
                }
                    if(i==2){
                    System.out.println("Euro");
                    break;

                }  if(i==3){
                    System.out.println("Danske kroner");
                    break;
            } if(i==4){
                System.out.println("Programmet avslutter");
                break;
            }
        }
        sc.close();
    }
  
    }
}