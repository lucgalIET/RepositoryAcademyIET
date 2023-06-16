package lezioni.tipigenerici;

// Possiamo applicare vincoli sui tipi generici per limitare i tipi che possono essere utilizzati.
// Ad esempio, ClasseGenericaVincolata<T extends Number> indica che il tipo T deve essere un sottotipo di Number.
// In questo modo, possiamo utilizzare solo tipi numerici come Integer, Double, ecc. per T.
// La classe contiene un campo di tipo T che deve essere un sottotipo di Number.

public class ClasseGenericaVincolata<T extends Number> {

    private T valoreVincolato;

    public ClasseGenericaVincolata(){}

    public ClasseGenericaVincolata(T valoreVincolato) {
        this.valoreVincolato=valoreVincolato;
    }

    public T getValoreVincolato() {
        return valoreVincolato;
    }
}
