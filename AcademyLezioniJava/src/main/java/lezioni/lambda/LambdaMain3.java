package main.java.lezioni.lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class LambdaMain3 {

    public static void main(String[] args) {
        //variable capturing
        //per poter utilizzare una variabile esterna in una lambda, questa deve essere finalo o effectively final = ufficiosamente final ovvero che non subisce modifiche nel codice

        List<String> listaStringhe = Arrays.asList("acqua", "pane", "latte", "Avocado");

        listaStringhe = new LinkedList<>(listaStringhe);
        Iterator<String> stringIterator = listaStringhe.iterator();

        Function<List<String>, List<String>> function = (stringList) -> {
            while (stringIterator.hasNext()) {
                String next = stringIterator.next();
                if (!next.startsWith("a") && !next.startsWith("A")) {
                    stringIterator.remove();
                }
            }
            return stringList;
//            return listaStringhe; //listaStringhe dovrebbe essere final o effectively final
        };
        System.out.println(function.apply(listaStringhe));

//        metodo();

        //closure
//        Operazioni somma = (x, y) -> System.out.println(x + y);

        int number = 10; // Variabile locale esterna

        // Definizione della closure
        Runnable closure = () -> System.out.println("Number: " + number); // Accesso alla variabile locale catturata

        closure.run(); // Esecuzione della closure

//        Modifica della variabile locale esterna
//        number = 20;

        closure.run(); // La closure utilizza il valore aggiornato della variabile locale
    }

    //variable capturing

    public static void metodo() {
        final int x = 5;

//        Runnable runnable = () -> System.out.println("Questo e' il mio valore: " + x++);
        Runnable runnable = () -> {
            int y = 7;
            System.out.println("Questo e' il mio valore: " + y++);
        };
        runnable.run();
    }
}
