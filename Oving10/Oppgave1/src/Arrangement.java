public class Arrangement {
    private int nummer;
    private String navnArrangement;
    private String sted;
    private String arrangør;
    private String type;
    private long tidspunkt;


    //Konstruktør:
    public Arrangement(int nummer, String NavnArrangement, String sted, String arrangør, String type, long tidspunkt) {
        this.navnArrangement = navnArrangement;
        this.nummer = nummer;
        this.sted = sted;
        this.arrangør = arrangør;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    //Gettere og setere:
    public String getNavnArrangement() {
        return navnArrangement;
    }

    public void setNavnArrangement(String navnArrangement) {
        this.navnArrangement = navnArrangement;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public String getArrangør() {
        return arrangør;
    }

    public void setArrangør(String arrangør) {
        this.arrangør = arrangør;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(long tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public int getDato(){
        //Henter tidspunkt
        String datoen=Long.toString(tidspunkt);
        //Henter ut den delen av tidspunkt som er datoen
        int dato=Integer.parseInt(datoen.substring(4, 8));
        return dato;
    }

    @Override
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
        return "Arrangement{" +
                "navnArrangement='" + navnArrangement + '\'' +
                ", nummer=" + nummer +
                ", sted='" + sted + '\'' +
                ", arrangør='" + arrangør + '\'' +
                ", type='" + type + '\'' +
                ", tidspunkt=" + tidspunkt +
                '}';
    }
}
