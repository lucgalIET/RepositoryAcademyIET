package lezioni.lambda;

public class Stampante2 {

    //closure

    public static void main(String[] args) {
        int numeroCopieBn = 7;
        int numeroCopieCl = 5;

        calcolaStampe(numeroCopieBn, valore -> System.out.println("Il numero di stampe: " + valore));
    }

    public static void calcolaStampe(int x, Stampante stampante) {
        stampante.stampa(x);
    }

    interface Stampante {
        void stampa(int i);
    }
}
