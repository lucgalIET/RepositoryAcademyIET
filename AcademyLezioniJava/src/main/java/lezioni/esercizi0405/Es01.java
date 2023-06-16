package lezioni.esercizi0405;

import java.util.Scanner;

public class Es01 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = 0;
            int sumLength = 0;
            int consecCount = 0;
            while (true) {
                System.out.print("Inserisci una stringa (stringa vuota per terminare): ");
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    break;
                }
                boolean containsDigit = false;
                for (int i = 0; i < input.length(); i++) {
                    if (Character.isDigit(input.charAt(i))) {
                        System.out.println("Errore: non puoi inserire numeri.");
                        containsDigit = true;
                        break;
                    }
                }
                if (containsDigit) {
                    count = 0;
                    consecCount = 0;
                    continue;
                }
                count++;
                sumLength += input.length();
                consecCount++;
                if (consecCount == 3) {
                    int averageLength = sumLength / count;
                    System.out.println("Lunghezza media delle ultime tre stringhe inserite: " + averageLength);
                    count = 0;
                    sumLength = 0;
                    consecCount = 0;
                }
            }
            System.out.println("Hai inserito " + count + " stringhe.");
            if (count > 0) {
                int averageLength = sumLength / count;
                System.out.println("Lunghezza media delle ultime " + count + " stringhe inserite: " + averageLength);
            }
            scanner.close();
        }
    }
