import java.util.ArrayList;

public class MenyRegister {
    //Objektvariabler:
    private ArrayList<Rett> rettReg = new ArrayList<>();
    private  ArrayList<Meny> menyReg = new ArrayList<>();

    //Konstruktør:
    public MenyRegister(){

    }

    //Metoder:
    public boolean nyRett(Rett r){
        if(!rettReg.contains(r)){
            rettReg.add(r);
            return true;
        }
        return false;
    }

    public ArrayList<Rett> rettGittNavn(String rett){
        ArrayList<Rett> finnRett = new ArrayList<>();
        for(Rett a: rettReg){
            if(a.getNavn().equals(rett)){
                finnRett.add(a);
            }
        }
        return finnRett;
    }

    public ArrayList<Rett> rettGittType(String type){
        ArrayList<Rett> finnRett = new ArrayList<>();
        for(Rett a: rettReg){
            if(a.getType().equals(type)){
                finnRett.add(a);
            }
        }
        return finnRett;
    }

    public void nyMenyMedRetter(String name, ArrayList<Rett> meny){
        menyReg.add(new Meny(name, meny));

    }

    public ArrayList<Meny> prisintervall(double pris1, double pris2){
        ArrayList<Meny> prisintervall = new ArrayList<>();
        for(Meny a: menyReg){
            if(a.totalPris() >= pris1 && a.totalPris() <= pris2){
                prisintervall.add(a);
            }
        }
        return prisintervall;
    }

    public Rett rettGittNummer(int a){
        Rett rett = rettReg.get(a-1);

        return rett;
    }

    public String toString2(){
        String alleRetter = "";
        for(int i = 0; i < rettReg.size(); i++){
            alleRetter += "\n" + (i+1) + ". " + rettReg.get(i).toString() + "\n";
        }
        return alleRetter + "\n";
    }

    public String toString(){
        String alleMenyer = "";

        for(int i = 0; i < menyReg.size(); i++){
            alleMenyer += menyReg.get(i).toString();
        }
        return alleMenyer + "\n";
    }

    public String toString(ArrayList<Rett>retter){
        String menyMedRetter = "";
        for(Rett rett : retter){
            menyMedRetter += retter.toString() + "\n";
        }
        return menyMedRetter + "\n";
    }
}
