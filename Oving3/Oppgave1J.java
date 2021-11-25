import static javax.swing.JOptionPane.*;

    public class Oppgave1J {
        public static void main(String[] args){
            String readnum= showInputDialog("Hvilken gangetabell ønsker du?");
            int num= Integer.parseInt(readnum);
            String readLimit= showInputDialog("Hvilket intervall ønsker du?");
            int a= Integer.parseInt(readLimit);
            for(int i=1; i<=a; i++){
            System.out.println((num + "x" + i) + "=" + (num*i));

            }
        }
    
    }