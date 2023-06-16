package lezioni.tipigenerici;

/*
naming tipi generici per convenzione
T: tipo generico
E: Elemento di collezione
K: chiave di una mappa
V: valore di una mappa
 */

public class Contenitore<T> {

    private T oggetto;

    public Contenitore(){}

    public Contenitore(T oggetto) {
        this.oggetto=oggetto;
    }

    public T getOggetto() {
        return oggetto;
    }

    public void setOggetto(T oggetto) {
        this.oggetto = oggetto;
    }
}
