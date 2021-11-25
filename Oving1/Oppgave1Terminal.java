
import java.util.Scanner;
public class Oppgave1Terminal {
    public static void main(String[] args){
        Scanner tommerLest= new Scanner(System.in);
        System.out.println("Hvor mange tommer?");
        double totalcm=tommerLest.nextDouble();
        totalcm*= 2.54;
        System.out.println("Svar: " + totalcm + "cm");

        tommerLest.close();

    }
}
