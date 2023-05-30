package main.java.lezioni.tipigenerici;

/*
naming tipi generici per convenzione
T: tipo generico
E: Elemento di collezione
K: chiave di una mappa
V: valore di una mappa
 */
public class TipiGenereciLezione {

    public static void main(String[] args) {

//        ClasseGenerica<Integer> oggettoGenerico = new ClasseGenerica<>(77);
//
//        Integer valoreOggettoIntero = oggettoGenerico.getValore();
//
//        System.out.println(valoreOggettoIntero);
//
//        ClasseGenerica<String> oggettoGenericoStringa = new ClasseGenerica<>("Ciao sono un oggetto generico di tipo stringa");
//
//        String valoreOggettoStringa = oggettoGenericoStringa.getValore();
//
//        System.out.println(valoreOggettoStringa);


//        Contenitore<String> stringContenitore = new Contenitore<>();
//        stringContenitore.setOggetto("Ciao sono un oggetto stringa!");
//
//        String valoreStringa = stringContenitore.getOggetto();
//
//        System.out.println(valoreStringa);


        ListaGenerica<Integer> listInteri = new ListaGenerica<>();
        listInteri.addElemento(77);
        listInteri.addElemento(33);
        System.out.println(listInteri.getListaElementi());

        ListaGenerica<String> listString = new ListaGenerica<>();
//        ListaGenerica<Double> listString = new ListaGenerica<>();
//        ListaGenerica<Boolean> listString = new ListaGenerica<>();
//        ListaGenerica<Float> listString = new ListaGenerica<>();
//        ListaGenerica<Character> listString = new ListaGenerica<>();

        listString.addElemento("Ciao");
        listString.addElemento("Sono");
        listString.addElemento("Io");
        System.out.println(listString.getListaElementi());


    }
}
