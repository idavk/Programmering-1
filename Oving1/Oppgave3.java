/**
 * 
 * Oppgave3
 * 
 * Et program som gjør om sekunder, minutter og timer til timer
 * 
 */

import static javax.swing.JOptionPane.*;
public class Oppgave3 {
    public static void main(String[] args){
        String sekunderLest= showInputDialog("sekunder:");
        int minutter= Integer.parseInt(sekunderLest)%3600/60;
        int sekunder= Integer.parseInt(sekunderLest)%3600%60;
        int timer= Integer.parseInt(sekunderLest)/3600;
        String timestamp=String.format ("%02d:%02d:%02d", timer, minutter, sekunder);

        showMessageDialog(null, timestamp);
        
    }
}