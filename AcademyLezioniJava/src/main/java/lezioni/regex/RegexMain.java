package main.java.lezioni.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

    /*
        Espressioni regolari:
        -Sono una sequenza di caratteri speciali
        -vengono utilizzate per la manipolazione delle stringhe

        In generale possiamo trovare l'utilizzo delle Regex in diversi casi d'uso:
        -Convalidare una stringa (o input)
        -Estrarre dei dati
        -Sostituire un testo
        -Confronto e ricerca di una corrispondenza

        Sintassi:

        Backslash escape:
            "\" (backslash): Per utilizzare un carattere speciale come un carattere letterale, è necessario precederlo con un backslash. Ad esempio, "\." corrisponde a un punto letterale invece di qualsiasi carattere.
            "\." (punto): rappresenta il carattere del punto. Poiché il punto è un metacarattere speciale che corrisponde a qualsiasi carattere, dobbiamo usarne due ("") per rappresentare un punto letterale.
            "\[" e "\]" (parentesi quadre): rappresentano le parentesi quadre. Anche le parentesi quadre sono caratteri speciali nella regex e richiedono l'uso del backslash per rappresentarle letteralmente.
            "\\" (barra rovesciata): rappresenta il carattere della barra rovesciata. Poiché la barra rovesciata è un carattere di escape nella regex, dobbiamo usarne due per rappresentare una singola barra rovesciata letterale.

        -Metacaratteri: sono caratteri speciali che hanno un determinato significato all'interno di una Regex

            1. "." (PUNTO): corrisponde a qualsiasi carattere (tranne quelli in una nuova riga)
            2. " ^ " (apice)  rappresenta l'inizio di una stringa
            3. "$"  corrisponde alla fine di una stringa.
            4. \d corrisponde a un singolo carattere numerico.
            5. \w corrisponde a un carattere alfanumerico.
            6. \s corrisponde a uno spazio vuoto.
            7. \t rappresenta una tabulazione. corrisponde all'inserimento di uno spazio di larghezza variabile fino al raggiungimento della prossima posizione di tabulazione

            "\b" (parola intera): Corrisponde a una parola intera all'interno di un testo.
            "\B" (non parola intera): Corrisponde a una posizione nel testo che non è seguita o preceduta da una parola intera.
            "\A" (inizio di input): Corrisponde all'inizio del testo di input.
            "\Z" (fine di input): Corrisponde alla fine del testo di input, escluso un possibile carattere di nuova riga finale.
            "(?=" (lookahead): è un'asserzione positiva anticipata. Consente di specificare una condizione che deve essere soddisfatta senza effettuare un consumo effettivo di caratteri nella stringa.

        -Quantificatori: specificano il numero di volte che un determinato elemento può apparire
            1. * da zero a n occorrenze di un elemento precedente
            2. + da una a n occorrenze dell'elemento precedente
            3. ? da zero a uno occorrenze dell'elemento precedente
            4. {n} accetta n occorrenze dell'elemento precedente

            [a-z]  corrisponde a qualsiasi carattere minuscolo compreso tra "a" e "z"
            [abc]  corrisponde a uno qualsiasi dei caratteri "a", "b" o "c".
            [0-9] corrisponde a qualsiasi carattere numerico.

        Modificatori:
            "i" (case-insensitive): Rende la Regex insensibile alle maiuscole/minuscole. Ad esempio, "gatto" corrisponderà sia a "gatto" che a "GATTO".
            "m" (multiline): Abilita la corrispondenza multilinea. Ad esempio, "^testo$" corrisponderà a una riga di testo iniziante e terminante con "testo".
            "s" (dotall): Fa sì che il punto corrisponda anche ai caratteri di nuova riga. In altre parole, il punto corrisponderà a qualsiasi carattere.v
            "(?i)" (ignore case): è un modificatore che consente di ignorare le differenze tra maiuscole e minuscole nelle corrispondenze. Ad esempio, "(?i)apple" troverà sia "apple" che "Apple".
            "(?s)" (dotall): è un modificatore che fa sì che il metacarattere "." corrisponda anche ai caratteri di nuova riga.

        Modificatori di quantificatori:
            "?" (non avido): Rende il quantificatore non avido, cercando di corrispondere al numero minimo possibile di occorrenze. Ad esempio, "a+?" corrisponde a "a" e "aa", ma non a "aaa".
            "(?=pattern)" (positive lookahead): Cerca una corrispondenza solo se è seguita da un determinato pattern. Ad esempio, "Java(?=\s+\d)" corrisponde a "Java" solo se è seguita da uno o più spazi e un numero.
            "(?!pattern)" (negative lookahead): Cerca una corrispondenza solo se non è seguita da un determinato pattern. Ad esempio, "Java(?!Script)" corrisponde a "Java" solo se non è seguita dalla parola "Script".
            "{1,3}" (intervallo di quantificatore): specifica un intervallo di ripetizioni. Ad esempio, "o{1,3}" corrisponde a "o", "oo" o "ooo".
            "{2,4}" (intervallo di quantificatore): specifica un intervallo di ripetizioni. Ad esempio, "\d{2,4}" corrisponde a sequenze di numeri con 2, 3 o 4 cifre.
            "{2,}" (quantificatore con una quantità minima): specifica un quantificatore con una quantità minima di ripetizioni. Ad esempio, "\w{2,}" corrisponde a parole con almeno 2 lettere.

        Operatori logici
            "|" (barra verticale): Corrisponde a uno dei due pattern specificati. Ad esempio, "gatto|cane" corrisponde a "gatto" o "cane".
            "()" (parentesi tonde): Raggruppa un insieme di espressioni regolari e applica operatori su di esse come un unico blocco. Ad esempio, "(abc)+" corrisponde a una o più occorrenze del pattern "abc".
            ".*" (punto asterisco): rappresenta una sequenza di zero o più caratteri. Ad esempio, "a.*e" corrisponde a una parola che contiene la lettera "a" seguita da qualsiasi numero di caratteri e poi la lettera "e".
     */
    public static void main(String[] args) {

        String regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\\\.[a-zA-Z]{3}$";
        String regex2 = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String email = "tizio_caio77@provami.com";
        boolean isValid = email.matches(regex2);
        System.out.println("Indirizzo valido: " + isValid);
        System.out.println(email);


//        Primo Eserizio
//        Validare un Dato un numero di cellulare in input

        String numeroUtente = "333-1234-222";

        String regex1 = "^[0-9]{3}-[0-9]{4}-[0-9]{3}$";
        boolean b = numeroUtente.matches(regex1);
        System.out.println(b);

        String stringaUtente = "Ciao sono Gino, questo e' il mio numero: 333-1234-222 e 444-5678-111 oppure 321-2229-564";

        String regex3 = "\\b\\d{3}-\\d{4}-\\d{3}";

        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(stringaUtente);

        while (matcher.find()) {
            System.out.println("Il numero di Gino e': " + matcher.group());
        }

        String text = "Solo Lettere";
        String regex4 = "^[a-zA-Z]+$"; // Regex per controllare se la stringa contiene solo caratteri alfabetici
        boolean containsOnlyLetters = text.matches(regex4); // Verifica se la stringa corrisponde alla regex

        System.out.println("La stringa contiene solo lettere? " + containsOnlyLetters);

        String text5 = "La somma dei numeri 2, 5 e 10 è 17.";
        String regex5 = "\\d+"; // Regex per trovare uno o più numeri consecutivi
        Pattern pattern2 = Pattern.compile(regex5); // Compila il pattern regex
        Matcher matcher2 = pattern2.matcher(text5); // Crea un oggetto Matcher basato sul pattern e sul testo

        int sum = 0;
        while (matcher2.find()) {
            int number = Integer.parseInt(matcher2.group()); // Ottiene il numero come stringa e lo converte in intero
            sum += number; // Aggiunge il numero alla somma totale
        System.out.println("numeri è: " + number);
        }

        System.out.println("La somma dei numeri è: " + sum);

        String text6 = "Visita il nostro sito web all'indirizzo: www.example.com o www.eccomi.it";
        String regex6 = "\\bwww\\.[a-zA-Z0-9]+\\.[a-zA-Z]{2,}"; // Trova URL che iniziano con "www."
        Pattern pattern3 = Pattern.compile(regex6);
        Matcher matcher3 = pattern3.matcher(text6);

        while (matcher3.find()) {
            System.out.println("URL trovato: " + matcher3.group());
        }


        String text7 = "Questo è uno esempio di parole diu lunghezza diverse.";
        String regex7 = "\\b\\w{3}\\b"; // Trova parole di lunghezza 3
        Pattern pattern4 = Pattern.compile(regex7);
        Matcher matcher4 = pattern4.matcher(text7);

        while (matcher4.find()) {
            System.out.println("Parola trovata: " + matcher4.group());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password valida");
        } else {
            System.out.println("Password non valida");
        }
    }

    public static boolean isValidPassword(String password) {
        // Espressione regolare per la convalida della password
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

        return password.matches(regex);
    }
}