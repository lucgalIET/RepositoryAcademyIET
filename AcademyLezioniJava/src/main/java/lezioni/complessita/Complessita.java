package lezioni.complessita;

import java.util.Arrays;

public class Complessita {

    public static void main(String[] args) {

//        int[] nomeArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        stampaElementi(nomeArray);
//        stampaElemento(nomeArray);
//        System.out.println(ricercaBinaria(nomeArray, 7));

        int[] nomeArray2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(nomeArray2);
        System.out.println(Arrays.toString(nomeArray2));

    }

    //complessita' lineare
    // O(n)
    public static void stampaElementi(int[] elem) {
        for (int i = 0; i < elem.length; i++) {
            System.out.println(elem[i]);
        }
    }

    //complessita costante
    // O(1)
    public static void stampaElemento(int[] elem) {
        System.out.println(elem[7]);
    }

    //complessita logaritmica
    //O(log n)

    public static int ricercaBinaria(int[] elem, int elemToFound) {
        int minimo = 0;
        int massimo = elem.length;

        while (minimo <= massimo) {

            int centro = (minimo + massimo) / 2; // da questa divisione deriva la complessita' log n

            if (elem[centro] == elemToFound)
                return centro;
            else if (elem[centro] < elemToFound)
                minimo = centro + 1;
            else
                massimo = centro - 1;
        }

        return -1;
    }

    //complessita' quadratica
    //O(n^2)

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}