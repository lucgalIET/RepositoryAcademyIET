package lezioni.tipigenerici.differenzaclassi;

import lezioni.tipigenerici.Contenitore;

public class Generics {

    public static void main(String[] args) {

        //Classe specifica
        Automobile ferrari = new Automobile("Ferarri rossa");
        String marca = ferrari.getMarca();
        System.out.println("La marca della mia auto e': " + marca);

        //Classe generica
        Contenitore<String> contenitore = new Contenitore<>("Stringa");
        String oggetto = contenitore.getOggetto();
        System.out.println("Questo oggetto e' : " + oggetto);

        Contenitore<Integer> contenitore1 = new Contenitore<>(7);
        int valore = contenitore1.getOggetto();
        System.out.println("Questo oggetto e' : " + valore);

        System.out.println("----------------------------------");

        Contenitore<Automobile> concessionario = new Contenitore<>(ferrari);

        concessionario.getOggetto().setMarca("Smart verde");
        String marcaAuto = concessionario.getOggetto().getMarca();

        System.out.println(marcaAuto);
        System.out.println(concessionario.getOggetto().getMarca());
    }
}
