package main.java.lezioni.test05_05_23;

import java.util.Arrays;

public class Es04 {

        public static void main(String[] args) {
            int[] numeri = {1, 5, 3, 10, 7};
            int[] numeriPari = filtraNumeriPari(numeri);
            int[] numeriDispari = filtraNumeriDispari(numeri);
            System.out.println(Arrays.toString(numeriPari));
            System.out.println(Arrays.toString(numeriDispari));
        }

    public static int[] filtraNumeriPari(int[] numeri) {
        int[] numeriPari = new int[numeri.length];
        int numPariTrovati = 0;
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] % 2 == 0) {
                numeriPari[numPariTrovati] = numeri[i];
                numPariTrovati++;
            }
        }
        return Arrays.copyOf(numeriPari, numPariTrovati);
    }
    public static int[] filtraNumeriDispari(int[] numeri) {
        int[] numeriPari = new int[numeri.length];
        int numPariTrovati = 0;
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] % 2 == 0) {
                numeriPari[numPariTrovati] = numeri[i];
                numPariTrovati++;
            }
        }
        return Arrays.copyOf(numeriPari, numPariTrovati);
    }
}
