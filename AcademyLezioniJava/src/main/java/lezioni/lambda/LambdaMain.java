package main.java.lezioni.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaMain {

    private String getName;
    private int eta;

    public LambdaMain(String getName, int eta) {
        this.getName = getName;
        this.eta = eta;
    }

    public static void main(String[] args) {

        Calcolatrice calcolatrice = new Calcolatrice();

        //classe anonima
//        Operazioni somma = new Operazioni() {
//            @Override
//            public int esegui(int x, int y) {
//                return 7 + 3;
//            }
//        };

//        Operazioni somma = (x, y) -> x + y;
//        System.out.println(somma);
//        somma.esegui2(7,3);

//        Operazioni somma = (x, y) -> System.out.println(x + y);


        Operazioni stampa = () -> System.out.println("Ciao sono un metodo void in un'espressioone lambda");
        stampa.esegui3();


//        Operazioni comparazione = (x, y) -> {
//            if (x < y) {
//                System.out.println("Sei piccolo");
//            } else if (x > y) {
//                System.out.println("Sei grande");
//            } else {
//                System.out.println("Riprova");
//            }
//        };

//        comparazione.esegui2(7,3);


//        classe anonima
//        Operazioni moltiplicazione = new Operazioni() {
//            @Override
//            public int esegui(int x, int y) {
//                return 0;
//            }
//        };

//        Operazioni moltiplicazione = () -> x * y;
//
//
//        Consumer: (args) -> { void }
//        Supplier: () -> { return T}
//        Function: (args) -> {return T}
//
//        Runnable: () -> {void}


        List<String> strings = Arrays.asList("abc", "cde", "fgh");
        for (String s : strings) {
        }
        strings.forEach(s -> System.out.println(s));

        strings.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> numberPrinter = (num) -> System.out.println(num);
//        Consumer<Integer> numberPrinter = (num) -> System.out.println(num=+num);

        numbers.forEach(numberPrinter);

        List<String> strings2 = Arrays.asList("Apple", "Banana", "Avocado", "Orange");


        Consumer<String> stringPrinter = (str) -> {
            if (str.startsWith("A")) {
                System.out.println(str);
            }
        };

        strings2.forEach(stringPrinter);
    }
}
