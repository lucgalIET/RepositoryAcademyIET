package lezioni.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        //pipeline
        //.stream().forEach(System.out::println)

//        .stream().forEach(Collectors.toList().supplier());

        //operazioni intermedie

        //operazione terminali

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        integers.stream().forEach(System.out::println);
        stampaPari(integers);

        System.out.println("-----------------------------------------");

        integers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("-----------------------------------------");

        integers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .forEach(System.out::println);


        class Persona {
            private String nome;
            private int eta;

            public int getEta() {
                return eta;
            }

            public Persona(String nome, int eta) {
                this.nome=nome;
                this.eta=eta;
            }
            // costruttore, getter, setter

            @Override
            public String toString() {
                return nome + " (" + eta + ")";
            }
        }

        List<Persona> persone = Arrays.asList(
        new Persona("Alice", 25),
                new Persona("Bob", 30),
                new Persona("Charlie", 25)
        );

        Map<Integer, List<Persona>> personePerEta = persone.stream()
                .collect(Collectors.groupingBy(Persona::getEta));

        System.out.println(personePerEta);
    }

    public static void stampaPari(List<Integer> integers) {
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
    }

}
