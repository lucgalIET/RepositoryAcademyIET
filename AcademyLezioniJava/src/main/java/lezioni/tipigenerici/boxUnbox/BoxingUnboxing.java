package main.java.lezioni.tipigenerici.boxUnbox;

public class BoxingUnboxing {

    public static void main(String[] args) {


        //Boxing - conversione di un tipo primitivo (int) in un oggetto Wrapper
        int numeroPrimitivo = 7;
        Integer numeroCorrWrapper = Integer.valueOf(numeroPrimitivo);

        //Unboxing - conversione di un oggeto Wrapper in tu tipo primitivo
        Integer numeroWrapper = Integer.valueOf(13);
        int numeroCorrIntero = numeroWrapper.intValue();


        Integer somma = numeroWrapper + numeroPrimitivo;
//        System.out.println(somma);

        // Autoboxing - conversione automatica di un tipo primitivo in un oggetto wrapper
        int valorePrimitivo = 9;
        Integer n = valorePrimitivo;
        System.out.println(n);

        // Autoboxing - conversione automatica di un oggetto wrapper in un tipo primitivo
        Integer valoreWrapper = Integer.valueOf(12);
        int valoreIntero = valorePrimitivo;
        System.out.println(valoreIntero);


        // Operazioni utilizzando i tipi primitivi
        int prodotto = valorePrimitivo * valoreIntero;
        System.out.println(prodotto);
    }
}
