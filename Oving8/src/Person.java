public class Person {
    private final String fornavn;
    private final String etternavn;
    private final int fødselsår;

    //Konstuktøren:
    public Person(String fornavn, String etternavn, int fødselsår){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fødselsår = fødselsår;
    }

    //Getere:
    public String getFornavn(){
        return fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public int getFødselsår(){
        return fødselsår;
    }

}
