public class Oppgave1 {
    public static void main(String[] args){
        Fraction fi = new Fraction(8, 7); // Lager ulike brøker
        Fraction f1 = new Fraction(3); // Testet med heltall
        Fraction f2 = new Fraction(1, 6);
        Fraction f3 = new Fraction(4, 9);
        Fraction f4 = new Fraction(5, 6);

        System.out.println("Brøk den tar utganspunkt i \n " + fi.toString()); // Brøken jeg tar utgangspunkt i
        
        fi.addision(f1);
        System.out.println("Etter addisjon \n " + fi.toString()); // Så adderer jeg med neste brøk
        
        fi.substraction(f2);
        System.out.println("Etter substraksjon \n " + fi.toString()); // Trekker fra brøken jeg har fått med neste brøk

        fi.division(f3);
        System.out.println("Etter divisjon \n " + fi.toString()); // Dividerer neste brøk med neste brøk

        fi.multiply(f4);
        System.out.println("Etter ganging \n " + fi.toString()); // Ganger med siste brøken


    }
    
}
