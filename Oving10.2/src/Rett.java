public class Rett {
    //Objektvariabler:
    private String navn;
    private String type;
    private double pris;
    private String oppskrift;

    //Konstruktør:
    public Rett(String navn, String type, double pris, String oppskrift) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    //Gettere:
    public String getNavn() {
        return navn;
    }

    public String getType() {
        return type;
    }

    public double getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Rett)) return false;
        Rett rett = (Rett) o;
        return getNavn().compareTo(rett.getNavn()) == 0;
    }

    @Override
    public String toString() {
        return "\n" + type + ", " +
                 navn + ": " + pris + "kr";
    }
}

