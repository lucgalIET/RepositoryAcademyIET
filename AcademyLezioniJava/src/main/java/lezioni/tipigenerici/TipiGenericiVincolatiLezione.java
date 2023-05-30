package main.java.lezioni.tipigenerici;

public class TipiGenericiVincolatiLezione {

    public static void main(String[] args) {


        ClasseGenericaVincolata<Integer> oggettoGenericaVincolata = new ClasseGenericaVincolata<>(77);
        Integer valore = oggettoGenericaVincolata.getValoreVincolato();

        System.out.println(valore);

//        ClasseGenericaVincolata<Double> classeGenericaVincolata = new ClasseGenericaVincolata<>();
//        ClasseGenericaVincolata<Float> classeGenericaVincolata = new ClasseGenericaVincolata<>();
//        ClasseGenericaVincolata<Integer> classeGenericaVincolata = new ClasseGenericaVincolata<>();

        int primoValore = 7;
        int secondoValore = 70;

//        System.out.println(somma(primoValore, secondoValore));


        String primaStringa = "Ciao belli";
        String secondaStringa = "Eccoci";

        System.out.println(concatenazione(primaStringa, secondaStringa));
    }

    public static <T extends Number> double somma(T num1, T num2) {
        double somma = num1.doubleValue() + num2.doubleValue();
        return somma;
    }



    public static <T> String concatenazione(T string1, T string2) {
        return string1.toString() + string2;
    }
}
