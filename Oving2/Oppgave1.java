import static javax.swing.JOptionPane.*;

public class Oppgave1 {

    public static void main (String[] args){

String skuddårLest= showInputDialog("Skriver inn år: ");
int year= Integer.parseInt(skuddårLest);
if (year%100 ==0){
    if (year%400 ==0){
        showMessageDialog(null, "Det er skuddår");
    }   
    else {
    showMessageDialog(null, "Det er ikke et skuddår");
    }
}
else {
    if (year%4== 0){
        showMessageDialog(null, "Det er skuddår" );
    }
    else {
        showMessageDialog(null, "Ikke skuddår");
            }
        }
    }
    
}