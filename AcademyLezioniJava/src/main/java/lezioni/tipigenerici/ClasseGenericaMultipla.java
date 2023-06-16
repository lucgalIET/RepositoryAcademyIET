package lezioni.tipigenerici;

//esempio di una classe generica ClasseGenericaMultipla<T, U>.
// La classe contiene due campi di tipo T e U.
// Possiamo creare un'istanza di ClasseGenericaMultipla specificando i tipi di parametro desiderati.
public class ClasseGenericaMultipla<T, U> {

    private T valore1;

    private U valore2;

    public ClasseGenericaMultipla(T valore1, U valore2) {
        this.valore1=valore1;
        this.valore2=valore2;
    }

    public T getValore1() {
        return valore1;
    }

    public U getValore2() {
        return valore2;
    }
}
