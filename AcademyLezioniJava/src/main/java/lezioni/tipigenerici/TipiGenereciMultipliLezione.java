package main.java.lezioni.tipigenerici;

// Creiamo un'istanza di ClasseGenericaMultipla specificando i tipi di parametro desiderati, ad esempio Integer e String.
// Passiamo i valori corrispondenti ai tipi di parametro nel costruttore.
// Possiamo quindi accedere ai valori utilizzando i metodi getValore1() e getValore2().
public class TipiGenereciMultipliLezione {

    public static void main(String[] args) {

        ClasseGenericaMultipla<Integer, String> classeGenericaMultipla = new ClasseGenericaMultipla<>(77, "Ciccio");

        System.out.println(classeGenericaMultipla.getValore1());
        System.out.println(classeGenericaMultipla.getValore2());


        ClasseGenericaMultipla<String, Double> classeGenericaMultipla2 = new ClasseGenericaMultipla<>("Gino",7.5);


        String valore1 = classeGenericaMultipla2.getValore1();
        Double valore2 = classeGenericaMultipla2.getValore2();

        System.out.println(valore1 + valore2);

    }
}
