public class Student {
    private String navn;
    private int antOppg;

    //Konstruktøren:
    public Student(String navn, int antOppg){
        this.navn = navn;
        this.antOppg = antOppg;
    }

    //Getere:
    public String getNavn(){
        return navn;
    }

    public int getAntOppg(){
        return antOppg;
    }

    //Metoder:
    public void økantOppg(int økning){
        antOppg += økning;
    }

    @Override
    public String toString() {
        return "Student: " +
                "Navn på student " + navn +
                ", antOppg " + antOppg;
    }

    public static void main(String[] args){
        Student student = new Student("Ida", 23);
        Student student2 = new Student("Alida", 20);
        System.out.println(student.getAntOppg());
        student.økantOppg(5);
        System.out.println(student);


    }
}
