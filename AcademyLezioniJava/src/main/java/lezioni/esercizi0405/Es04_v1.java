package main.java.lezioni.esercizi0405;

import java.util.Scanner;

public class Es04_v1 {

    public static void main(String[] args) {
        // Creiamo un array di interi
        int[] numbers = {34, 56, 27, 56, 90, 9};

        // Chiediamo all'utente di inserire l'elemento da cercare
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci l'elemento da cercare: ");
        int target = scanner.nextInt();

        // Cerchiamo l'indice dell'elemento
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        // Stampiamo l'indice trovato (o un messaggio di errore se non è stato trovato)
        if (index != -1) {
            System.out.printf("L'elemento %d si trova all'indice %d\n", target, index);
        } else {
            System.out.printf("L'elemento %d non è presente nell'array\n", target);
        }
    }

}