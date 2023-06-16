package lezioni.complessita;

public class Ricorsione {

    public static void main(String[] args) {

        int i = 5;
//        System.out.println("Il risultato del numero fattoriale e': " + fattorialeRicorsivo(i));
        System.out.println("Il risultato del numero fattoriale con la tail recursion e': " + fattoriale(i));

    }

    //ricorsione
//    public static int fattorialeRicorsivo(int n) {
//        //(via d'uscita) caso base: se n e' = 0 || 1 , ritorno 1
//        if (n == 0 || n == 1)
//            return 1;
//
//        //chiamata ricorsiva
//        return n * fattorialeRicorsivo(n -1);
//    }

    //tail recursion
    public static int fattoriale(int n) {
        return fattorialeImpl(n, 1);
    }

    public static int fattorialeImpl(int n, int result) {
        //caso base
        if (n ==0)
            return result;

        //chiamata ricorsiva in coda: n = nuovo parametro, results = risultato (della moltiplicazione)
        return fattorialeImpl(n -1, n * result);
    }
}