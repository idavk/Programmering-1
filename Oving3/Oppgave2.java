package no.ntnu.iaklaest.idatt2001;
import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    public static void main(String[]args){
    
        while(true){
        String readnumber= showInputDialog("Er dette et primtall? For å avslutte trykk esc");
        int num= Integer.parseInt(readnumber);

        if(num<=1){
            System.out.println("Tallet må være større enn 1");
            continue;
        } 
            for(int i= num-1;; i--){
                if(i==1){
                    System.out.println("Dette er et primtall");
                    break;
                }
                if(num % i==0){
                    System.out.println("Dette er ikke et primtall");
                    break;
                }
            }    
        
        } 
    }
        
}
