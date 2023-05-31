package main.java.lezioni.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il testo: ");
        String text = scanner.nextLine();
        System.out.println("Inserisci la stringa da cercare: ");
        String searchString = scanner.nextLine();

        // Definisci il pattern dell'espressione regolare per cercare la stringa nel testo
        String stringRegex = Pattern.quote(searchString);

        // Crea il pattern
        Pattern pattern = Pattern.compile(stringRegex, Pattern.CASE_INSENSITIVE);

        // Crea il matcher per il testo inserito
        Matcher matcher = pattern.matcher(text);

        // Trova le occorrenze della stringa nel testo e stampa le posizioni
        while (matcher.find()) {
            int startPos = matcher.start();
            int endPos = matcher.end();
            System.out.println("Occorrenza trovata alla posizione " + startPos + "-" + (endPos - 1));
        }

    }
}
