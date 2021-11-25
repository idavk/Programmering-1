import java.util.ArrayList;

public class Meny {
    //Objektvariabel:
    private String navn;
    private ArrayList<Rett> meny;

    //Konstruktør:
    public Meny(String name, ArrayList<Rett> retter) {
        this.navn = name;
        this.meny = retter;
    }

    //Getter:
    public String getNavn() {
        return navn;
    }

    //Metoder:
    public double totalPris(){
        double totalPris = 0;
        for(Rett a: meny){
            totalPris += a.getPris();
        }
        return totalPris;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Meny)) return false;
        Meny meny = (Meny) o;
        return getNavn() == meny.getNavn();
    }

    public String toString(){
        String menyMedRetter = "\n" + navn + "\n";
        for(Rett retter: meny){
            menyMedRetter += retter.toString();
        }
        return menyMedRetter + "\n";
    }
}
