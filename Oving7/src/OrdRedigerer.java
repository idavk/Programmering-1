public class OrdRedigerer {
    String tekst;

    // Konstruktøren:
    public OrdRedigerer(String tekst){
        this.tekst = tekst;
    }

    // getere:

    public String getTekst(){
        return tekst;
    }

    public String getStorBokstav(){
        return tekst.toUpperCase();
    }

    // Metoder:
    public int totaltAntallOrd(){
        String[] ord = tekst.split(" ");
        return ord.length;
    }

    public double GjennomstligOrdLengde(){
        String[] ord = tekst.split("[\\p{Punct}\\s]+");
        int sum = 0;
        for(int i = 0; i < ord.length; i++){
            sum += ord[i].length();
        }
        return (double) sum / (double) totaltAntallOrd();
    }

    public double GjennomstliglengdeperSetning(){
        String[] setning = this.tekst.split("[.?:!]"); // #Hei# #Hei#
        OrdRedigerer tekst1 = new OrdRedigerer(this.tekst);
        int antallOrd = tekst1.totaltAntallOrd();


        return (double)  antallOrd / setning.length;
    }

    public void søkogerstatt(String søkOrd, String erstattOrd){
        String nyttOrd = tekst.replaceAll(søkOrd, erstattOrd);
        this.tekst = nyttOrd;
    }

    public static void main(String[] args) {
        OrdRedigerer ordRedigerer = new OrdRedigerer("Heisann, heisann! Hvordan går det? Det går veldig bra.");
        System.out.println("Det er: " + ordRedigerer.totaltAntallOrd() + " totalt antall ord i teksten.");
        System.out.printf("Gjennomsnitlig lengde på ord er: %.2f \n", ordRedigerer.GjennomstligOrdLengde());
        System.out.printf("Gjennomsnitlig lengde per setning er: %.2f \n", ordRedigerer.GjennomstliglengdeperSetning());
        ordRedigerer.søkogerstatt("går", "gikk");
        System.out.println(ordRedigerer.getTekst());
        System.out.println(ordRedigerer.getStorBokstav());
    }

}
