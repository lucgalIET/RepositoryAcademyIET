package main.java.lezioni.test05_05_23;

public class Es02 {

            public static void main(String[] args) {
                int[] numeri = {1, 5, 3, 10, 7};
                int numeroMaggiore = trovaNumeroMaggiore(numeri);
                System.out.println(numeroMaggiore);
            }

    public static int trovaNumeroMaggiore(int[] numeri) {
        int numeroMaggiore = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > numeroMaggiore) {
                numeroMaggiore = numeri[i];
            }
        }
        return numeroMaggiore;
    }
}
