package lezioni.esercizi0405;

import java.util.Scanner;

public class Es03_v1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Lettura dell'array dall'utente
            System.out.print("Inserisci il numero di elementi dell'array: ");
            int n = input.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Inserisci l'elemento " + (i+1) + ": ");
                array[i] = input.nextInt();
            }

            // Calcolo della media
            int somma = 0;
            for (int valore : array) {
                somma += valore;
            }
            int media = somma / n;
            System.out.println("La media dei valori dell'array è " + media);

            // Calcolo del valore massimo e minimo dell'array
            int massimo = array[0];
            int minimo = array[0];
            for (int i = 1; i < n; i++) {
                if (array[i] > massimo) {
                    massimo = array[i];
                }
                if (array[i] < minimo) {
                    minimo = array[i];
                }
            }
            System.out.println("Il valore massimo dell'array è " + massimo);
            System.out.println("Il valore minimo dell'array è " + minimo);

            input.close();
        }
    }