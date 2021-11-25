import java.util.Scanner;

public class Tekstanalyse {
    private int[] antall; // For antall tall

    // Lager konstruktørene:
    public Tekstanalyse(String tekst) {
        this.antall = new int[30]; // Sier at den skal være 30 lang
        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            int indeks = (int) c;
            if (indeks >= 97 && indeks <= 122) {
                antall[indeks - 97]++;
            } // Her lager jeg en if-statement for å kunne hente ut små bokstaver mellom a-z
            else if(indeks >= 65 && indeks <= 90){
                antall[ indeks - 65]++;
            } // Her lager jeg en else if-statement for å hente ut store bokstaver mellom a-z
            else if(indeks == 230 || indeks == 198){
                antall[26]++;
            } // Her lager jeg en else if-statement for å hente ut stor bokstav for Æ.
            else if (indeks == 248 || indeks == 216){
                antall[27]++;
            } // Gjør det samme for Ø som for Æ
            else if(indeks == 229 || indeks == 197){
                antall[28]++;
            } // Gjør det samme for Å som for Æ og Ø
            else{
              antall[29]++;
            } // Siste blir en else for den skal ta alle andre symboler enn de vi har lage over.

        }
    }
    public int[] getAntall(){
        return antall;
    } // For
    public int antallUlikeBokstaver(){
        int teller = 0;
        for (int i = 0; i <= 28; i++) {
            if (antall[i] > 0) {
                teller++;
            }
        }
        return teller;
    }

    public int totalAntallBokstaver(){
        int totalt = 0;
        for(int i = 0; i <= 28; i++){
            totalt += antall[i];
        }
        return totalt;
    }

    public double prosentandelIkkeBokstaver (){
        double ikkeBokstav = antall[29] * 100 / (double)totalAntallBokstaver();
        return ikkeBokstav;
    }

    public int forekomstBokstav(char bokstav) {
        int indeks = (int) bokstav;
        if (indeks >= 65 && indeks <= 90) {
            return antall[indeks - 65];
        }
        if (indeks >= 97 && indeks <= 122) {
            return antall[indeks - 97];
        }
        if (indeks == 230 || indeks == 198) {
            return antall[26];
        }
        if (indeks == 248 || indeks == 216){
            return antall[27];
        }
        if (indeks == 229 || indeks == 197){
            return antall[28];
        }
        return 0;
    }

    public String forekommerMest(){
        int max = 0;
        String bokstaver = "";
        for(int i =0; i <= 28; i++){
            if(antall[i] > max){
                max = antall[i];
            }
        }
        for(int i = 0; i <= 25; i++){
            if(antall[i] == max){
                bokstaver += (char)(i + 65);
            }
        }
        if(antall[26] == max){
            bokstaver += (char)(230);
        }
        if(antall[27] == max){
            bokstaver += (char)(248);
        }
        if(antall[28] == max){
            bokstaver += (char)(229);
        }
        return bokstaver;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boolean avslutt = false;
        while(!avslutt){
            System.out.println("Sett inn teksten du ønsker å sette inn? Hvis du vil avslutte skriv esc.");
            String tekst = sc.nextLine();
            if(tekst.equals("esc")){
                avslutt  = true;
                continue;
            }
            System.out.println("Hvilken bokstav øsnker du å sjekke forekomsten til?");
            char bokstav = sc.nextLine().charAt(0);
            Tekstanalyse antall = new Tekstanalyse(tekst);
            int teller = antall.antallUlikeBokstaver();
            int totalt = antall.totalAntallBokstaver();
            double ikkeBokstav = antall.prosentandelIkkeBokstaver();
            int forekomst = antall.forekomstBokstav(bokstav);
            String max = antall.forekommerMest();

            System.out.println("Det er " + teller + " bokstaver i teksten.");
            System.out.println("Det er totalt: " + totalt + " bokstaver i teksten");
            System.out.printf("Prosentandelen av teksten som ikke er bokstaver er: %.2f%% \n", ikkeBokstav);
            System.out.println("Denne bokstaven forekommer: " + forekomst + " ganger.");
            System.out.println("Den/Disse bokstavene forekommer flest ganger: " + max);
        }


    }
}

