package lezioni.arraytest;

import java.util.ArrayList;

public class ListEsercizio {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("gatto");
        lista.add("cane");
        lista.add("cane");
        lista.add("uccello");

        lista.remove(1);
        lista.remove("cane");
    }
}
