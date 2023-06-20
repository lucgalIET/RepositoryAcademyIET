package main.java.lezioni;

public class TipoDatoStringa {


    public static void main(String[] args) {

        int sonoUnNumero = 7;
        double num = 8.90909;

        String sonoUnaStringa = "Ciao. Inserisci un numero: ";
        String sonoLaSecondaStringa = "";

//        System.out.println(sonoUnaStringa + sonoUnNumero + num);
        System.out.println(sonoUnaStringa + sonoLaSecondaStringa);

        // + concatena 2 o piu stringhe

//        sonoUnaStringa.length();

        //ctrl + click entro in lenght() per leggere la documentazione
//        sonoUnaStringa.isEmpty();

//        System.out.println(sonoLaSecondaStringa.length());


        if (sonoUnaStringa.isEmpty()) {
            System.out.println("La stringa sonoUnaStringa e' vuota!");
        } else {
            System.out.println("La stringa sonoUnaStringa contiene: "  + sonoUnaStringa);
        }

        if (sonoUnaStringa.length() > 0) {
            System.out.println("La stringa sonoUnaStringa contiene: "  + sonoUnaStringa);
        }
    }
}
