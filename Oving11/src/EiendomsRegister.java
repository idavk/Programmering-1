import java.util.ArrayList;

/**
 * class EiendomsRegister
 * @author Ida Angell Veglo Klæstad
 * @version 1.0
 * @since 2020.11.08
 */
public class EiendomsRegister {
    private ArrayList<Eiendom> eiendomsRegister;


    public EiendomsRegister(){
        this.eiendomsRegister = new ArrayList<>();

    }

    /**
     * Metoden for å finne totalt antall eiendommer i registeret
     * @return eiendomsRegister.size
     */
    public int getTotalteiendomer(){
        return eiendomsRegister.size();
    }

    /**
     * En metode for å regne ut gjennomsnitsarealet på eiendommer i Gloppen kommune
     * @return sum / getTotalteiendommer
     */
    public double getGjennomsnittAreal(){
        double sum = 0;
        for(Eiendom eiendom: eiendomsRegister){
            sum += eiendom.getAreal();
        }
        return sum / getTotalteiendomer();
    }

    /**
     * Metoden for å kunne søke etter eiendommer på et spesielt gårdsnummer
     * @param gnr
     * @return tempGnr
     */
    public ArrayList<Eiendom> getEienndomNummer(int gnr){
        ArrayList<Eiendom> tempGnr = new ArrayList<>();
        for(Eiendom eiendom: eiendomsRegister){
            if(eiendom.getGnr() == gnr){
                tempGnr.add(eiendom);
            }
        }
        return tempGnr;
    }

    /**
     * Metode for å registrere ny eiendom til lista
     * @param e
     * @return true hvis eiendommen ikke er registrert/ false hvis eiendommen finnes fra før
     */
    public boolean nyEiendom(Eiendom e){
        if(!eiendomsRegister.contains(e)){
            eiendomsRegister.add(e);
            return true;
        }
        return false;
    }

    /**
     * Metode for å søke etter eiendom ved hjelp av kommunenummer, gårdsnummer og bruksnummer
     * @param eiendom
     * @return sokEtterEiendom
     */
    public ArrayList<Eiendom> sokEtterEiendom(String eiendom) {
        ArrayList<Eiendom> sokEtterEiendom = new ArrayList<>();
        for(Eiendom e: eiendomsRegister){
            if(e.getID().equals(eiendom)){
                sokEtterEiendom.add(e);
            }
        }
        return sokEtterEiendom;
    }

    /**
     * Metode for å kunne slette eiendom
     * @param e
     * @return true hvis eiendommen du ønsker å slette eksisterer/ false hvis eiendomen ikke eksisterer
     */
    public boolean slettEiendom(Eiendom e){
        if(eiendomsRegister.contains(e)){
            eiendomsRegister.remove(e);
            return true;
        }
        return false;
    }


    /**
     * toString-metode for å printe ut informasjon over eiendommer i Gloppen kommune.
     * @return
     */
    public String toString(){
        String s = "Eiendommer:";
        for(int i = 0; i < eiendomsRegister.size(); i++){
            s += "\n\n" + eiendomsRegister.get(i).toString();
        }
        return s;
    }
}
