import java.util.ArrayList;
import java.util.Collections;
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

        public ArrayList<Arrangement> argTidsintervall(long dato1, long dato2){
            ArrayList<Arrangement> tidsintervall = new ArrayList<> ();
            for(Arrangement a: arrangementer){
                if (a.getBareDato() >= dato1 && a.getBareDato() <= dato2){
                    tidsintervall.add(a);
                }
            }
            return tidsintervall;
        }

        public ArrayList<Arrangement> arrangementerSammeDato(long dato){
            ArrayList<Arrangement> arrangementerSammeDato = new ArrayList<>();
            for(Arrangement a: arrangementer){
                if(a.getBareDato() == dato){
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
                Arrangement midlertidig = new Arrangement(sorterKopi.get(hoyTilMinst).getNummer(), sorterKopi.get(hoyTilMinst).getNavnArrangement(), sorterKopi.get(hoyTilMinst).getSted(), sorterKopi.get(hoyTilMinst).getArrangør(), sorterKopi.get(hoyTilMinst).getType(), sorterKopi.get(hoyTilMinst).getTidspunkt());
                sorterKopi.set(hoyTilMinst, sorterKopi.get(i));
                sorterKopi.set(i, midlertidig);
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
                Arrangement midlertidig = new Arrangement(sorterKopi.get(hoyTilMinst).getNummer(), sorterKopi.get(hoyTilMinst).getNavnArrangement(), sorterKopi.get(hoyTilMinst).getSted(), sorterKopi.get(hoyTilMinst).getArrangør(), sorterKopi.get(hoyTilMinst).getType(), sorterKopi.get(hoyTilMinst).getTidspunkt());
                sorterKopi.set(hoyTilMinst, sorterKopi.get(i));
                sorterKopi.set(i, midlertidig);
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
                Arrangement midlertidig = new Arrangement(sortertKopi.get(hoytilMinst).getNummer(),sortertKopi.get(hoytilMinst).getNavnArrangement(), sortertKopi.get(hoytilMinst).getSted(), sortertKopi.get(hoytilMinst).getArrangør(),sortertKopi.get(hoytilMinst).getType(), sortertKopi.get(hoytilMinst).getTidspunkt());
                sortertKopi.set(hoytilMinst, sortertKopi.get(i));
                sortertKopi.set(i, midlertidig);
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
