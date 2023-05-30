package main.java.lezioni.collection.hashmap;

import main.java.lezioni.distributore_10_05.Prodotto;

import java.util.HashMap;

public class HashMapEsercizio {

    public static void main(String[] args) {

        HashMap<Integer,Integer> interi = new HashMap<>();

        interi.put(1,1);
        interi.put(2,2);


        HashMap<Integer, Prodotto> prodotti = new HashMap<>();
        prodotti.put(1,new Prodotto("Shampoo", 2.50, "CCC", 7));
        prodotti.put(2,new Prodotto("Sapone", 1.20, "XXX", 7));
        prodotti.put(3,new Prodotto("Maschera", 7.80, "DDD", 7));
        System.out.println(prodotti);

        //      chiave,valore
        HashMap<String,String> mappaCapitali = new HashMap<>();

        mappaCapitali.put("Italia", "Roma");
        mappaCapitali.put("Germania", "Berlino");
        mappaCapitali.put("Inghilterra", "Londra");
        mappaCapitali.put("Francia", "Parigi");

        System.out.println(mappaCapitali);

        mappaCapitali.remove("Francia");
        System.out.println(mappaCapitali);

        mappaCapitali.clear();
        System.out.println(mappaCapitali);



        HashMap<Integer, String> chiaveValore = new HashMap<>();

        chiaveValore.put(1,"PrimoElemento");
        chiaveValore.put(2,"SecondoElemento");
        chiaveValore.put(3,"TerzoElemento");
        chiaveValore.put(4,"QuartoElemento");

    }
}
