
import java.util.Scanner;



public class Valuta{
    private final String Navn;
    private final double Verdi;

 public Valuta(String Navn, double Verdi){
        this.Navn= Navn;
        this.Verdi=Verdi;

 }
 public String getNavn(){
     return Navn;
 }
 public double getVerdi(){
     return Verdi;
 }

 public Double toNOK(Double currencyAmount){
     return currencyAmount * Verdi;
 }
  
 public Double fromNOK(Double nokAmount){
     return nokAmount / Verdi;
 }

    public static void main(String[] args){
            boolean cont = true;
            Scanner Konverter= new Scanner(System.in);
        while(cont){
            System.out.println( " \n 1: US Dollar \n 2: Euro \n 3: Svenske Kroner \n 4: Avlsutt \n Velg øsnket valuta fra menyen:");
            int Valuta= Konverter.nextInt();
        if(Valuta == 4){
            System.out.println("Takk for at du brukte dette programmet!");
            Runtime.getRuntime().exit(Valuta);
            cont = false;
            continue;
        }
        if(Valuta > 4){
            continue;
        }
        
        System.out.println("Hvor mye ønsker du å gjøre om?");
        Valuta usd = new Valuta("usd", 8.77);
        Valuta euro = new Valuta("euro", 10.47);
        Valuta sek = new Valuta("sek", 1.01);
        double verdi=Konverter.nextDouble();

            
            switch(Valuta){
                case 1:
                System.out.printf("Det utgjør %.2f NOK", (usd.toNOK(verdi)));
                continue;

                case 2:
                System.out.printf("Det utgjør %.2f NOK", (euro.toNOK(verdi)));
                continue;

                case 3:
                System.out.printf("Det utgjør %.2f NOK", (sek.toNOK(verdi)));
                continue;

                default:
                System.out.println("Tallet du valgte er ikke mulig");
                continue;
            }
            

        }
        Konverter.close();
    }
    

}