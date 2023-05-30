package main.java.lezioni.esercizi0405;

import java.util.Scanner;

public class Es02_v1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean continua = true;

        while (continua) {

            System.out.print("Inserisci il primo numero: ");
            int num1 = input.nextInt();

            System.out.print("Inserisci il secondo numero: ");
            int num2 = input.nextInt();

            System.out.print("Inserisci il tipo di operazione (+, -, *, /): ");
            String operazione = input.next();

            int risultato;

            switch (operazione) {
                case "+":
                    risultato = num1 + num2;
                    break;
                case "-":
                    risultato = num1 - num2;
                    break;
                case "*":
                    risultato = num1 * num2;
                    break;
                case "/":
                    risultato = num1 / num2;
                    break;
                default:
                    System.out.println("Operazione non valida.");
                    continue;
            }

            System.out.println("Il risultato dell'operazione " + num1 + " " + operazione + " " + num2 + " è: " + risultato);

            System.out.print("Vuoi continuare ad eseguire operazioni? (Sì/No) ");
            String risposta = input.next();

            if (risposta.equalsIgnoreCase("no")) {
                continua = false;
            }
        }

        System.out.println("Programma terminato.");
    }
}