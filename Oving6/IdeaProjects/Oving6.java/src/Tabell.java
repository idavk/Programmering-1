public class Tabell {
    java.util.Random random = new java.util.Random();
    int i;
    int tall = random.nextInt(10); // Legger inn en random for å kunne få tilfeldige tall
    int[] antall = new int[10]; // Den skal ha en lengde på 10 tall
    int tell = 0;

    public int getTall(){
        return tall; // For å kunne hente ut tallene i main delen.
    }

    public int[] saveAntall(){
        for(int i = 0; i < 1000; i++){
            int tall = random.nextInt(10);
            antall[tall] ++; // Må lagre antall ganger tallet dukker opp i intervallet.
        }
        return antall;
    }
    public static void main(String[] args){
        Tabell tall = new Tabell();
        int[] antall = tall.saveAntall();
        for(int i = 0; i < 10; i++){
            System.out.println(i + " gjentas " + antall[i] + " ganger."); // Printer ut hvor mange ganger et tall duker opp i intervallet fra 1000. Tallene skal være mellom 0 og 9
        }
    }
}
