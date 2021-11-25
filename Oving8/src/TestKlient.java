import java.util.Scanner;

public class TestKlient {
    private static String Person;

    public static void main(String[] args) {
        Person person = new Person("Ida", "Klæstad", 1998);
        ArbTaker arbTaker = new ArbTaker("Ida", "Klæstad", 1998, 34658, 2016, 45000, 24);
        int tall = 0;


        System.out.println("Parameter");
        Scanner parameterInput = new Scanner(System.in);
        int parameter = Integer.parseInt(parameterInput.nextLine());

        if (arbTaker.ansattLengerEnnXÅr(parameter) == true) {
            System.out.println("Personen har vært ansatt mer enn " + parameter + "år");
        } else {
            System.out.println("Personen har vært ansatt mindre enn " + parameter + "år");
        }

        while (tall != 4) {
            System.out.println("1. Endre månedslønn, 2. Endre skatteprosent, 3. Skriv ut info, 4. Avslutt");
            Scanner tallInput = new Scanner(System.in);
            tall = Integer.parseInt(tallInput.nextLine());

            switch (tall) {
                case 1:
                    Scanner månedslønn = new Scanner(System.in);
                    arbTaker.setMånedslønn(Double.parseDouble(månedslønn.nextLine()));
                    System.out.println("Månedslønn er endret til: " + arbTaker.getMånedslønn());
                    break;

                case 2:
                    Scanner skatteprosent = new Scanner(System.in);
                    arbTaker.setSkatteprosent(Double.parseDouble(skatteprosent.nextLine()));
                    System.out.println("Skatteprosenten er endret til: " + arbTaker.getSkatteprosent());
                    break;

                case 3:
                    System.out.println(arbTaker.toString());
                    break;
            }

        }
    }

}
