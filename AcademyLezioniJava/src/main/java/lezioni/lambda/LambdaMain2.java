package lezioni.lambda;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaMain2 {

    public static void main(String[] args) {

        //----Che cos'e' una classe?
        // E' un modello che rappresenta un oggetto reale in java

        //----Che cos'e' un oggetto (in java)?
        // E' l'istanza di una classe

        //----Che cos'e' una classe astratta?
        //E' una classe (astratta) con variabili e metodi comuni (ad altre eventuali classi figlie)

        //---Che cos'e' un'interfaccia?
        //E' (come un) contratto che contiene solo la firma di metodi pubblici e astratti (che successivamente saranno implementati)

//        Quadrato quadrato = new Quadrato();

        //Dichiarazione di una classe anonima

//        FigureGeometricheAbstract figureGeometricheAbstract = new FigureGeometricheAbstract() {
//
//            @Override
//            public double calcoloArea() {
//                return 0;
//            }
//
//            @Override
//            public double calcolaPerimetro() {
//                return 0;
//            }
//        };
//
//        OperazioniInterfacce operazioniInterfacce = new OperazioniInterfacce() {
//
//            @Override
//            public double calcoloArea() {
//                return 0;
//            }
//
//            @Override
//            public double calcolaPerimetro() {
//                return 0;
//            }
//        };

//        System.out.println("Non ci sono errori.");


//        Collection<String> strings = new ArrayList<>();

//        List<String> strings = Arrays.asList("Paolo", "Cicco", "Franco", "Gufo", "Pio");
//
//        for (String s : strings) {
//            System.out.println(s);
//        }
//        strings.forEach(System.out::println); new----------------------------------------------------------
//
//        strings.forEach(s -> System.out.println(s));

        Runnable runnable = () -> {
            System.out.println("Ciao sono una stampa di interfaccia funzioanle(Runnable)");
        };
//
//        runnable.run();
//
//        stampa("Ciao sono una stampa di un metodo");

//        String s1 = "Ciao sono una stampa di un interfaccia funzioanle(Consumer)";
//        Consumer<String> stringConsumer = (String s) -> {
//
//            System.out.println(s);
//
//        };
//        stringConsumer.accept(s1);

        Comparator<Integer> integerComparator = (x, y) -> {
            if (x < y) {
                return -1;
            } else if (x > y) {
                return 7;
            } else {
                return 0;
            }
        };
//
//        int reesult = integerComparator.compare(7, 7);
//        System.out.println(reesult);

        Function<Integer, String> converter = (num) -> {
            String result = "";
            for (int i = 0; i < num; i++) {
                result += i;
            }
            return result;
        };

        System.out.println(converter.apply(7));
    }

    private static String stampa(String s) {
        return s;
    }
}
