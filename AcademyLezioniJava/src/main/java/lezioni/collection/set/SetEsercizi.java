package main.java.lezioni.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEsercizi {

    public static void main(String[] args) {
//        Set<String> strings = new HashSet<>();
//
//        strings.add("Ciao");
//        strings.add("Sono");
//        strings.add("io");
//        strings.add("Ciao");
//
//        System.out.println(strings);

        Set<String> alberoSet = new TreeSet<>();
        alberoSet.add("Ciao");
        alberoSet.add("Sono");
        alberoSet.add("io");
        alberoSet.add("Ciao");
        System.out.println(alberoSet);
    }
}
