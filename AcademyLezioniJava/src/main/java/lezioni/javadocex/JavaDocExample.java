package lezioni.javadocex;

public class JavaDocExample {

    /**
     * oggettoDiTest e' una variabile che mi serve per calcolare la somma ecc ecc
     */
    private static int x = 5;
    //    private static int oggettoDiTest = 5;
    private static int y = 7;


    /**
     * Calcola la somma di due numeri interi
     *
     * @param 'x' il primo numero intero
     * @param 'y' il secondo numero intero
     * @return la somma di x + y
     */
    public static int sum() {
        return x + y;
    }


    /**
     * Stampa solo quando l'operazione e' stata completata
     */
    public static void test() {
        System.out.println("Operazione completata!");
    }

    //TODO aggiungi gli altri esempi dagli appunti
    public static void main(String[] args) {
        System.out.println(sum());
        test();
    }
}
