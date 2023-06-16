package lezioni.arraytest;

public class TpDatoArray {

    public static void main(String[] args) {

        //dichiarazione ed inizializzazione di
        // un array di interi 'num' di 5 elementi
        int[] num = new int[5];
        int[] num1 = new int[]{7, 14, 22, 8, 9};

        //dichiarazione ed inizializzazione di
        //un array di stringhe di 5 elementi
        String[] parole = new String[5];
        String[] parole1 = new String[]{"sole", "cuore", "amore"};


        //cicliamo un array di interi 'num2' che contiene numeri da 1 a 10
        //e stampiamo il risultato (tutti i num da 0 a 10)

        //l'indice di un array parte da 0 (zero)

//                     indice: 0,1,2,3,4,5,6,7,8, 9
        int[] num2 = new int[]{1,2,3,4,5,6,7,8,9,10};

//                        indice: 0,1, 2, 3, 4, 5, 6,  7, 8, 9
        int[] numeri = new int[]{34,44,56,21,67,88,667,1,30,10};

        for (int i = 0; i < numeri.length; i++ ) {

            System.out.println(numeri[i]);
        }
    }

}
