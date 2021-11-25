import java.util.ArrayList;

public class ArrangementRegister {
    private ArrayList<Arrangement> arrangementer = new ArrayList<Arrangement>();


    //Metoder:
    public boolean nyttArrangement(Arrangement a){
        if(!arrangementer.contains(a)){
            arrangementer.add(a);
            return true;
        }
        return false;
    }

    public ArrayList<Arrangement> arrangementPåEtSted(String sted){
        ArrayList<Arrangement> arrangementerPåEtSted = new ArrayList<>();
        for(Arrangement a: arrangementer){
            if(a.getSted().equals(sted)){
                arrangementerPåEtSted.add(a);
            }
        }
        return arrangementerPåEtSted;
    }

    public ArrayList<Arrangement> argTidsintervall(int dato1, int dato2){
        ArrayList<Arrangement> tidsintervall = new ArrayList<> ();
        for(Arrangement a: arrangementer){
            if (a.getDato()>=dato1 && a.getDato()<=dato2){
                tidsintervall.add(a);
            }
        }
        return tidsintervall;
    }

    public ArrayList<Arrangement> arrangementerSammeDato(long dato){
        ArrayList<Arrangement> arrangementerSammeDato = new ArrayList<>();
        for(Arrangement a: arrangementer){
            if(a.getTidspunkt() == dato){
                arrangementerSammeDato.add(a);
            }
        }
        return arrangementerSammeDato;
    }

    public ArrayList<Arrangement> sorterSted(){
        ArrayList<Arrangement> sorterKopi = (ArrayList<Arrangement>)arrangementer.clone();
        sorterKopi.trimToSize();
        for(int i = 0; i < sorterKopi.size(); i++){
            int hoyTilMinst = i;
            for(int j = hoyTilMinst; j < sorterKopi.size(); j++){
                if(sorterKopi.get(hoyTilMinst).getSted().compareTo(sorterKopi.get(j).getSted()) > 0){
                    hoyTilMinst = j;
                }
            }
            Arrangement tmp = new Arrangement(sorterKopi.get(hoyTilMinst).getNummer(), sorterKopi.get(hoyTilMinst).getNavnArrangement(), sorterKopi.get(hoyTilMinst).getSted(), sorterKopi.get(hoyTilMinst).getArrangør(), sorterKopi.get(hoyTilMinst).getType(), sorterKopi.get(hoyTilMinst).getTidspunkt());
            sorterKopi.set(hoyTilMinst, sorterKopi.get(i));
            sorterKopi.set(i, tmp);
        }
        return sorterKopi;
    }

    public ArrayList<Arrangement> sorterType(){
        ArrayList<Arrangement> sorterKopi = (ArrayList<Arrangement>)arrangementer.clone();
        sorterKopi.trimToSize();
        for (int i = 0; i < sorterKopi.size(); i++){
            int hoyTilMinst = i;
            for(int j = hoyTilMinst; j < sorterKopi.size(); j++){
                if(sorterKopi.get(hoyTilMinst).getType().compareTo(sorterKopi.get(j).getType()) > 0){
                    hoyTilMinst = j;
                }
            }
            Arrangement tmp = new Arrangement(sorterKopi.get(hoyTilMinst).getNummer(), sorterKopi.get(hoyTilMinst).getNavnArrangement(), sorterKopi.get(hoyTilMinst).getSted(), sorterKopi.get(hoyTilMinst).getArrangør(), sorterKopi.get(hoyTilMinst).getType(), sorterKopi.get(hoyTilMinst).getTidspunkt());
            sorterKopi.set(hoyTilMinst, sorterKopi.get(i));
            sorterKopi.set(i, tmp);
        }
        return sorterKopi;
    }

    public ArrayList<Arrangement> sorterTid(){
        ArrayList<Arrangement> sortertKopi = (ArrayList<Arrangement>)arrangementer.clone();
        sortertKopi.trimToSize();

        for(int i = 0; i < sortertKopi.size(); i++){
            int hoytilMinst = i;
            for(int j = hoytilMinst; j < sortertKopi.size(); j++){
                if(sortertKopi.get(hoytilMinst).getTidspunkt() > (sortertKopi.get(j).getTidspunkt())){
                    hoytilMinst = j;
                }
            }
            Arrangement tmp = new Arrangement(sortertKopi.get(hoytilMinst).getNummer(),sortertKopi.get(hoytilMinst).getNavnArrangement(), sortertKopi.get(hoytilMinst).getSted(), sortertKopi.get(hoytilMinst).getArrangør(),sortertKopi.get(hoytilMinst).getType(), sortertKopi.get(hoytilMinst).getTidspunkt());
            sortertKopi.set(hoytilMinst, sortertKopi.get(i));
            sortertKopi.set(i, tmp);
        }
        return sortertKopi;
    }

    @Override
    public String toString() {
        String string = "Arrangement oversikt; \n";
        for (Arrangement a: arrangementer){
            string += a + "\n";
        }
        return string;
    }
}
