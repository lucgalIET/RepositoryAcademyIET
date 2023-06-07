package main.java.lezioni.flussiefile;

public class NostraEccezioneException extends Throwable {

    private int codiceErrore;

    public NostraEccezioneException(String messaggio){
        super(messaggio);
    }

    public int getCodiceErrore() {
        return codiceErrore;
    }

    public void lanciaEccezione() {
        if (codiceErrore==1) {

        } else {

        }
    }
}
