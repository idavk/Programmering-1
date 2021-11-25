import java.util.Scanner;

public class NyString {
     String tekst;

    // Konstruktør:
    public NyString(String tekst){
        this.tekst = tekst;
    }

    // Geter:
    public String getTekst(){
        return tekst;
    }
    // Metodene:
    public String forkorting(){
        String[] ord = tekst.split(" ");
        String nyttOrd = "";
        for(int i = 0; i < ord.length; i++) {
            char bokstav = ord[i].charAt(0);
            nyttOrd += bokstav + "";
        }
        return nyttOrd;
    }


    public String fjernBokstav(char bokstav){
        String[] splittord = tekst.split(bokstav + "");
        String nySetning = "";
        for(int i = 0; i < splittord.length; i++){
            nySetning += splittord[i] + "";
        }
        return nySetning;
    }
    public static void main(String[] args){
        NyString myString = new NyString("Ærlig åre");
        System.out.println(myString.forkorting());
        System.out.println(myString.fjernBokstav('r'));
    }
}
