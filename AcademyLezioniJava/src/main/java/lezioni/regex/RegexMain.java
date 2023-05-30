package main.java.lezioni.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

    /*
@ -24,6 +27,8 @@ In generale possiamo trovare l'utilizzo delle Regex in diversi casi d'uso:
        6. \s corrisponde a uno spazio vuoto.
        7. \t rappresenta una tabulazione. corrisponde all'inserimento di uno spazio di larghezza variabile fino al raggiungimento della prossima posizione di tabulazione

        8. \b corrisponde ad una parola intera all'interno di una stringa

        -Quantificatori: specificano il numero di volte che un determinato elemento può apparire

        1. * da zero a n occorrenze di un elemento precedente
@ -38,7 +43,72 @@ In generale possiamo trovare l'utilizzo delle Regex in diversi casi d'uso:
     */
    public static void main(String[] args) {

//        String regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\\\.[a-zA-Z]{3}$";
//        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
//        String email = "tizio_caio77@provami.com";
//        boolean isValid = email.matches(regex);
//        System.out.println("Indirizzo valido: " + isValid);
//        System.out.println(email);


//        Primo Eserizio
//        Validare un Dato un numero di cellulare in input

//        String numeroUtente = "333-1234-222";
//
//        String regex1 = "^[0-9]{3}-[0-9]{4}-[0-9]{3}$";
//        boolean b = numeroUtente.matches(regex1);
//        System.out.println(b);

//        String stringaUtente = "Ciao sono Gino, questo e' il mio numero: 333-1234-222 e 444-5678-111 oppure 321-2229-564";
//
//        String regex2 = "\\b\\d{3}-\\d{4}-\\d{3}";
//
//        Pattern pattern = Pattern.compile(regex2);
//        Matcher matcher = pattern.matcher(stringaUtente);
//
//        while (matcher.find()) {
//            System.out.println("Il numero di Gino e': " + matcher.group());
//        }

//        String text = "Solo Lettere";
//        String regex = "^[a-zA-Z]+$"; // Regex per controllare se la stringa contiene solo caratteri alfabetici
//        boolean containsOnlyLetters = text.matches(regex); // Verifica se la stringa corrisponde alla regex
//
//        System.out.println("La stringa contiene solo lettere? " + containsOnlyLetters);

//        String text = "La somma dei numeri 2, 5 e 10 è 17.";
//        String regex = "\\d+"; // Regex per trovare uno o più numeri consecutivi
//        Pattern pattern = Pattern.compile(regex); // Compila il pattern regex
//        Matcher matcher = pattern.matcher(text); // Crea un oggetto Matcher basato sul pattern e sul testo
//
//        int sum = 0;
//        while (matcher.find()) {
//            int number = Integer.parseInt(matcher.group()); // Ottiene il numero come stringa e lo converte in intero
//            sum += number; // Aggiunge il numero alla somma totale
//        System.out.println("numeri è: " + number);
//        }

//        System.out.println("La somma dei numeri è: " + sum);
//
//        String text = "Visita il nostro sito web all'indirizzo: www.example.com o www.eccomi.it";
//        String regex = "\\bwww\\.[a-zA-Z0-9]+\\.[a-zA-Z]{2,}"; // Trova URL che iniziano con "www."
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(text);
//
//        while (matcher.find()) {
//            System.out.println("URL trovato: " + matcher.group());
//        }



        String text = "Questo è uno esempio di parole diu lunghezza diverse.";
        String regex = "\\b\\w{3}\\b"; // Trova parole di lunghezza 3
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Parola trovata: " + matcher.group());
        }
    }
}