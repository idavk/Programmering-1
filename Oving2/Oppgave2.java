import static javax.swing.JOptionPane.*;
public class Oppgave2 {
    public static void main (String[] args){
        double kiloprismerkeA = (35.90/450);
        double kiloprismerkeB = (39.50/500);
        if (kiloprismerkeA < kiloprismerkeB) {
            showMessageDialog(null, "Merke A er billigst");
        } else {
            showMessageDialog(null, "Merke B er billigst");
        }
          
    }
    
}