package lezioni.tipigenerici.differenzaclassi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class GnenericsMap {

    public static void main(String[] args) {

        ClasseGenericaMap<String, Integer> mappaGenerica = new ClasseGenericaMap<>(new LinkedHashMap<>());

        Map<Integer, String> mappaTest = new TreeMap<>();
//        mappTest.


        //creare una mappa e stamparla in ordine di creazione degli elementi
        mappaGenerica.aggiungiElemento("Paolo", 7);
        mappaGenerica.aggiungiElemento("Franco", 28);
        mappaGenerica.aggiungiElemento("Ciccio", 90);
        mappaGenerica.aggiungiElemento("Pluto", 77);
        mappaGenerica.aggiungiElemento("Ciao", 11);


//        mappaGenerica.stampaHashCodeList();

//        System.out.println("Valore associato a Paolo: " + mappaGenerica.getValoreElemento("Paolo"));
//
//        boolean contieneCiccio = mappaGenerica.isPresent("Ciccio");
//        System.out.println(contieneCiccio);

//        System.out.println("Stampa il contenuto della mappa: \n");
        mappaGenerica.stampaMappa();


    }
}
