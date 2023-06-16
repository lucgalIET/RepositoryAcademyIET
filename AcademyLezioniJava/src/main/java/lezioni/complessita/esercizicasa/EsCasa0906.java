package lezioni.complessita.esercizicasa;
/*
Scrivere un metodo ricorsivo che, dato un array di interi, restituisca il valore minimo (oppure il valore massimo)
Scrivere un metodo ricorsivo che, dato un array di interi, restituisce la somma degli elementi (oppure altre operazioni)
Scrivere un metodo ricorsivo che, data una matrice a di interi, restituisce la somma della sua diagonale principale
Scrivere un metodo boolean che verifica se un intero è contenuto in un array
Scrivere un programma che restituisca la somma corrispondente alla totalità di numeri dispari (oppure pari)  presenti all’interno di un array

[BONUS] scrivere i rispettivi metodi iterativi
*/

public class EsCasa0906 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Serie di Fibonacci (n = " + n + "):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
//        System.out.print(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
