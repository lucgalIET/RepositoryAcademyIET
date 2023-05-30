package main.java.lezioni.conditionalstatement;

import java.util.Scanner;

public class ConditionalStatement2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserire un numero: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Il numero e' positivo!");
            System.out.println("Il numero " + numero + " e' positivo!");

        } else if (numero < 0) {
            System.out.println("Il numero e' negativo!");

        } else {

            System.out.println("Il numero e' uguale a zero!");
        }
    }
}
