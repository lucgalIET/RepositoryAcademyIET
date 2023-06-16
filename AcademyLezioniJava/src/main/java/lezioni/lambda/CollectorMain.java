package lezioni.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorMain {

    public static void main(String[] args) {

        List<Persona> persone = Arrays.asList(
                new Persona("Ciccio", 12),
                new Persona("Pluto", 22),
                new Persona("Papero", 47),
                new Persona("Melone", 77),
                new Persona("Ciliegie", 34),
                new Persona("Fragole", 45),
                new Persona("GiacomoGiacomo", 23),
                new Persona("Franco", 55),
                new Persona("Paolo", 44),
                new Persona("Sonia", 27),
                new Persona("Zelda", 21)
        );

        List<Persona> personeEmpty = new ArrayList<>();


        //toMap() serve per raccogliere elementi in una mappa
        Map<String, Integer> nomiEtaPersone = persone.stream().collect(Collectors.toMap(Persona::getNome, Persona::getEta));
        System.out.println(nomiEtaPersone);
        // estrazione dati da una List e creazione e inserimento dei dai di persone in una nuova mappa
        System.out.println("\n");

        //joining() viene utilizzato per unire gli elementi di persone utilizzando la method reference
        String nomiJoined = persone.stream().map(Persona::getNome).collect(Collectors.joining(", "));
        System.out.println(nomiJoined);
        // inserisce i dati di persone in un unica stringa utilizzando un dilimitatore
        System.out.println("\n");

        //counting() ritorna il totale degli elementi (long) dello strem che rispettalo la condizione nel .filter()
        long count = persone.stream().filter(persona -> persona.getEta() > 30).collect(Collectors.counting());
        System.out.println(count);

        //toList
        System.out.println("\n");
        List<Persona> personeTrenta = persone.stream().filter(persona -> persona.getEta() > 30).collect(Collectors.toList());
        System.out.println(personeTrenta);

        System.out.println("\n");

        //Optional:
        //l'idea principale di Optional è quella di evitare la presenza di valori nulli in modo esplicito, fornendo una soluzione più sicura
        //Optional può essere considerato come un contenitore per un valore opzionale
        //può contenere un valore non nullo che rappresenta il caso in cui il valore è presente, o può essere vuoto, indicando che il valore non è presente

        //avarege()
        double mediaEta = persone.stream().mapToDouble(Persona::getEta).average().orElse(0.0);
        System.out.println(mediaEta);

        System.out.println("\n");
        double mediaEtaEmpty = personeEmpty.stream().mapToDouble(Persona::getEta).average().orElse(0.0);
        System.out.println(mediaEtaEmpty);

        //maxBy(), minBy(): vengono utilizzati per trovare il massimo o il minimo valore in uno stream, utilizzando un comparatore specifico
        Optional<Persona> optionalPersona = persone.stream().collect(Collectors.maxBy(Comparator.comparingInt(Persona::getEta)));
        System.out.println(optionalPersona);


    }
}
