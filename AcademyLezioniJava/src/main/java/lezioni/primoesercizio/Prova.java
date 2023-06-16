package lezioni.primoesercizio;


//public static main
//        è l'entry point del tuo programma java. deve essere dichiarato obbligatoriamente con un parametro di tipo array di stringhe. Esempio
//
//        codice:
//public static main(String[] parametri)
//        come vedi dall'esempio il nome di tale array nn deve essere necessariamente args.
//        Questa variabile contiene tutti i parametri che tu passi a riga di comando quando richiami il programma. Esempio se tu scrivi la classe

import java.util.Scanner;

public class Prova {

    public static void main(String[] parametri) {
//        System.out.println(parametri[0]);


        Scanner in = new Scanner(System.in);

        String st, s1;
        System.out.print("frase:");
        st = in.nextLine();
        System.out.print("sottostringa da cercare:");
        s1 = in.nextLine();
        System.out.println(occorrenze(st, s1));
        in.close();
    }

    public static int occorrenze(String st, String s1) {
        int sum = 0;
        int i = 0;
        int x = 0;
        do {
            x = st.indexOf(s1, i);

            if (x != -1) {
                sum++;
                i = x + 1;
            }
        } while (x != -1);
        return sum;
    }


}

