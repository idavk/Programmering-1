import java.util.Random;
public class MinRandom {
    private Random random;
   
    public MinRandom(){
        this.random = new Random();
       
    }
    public Random getrandom(){
        return random;
    }
    public int nesteHeltall(int a, int b){
        return random.nextInt(b - a) + a + 1;
    } // Lager en metode som kan finne et tilfeldig heltall mellom to intervaller

    public double nesteDesimaltall(double a, double b){
        return random.nextDouble()*(b - a) + a;
    } // Lager en metode som kan finne et tilfeldig desimaltall mellom to intervaller

    public static void main(String[] args) {
        MinRandom random1 = new MinRandom();

        for(int i = 0; i<= 10; i++){
           System.out.println(random1.nesteDesimaltall(7, 8)); // Printer ut et tilfeldig tall mellom 7 og 8
        }

        for(int i = 0; i<=10; i++){
            System.out.println(random1.nesteHeltall(3, 6)); // Et tilfeldig heltall mellom 3 og 5
        }
    }
}



