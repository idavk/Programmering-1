import java.util.Objects;

public class Arrangement {
    //Objektvariabler:
    private int nummer;
    private String navnArrangement;
    private String sted;
    private String arrangør;
    private String type;
    private long tidspunkt;


    //Konstruktør:
    public Arrangement(int nummer, String navnArrangement, String sted, String arrangør, String type, long tidspunkt) {
        this.nummer = nummer;
        this.navnArrangement = navnArrangement;
        this.sted = sted;
        this.arrangør = arrangør;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    //Gettere og setere:
    public int getNummer() {
        return nummer;
    }

    public String getNavnArrangement() {
        return navnArrangement;
    }

    public String getSted() {
        return sted;
    }

    public String getArrangør() {
        return arrangør;
    }

    public String getType() {
        return type;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }

    public int getBareDato(){
        String datoen = Long.toString(tidspunkt);
        int dato = Integer.parseInt(datoen.substring(0, 8));
        return dato;
    }

    @Override
    // Lager en equals metode for å kunne sjekke om arrangementet allerede eksisterer.
    public boolean equals(Object o){
        if(this == o)
            return true;
        if (!(o instanceof Arrangement))
            return false;
        Arrangement arg = (Arrangement) o;
        return getNummer() == arg.getNummer();
    }
    //To-String
    @Override
    public String toString() {
        return "Arrangementnummer: " + nummer + "" +
                "\nnavnArrangement: " + navnArrangement +
                "\nsted: " + sted +
                "\narrangør: " + arrangør +
                "\ntype: " + type +
                "\ntidspunkt: " + tidspunkt;
    }
}
