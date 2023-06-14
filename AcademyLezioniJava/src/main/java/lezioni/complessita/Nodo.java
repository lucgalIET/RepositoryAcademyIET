package main.java.lezioni.complessita;

//Lista Ricorsiva --

// Lista concatenata o lista linkata
public class Nodo {

    private String valore;

    //riferimento al Nodo successivo
    private Nodo nodoSuccessivo;

    public Nodo(String valore) {
        this.valore = valore;
        this.nodoSuccessivo = null;
    }

    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }

    public Nodo getNodoSuccessivo() {
        return nodoSuccessivo;
    }

    public void setNodoSuccessivo(Nodo nodoSuccessivo) {
        this.nodoSuccessivo = nodoSuccessivo;
    }
}
