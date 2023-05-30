package main.java.lezioni.setmap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EsSetMap {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Ciao");
        lista.add("Hola");
        lista.add("Estabien");
        lista.add("Hi");
        System.out.println(lista);

        reset(lista);

        System.out.println(lista);
    }

    public static void reset(List<String> list) {
        list = new LinkedList<>();
        list.add("Hello");
    }
}
