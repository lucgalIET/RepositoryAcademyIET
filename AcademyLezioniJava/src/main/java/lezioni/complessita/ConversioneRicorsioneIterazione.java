package lezioni.complessita;

public class ConversioneRicorsioneIterazione {

    public static void main(String[] args) {
        System.out.println(fattorialeRicorsivo(5));
        System.out.println(fattorialeIterativo(5));
    }

    //ricorsione
    public static int fattorialeRicorsivo(int n) {
        //caso base: se n e' = 0 || 1 , ritorno 1
        //(via d'uscita)
        if (n == 0 || n == 1)
            return 1;

        //chiamata ricorsiva
        return n * fattorialeRicorsivo(n -1);
    }

    public static int fattorialeIterativo(int n) {
        int index = 1;
        int result = 1;
        while(index <= n) {
            result *= index;
            index++;
        }
        return result;
    }

//    public static int fattorialeRicorsivo2(int n) {
//        if (n == 0 || n == 1) return 1;
//        return n * fattorialeRicorsivo(n -1);
//    }

    //sono entrambi di complessita' lineare n
}
