public class Fraction{
    private int numerator; // Lager en int for teller
    private int denominator; // Lager en int for nevner

    // Konsturktørene:
    public Fraction(int n, int d){
        this.numerator = n;
        if(d == 0){
            System.out.println("Nevneren kan ikke være 0!");
            throw new IllegalArgumentException(); // Setter inn ulovlig argument ettersom vi ikke kan ha 0 i nevner
        }
        this.denominator = d;
    }
    public Fraction(int n){
        this.numerator = n;
        this.denominator = 1; // Skal lage en brøk med 1 i nevner
    }

    // getmetoder:
    public int getNumerator(){
        return this.numerator;
    } // Lager get-metoder for å kunne hente ut informasjonen fra klassen i klientprogrammet
    public int getDenominator(){
        return this.denominator;
    } // Gjør det samme for begge

    public double getReal(){
        return (double) numerator / denominator;
    }

    //Regnemetodene:
    public void addision(Fraction in){
        if(this.denominator == in.getDenominator()){
            this.numerator += in.getNumerator();
        }
        else{
            this.numerator = this.numerator * in.getDenominator() + in.getNumerator() * this.denominator;
            this.denominator = this.denominator * in.getDenominator(); // Metoden for å kunne addere to brøker med hverandre
        }
    
    }
    public void substraction(Fraction in){
        if(this.denominator == in.getDenominator()){
            this.numerator -= in.getNumerator();
    }
        else{
            this.numerator = this.numerator * in.getDenominator() - in.getNumerator() * this.denominator;
            this.denominator = this.denominator * in.getDenominator(); // Metoden for å substrahere to ulike brøker
        }

    }

    public void division(Fraction in){
        if(in.getDenominator() == 0){
           System.out.println("Nevneren kan ikke være 0!");
           throw new IllegalArgumentException();
        }

        this.numerator *= in.getDenominator();
        this.denominator *= in.getNumerator(); // Metoden for å dele to brøker på hverandre. Og et argument som sier at nevner ikke kan bli 0

        }

    public void multiply(Fraction in){
        this.numerator *= in.numerator;
        this.denominator *= in.denominator; // Metoden for å gange sammen to brøker. Ganger teller med teller og nevner med nevner
    }

    public String toString(){
        return "numerator: "  + numerator + " sdenominator: " + denominator; // Lager en toString for å se hva som skjer med klassen.
    }
}