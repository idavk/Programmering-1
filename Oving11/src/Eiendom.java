/**
 * En klasse som innholder informasjon om eiendomen
 * @version 1.0
 * @since 2020.11.08
 * @author Ida Angell Veglo Klæstad
 */
public class Eiendom {
    //Lager objektvariabler:
    private int kommunenummer;
    private String kommunenavn;
    private int gnr;
    private int bnr;
    private String bruksnavn;
    private double areal;
    private String navnEier;

    /**
     *Konstruktøren
     * @param kommunenummer
     * @param kommunenavn
     * @param gnr
     * @param bnr
     * @param bruksnavn
     * @param areal
     * @param navnEier
     */

    //Lager en konstruktør:
    public Eiendom(int kommunenummer, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String navnEier){
        this.kommunenummer = kommunenummer;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.navnEier = navnEier;
    }
    /**
     *
     * @return kommunenummer.
     */
    //Lager gettere:
    public int getKommunenummer() {
        return kommunenummer;
    }
    /**
     *
     * @return navn på kommunen
     */
    public String getKommunenavn() {
        return kommunenavn;
    }
    /**
     *
     * @return gårdsnummer
     */
    public int getGnr() {
        return gnr;
    }
    /**
     *
     * @return bruksnummer
     */
    public int getBnr() {
        return bnr;
    }
    /**
     *
     * @return bruksnavn på eiendom
     */
    public String getBruksnavn() {
        return bruksnavn;
    }
    /**
     *
     * @return arealet på eiendomen
     */
    public double getAreal() {
        return areal;
    }
    /**
     *
     * @return navn på eier av eiendomen
     */
    public String getNavnEier() {
        return navnEier;
    }
    /**
     *
     * @return den unike id til en eiendom
     */
    public String getID(){
        return kommunenummer + "-" + gnr + "/" + bnr;
    }
    /**
     *
     * @param o det vi sammenlikner med
     * @return true hvis likhet/ false hvis ulikt.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Eiendom)) return false;
        Eiendom eiendom = (Eiendom) o;
        return getID().compareTo(eiendom.getID()) == 0;
    }
    /**
     *
     * @return innholdet av informasjonen som er registrert om en eiendom.
     */
    public String toString(){
        return "Eiendom: " + kommunenummer + "-" + gnr + "/" + bnr + "\n" +
                "Kommunenavn: " + kommunenavn + "\n" +
                "Bruksnavn: " + bruksnavn + "\n" +
                "Areal på eiendom: " + areal + "\n" +
                "Navn på eier av eiendom: " + navnEier;
    }

    public static void main(String[] args){
        Eiendom nr1 = new Eiendom(101,"Horten", 77, 631, " ", 23.6, "Jens Olsen" );
        System.out.println(nr1);
    }
}
