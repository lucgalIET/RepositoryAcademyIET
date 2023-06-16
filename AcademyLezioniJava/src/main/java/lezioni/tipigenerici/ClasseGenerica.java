package lezioni.tipigenerici;

/*
naming tipi generici per convenzione
T: tipo generico
E: Elemento di collezione
K: chiave di una mappa
V: valore di una mappa
 */

public class ClasseGenerica<T> { //T utilizzata per convenzione, rappresenta un tipo di dato generico

    private T valore;

    public ClasseGenerica() {

    }
    public ClasseGenerica(T valore) {
        this.valore=valore;
    }

    public T getValore() {
        return valore;
    }
}
