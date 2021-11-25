/**
 * Oppgave2.java
 * 
 * Program som gjørom timer, minutter og sekunder til sekunder
 *
 */
import static javax.swing.JOptionPane.*;
public class Oppgave2 {
    public static void main(String[] args){
        String timerLest= showInputDialog("timer:");
        String minutterLest= showInputDialog("minutter:");
        String sekunderLest= showInputDialog("sekunder:");
        int timer= Integer.parseInt(timerLest);
        int minutter= Integer.parseInt(minutterLest);
        int sekunder= Integer.parseInt(sekunderLest);
        int totalsec= (timer*60*60)+(minutter*60)+(sekunder);
        showMessageDialog(null,"Antall sekunder er" + totalsec);
    }
} 