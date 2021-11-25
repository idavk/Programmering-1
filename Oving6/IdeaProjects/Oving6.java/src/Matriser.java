public class Matriser {
    private final int M; // Antall rader i matrisen
    private final int N; // Antall kolonner i matrisen
    private int[][] data; // Sier at vi har en M-til-N matrise.

    // Lager konsturktøren:
    public Matriser(int M, int N) {
        this.M = M;
        this.N = N;
        this.data = new int[M][N];
    }

    public Matriser(int[][] matriser){
        this.M = matriser.length;
        this.N = matriser[0].length;
        this.data = matriser;
    }

    // Lager getere og setere:
    public int getM() {
        return M;
    }

    public int getN() {
        return N;
    }

    public int[][] getData() {
        return data;
    }

    public int getVerdi(int i, int j){
        return data[i][j];
    }

    private void setVerdi(int i, int j, int verdi){
        data[i][j] = verdi;
    }

    // Metodene for å regne sammen ulike matriser:
    public Matriser addere(Matriser B){
        if(B.getM() != M || B.getN() != N){
            throw new IllegalArgumentException("Må ha like store matriser");
        } // Lager et ulovlig argument for at matrisenen må være like store.
        Matriser C= new Matriser(M, N);
        for(int i= 0; i < M; i++){
            for(int j = 0; j < N; j++){
                C.setVerdi(i, j,getVerdi(i, j) + B.getVerdi(i, j) );

            } // Metoden for å addere to matriser sammen
        }
        return C;
    }

    public Matriser gange(Matriser B){
        if(B.getM() != this.N){
            throw new IllegalArgumentException("N-kolonner i Matrise A må være lik M-rader i Matrise B");
        } // Lager ulovlig argument for at matrisene skal stemme overens med hevrandre for å kunne gange de sammen.
        Matriser D= new Matriser(this.M, this.N);
        for(int i = 0; i < M; i++){
            for(int j = 0; j < B.getN(); j++){
                for(int k = 0; k < N; k++){
                    int verdi = D.getVerdi(i, j) + getVerdi(i, k) * B.getVerdi(k, j);
                    D.setVerdi(i, j, verdi);
                }
            }
        } // Lager metoden for å kunne gange sammen to matriser. Da må jeg bruke tre for-loops i hverandre.
        return D;

    }
    public Matriser transponerer(){
        Matriser E = new Matriser(this.N, this.M);
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                E.setVerdi(j, i, getVerdi(i, j));
            }
        } // Lager metoden for å transponere matriser:
        return E;
    }

    public String printemetode(){
        String s = "";
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                s += getVerdi(i, j) + " ";
            }
            s += "\n";

        } // En String som forteller hvordan det skal bli printet ut.
        return s;
    }

    public static void main(String[] args){
        int[][] m1 = {{5,6, 7}, {3,4, 8}, {9,2, 3}};
        Matriser data = new Matriser(m1);
        int[][] m2 = {{3, 5, 6}, {2, 9, 7}, {1, 4, 5}};
        Matriser data2 = new Matriser(m2);
        Matriser plusse = data.addere(data2);
        Matriser gange = data.gange(data2);
        Matriser transponere = data.transponerer();
        System.out.println("A+B= \n" + plusse.printemetode());
        System.out.println("A*B= \n" + gange.printemetode());
        System.out.println("Transponerer: \n" +transponere.printemetode());

    }
}






