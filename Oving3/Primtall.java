package no.ntnu.iaklaest.idatt2001;



import java.util.Scanner;
public class Primtall {

    public static void main(String[] args){
            System.out.println("Er dette tallet et primtall");
            System.out.println("Tast inn tall for å sjekke om det er et primtall. Trykk ctrl+c for å avslutte");
            Scanner scanner= new Scanner(System.in);

            while(true){
                System.out.println("Tast inn tallet du ønsker:");
                int number= scanner.nextInt();
                if(number<=1){
                    System.out.println("Tallet må være større enn 1");
                    continue;
                }
                    for (int i= number-1;; i--){
                            if(i==1){
                            System.out.println("Tallet er et primtall");
                            break;
                            }
                                if(number % i==0){
                                System.out.println("Tallet er ikke et primtall");
                                break;
                                }
                    }
                 scanner.close();
            }
    }

}