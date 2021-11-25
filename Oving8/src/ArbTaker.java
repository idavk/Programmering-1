import java.util.GregorianCalendar;

public class ArbTaker {
    private Person person;
    int arbeidstakernr;
    int ansettelsesår;
    double månedslønn;
    double skatteprosent;


    public ArbTaker(String fornavn, String etternavn, int fødselsår, int arbeidstakernr, int ansettelsesår, double månedslønn, double skatteprosent){
        this.person = new Person(fornavn, etternavn, fødselsår);
        this.arbeidstakernr = arbeidstakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent * 0.01;
    }

    //Getere og setere:
    public Person getPersonalia(){
        return person;
    }

    public int getArbeidstakernr(){
        return arbeidstakernr;
    }

    public int getAnsettelsesår(){
        return ansettelsesår;
    }

    public double getMånedslønn(){
        return månedslønn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    public String getNavn(){
        return person.getEtternavn() + ", " + getPersonalia().getFornavn();
    }

    public void setAnsettelsesår(int ansettelsesår) {
        this.ansettelsesår = ansettelsesår;
    }

    public void setArbeidstakernr(int arbeidstakernr) {
        this.arbeidstakernr = arbeidstakernr;
    }

    public void setMånedslønn(double månedslønn) {
        this.månedslønn = månedslønn;
    }

    public void setPersonalia(Person personalia) {
        person = personalia;
    }

    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent * 0.01;
    }

    //Metoder:
    public double skattetrekkPerMåned(){
         return skatteprosent * månedslønn;
    }

    public double bruttolønnPerÅr(){
        return månedslønn * 12;
    }

    public double skattetrekkPerÅr(){
        double trekkDesember = 0.5 * skatteprosent * månedslønn;
        return skatteprosent * månedslønn * 10 + trekkDesember;
    }

    public int alder(){
        GregorianCalendar kalender = new GregorianCalendar();
        int nåværendeÅrstall = kalender.get(GregorianCalendar.YEAR);
        return nåværendeÅrstall - getPersonalia().getFødselsår();
    }

    public int antallÅrAnsatt(){
        GregorianCalendar kalender = new GregorianCalendar();
        int nåværendeÅrstall = kalender.get(GregorianCalendar.YEAR);
        return nåværendeÅrstall - getAnsettelsesår();
    }

    public boolean ansattLengerEnnXÅr(int XÅr){
        return (XÅr < antallÅrAnsatt());
    }

    public String toString(){
        return getNavn() +
                "\n Alder: " + alder() +
                "\n Antall år ansatt: " + antallÅrAnsatt() +
                "\n Skatte trekk per måned: " + skattetrekkPerMåned() + "Kr" +
                "\n Skatte trekk per år: " + skattetrekkPerÅr() + "Kr" +
                "\n Brutto lønn per år: " + bruttolønnPerÅr() + "kr";
    }
}
