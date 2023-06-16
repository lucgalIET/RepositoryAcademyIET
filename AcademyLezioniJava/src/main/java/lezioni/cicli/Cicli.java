package lezioni.cicli;

public class Cicli {


    public static void main(String[] args) {

//        Cicli / costrutttori iterativi

        //ciclo for
        //stampo a video l'idice 'int i' fino a <=10
        //incrementandolo di 1 ad ogni iterazione
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //ciclo for
        //stampo a video l'idice 'int i' fino a >=0
        //decrementandolo di 1 ad ogni iterazione
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }


        //ciclo for
        //stampo a video l'idice 'int i' fino al numero 'num=7"
        //incrementandolo di 1 ad ogni iterazione
        int num = 7;
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

        //ciclo for
        //stampo l'indice solo quando sara' 7
        for (int i = 10; i >= 0; i--) {
            if (i == 7) {
                System.out.println(i);
            }
        }

        //ciclo while
        //stampo a video il numero 'int z = 10'
        //decrementandolo di 1 ad ogni iterazione
        int z = 10;
        while (z >= 0) {

            z--;                    //in questo caso non stampero' a video il numero 10
            System.out.println(z);  //dato che l'istruzione di decremento viene eseguita prima della stampa
        }


        //ciclo while
        //stampo a video il numero 'int x = 0'
        //incrementandolo di 1 ad ogni iterazione
        int x = 0;
        do {

            System.out.println(x);  //in questo caso stampero' a video anche il numero 0
            x++;                    //dato che l'istruzione di incremento viene eseguita dopo la stampa

        } while (x <= 10);


        //ciclo while
        //voglio stampare a video solo il numero 7
        int b = 0;
        boolean isTrue = false;
        do {

            b++;                //incremento
            if (b == 7) {       //controllo
                System.out.println(b);
                isTrue = true;
            }

        } while (!isTrue);      //il ciclo continuera' fin quando la variabile isTrue sara' = false

    }
}
