/**
 * Oppgave1.java
 * 
 * Program som gjør om fra tommer til centimeter
 * 
 */
import static javax.swing.JOptionPane.*;
 public class Oppgave1 {
    public static void main (String[] args){
        String tommerLest= showInputDialog("Lengde(tommer):");
        double tommer= Double.parseDouble(tommerLest);
        double lengde= tommer * 2.54;
        showMessageDialog(null, "lengde er" + lengde + "cm");
    }
}