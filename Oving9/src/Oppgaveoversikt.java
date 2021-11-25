import java.util.Arrays;

public class Oppgaveoversikt {
    private Student[] studenter;
    private int antStud = 0;

    //Konstruktør:
    public Oppgaveoversikt(Student[] studenter, int antStud) {
        this.studenter = studenter;
        this.antStud = studenter.length;
    }

    //Getere:
    public Student[] getStudenter() {
        return studenter;
    }

    public int getAntStud() {
        return antStud;
    }

    public int getAntOppg(String navn){
        int studNmr = getStudNmr(navn);
        return studenter[studNmr].getAntOppg();
    }

    public int getStudNmr(String navn) {
        int indeks = 0;
        for (int i = 0; i < studenter.length; i++) {
            if (studenter[i].getNavn().equals(navn)){
                indeks = i;
            }
        }
        return indeks;
    }

    //Metoder:
    public int getStudOppg(String student) {
        return (studenter[getStudNmr(student)].getAntOppg());
    }

    public void økStudOppg(String student, int økning) {
        studenter[getStudNmr(student)].økantOppg(økning);
    }

    public void nyStud(Student student) {
        Student[] nyStud = new Student[studenter.length + 1];
        for (int i = 0; i < studenter.length; i++) {
            nyStud[i] = studenter[i];
        }

        nyStud[studenter.length] = student;
        studenter = nyStud;
        antStud += 1;
    }

    @Override
    public String toString() {
        String string = "Antall studenter: " + antStud + "\nStudent oversikt:\n";
        for (int i = 0; i < studenter.length; i++) {
            string += studenter[i].getNavn() + "\n" + "Antall oppgaverfullført: " + studenter[i].getAntOppg() + "\n";
        }
        return string;
    }
}
