package lezioni.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class StampanteLambda {

    public static void main(String[] args) {

        //riferimento ad un metodo statico
        //Classe::metodo
        MethodReference.stampa("Ciao 2");
        stampa("Ciao!");

        //riferimento ad un metodo d'istanza di oggetto specifico (x)
        MethodReference methodReference = new MethodReference();
        methodReference.stampa2("Riferimento ad un metodo d'istanza");

        //riferimento ad metodo di istanza di un oggetto x di un tipo specifico
        //tipo::metodo
        StampanteLambda stampante = new StampanteLambda();
        Consumer<String> stringConsumer = stampante::stampaMaiusc;

        //riferimento ad un metodo statico
        Consumer<String> stringConsumer2 = StampanteLambda::stampa;

        //riferimento ad un costruttore
        //Classe::costruttore
        Supplier<StampanteLambda> stringSupplier = StampanteLambda::new;
        StampanteLambda stampante1 = stringSupplier.get();
        stampante1.stampaMaiusc("Ciao sono qui");

    }

    public void stampaMaiusc(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void stampa(String s) {
        System.out.println(s);
    }
}
