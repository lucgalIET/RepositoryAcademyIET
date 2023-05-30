package main.java.lezioni.tipigenerici;


// Scrivi una classe Contatore<T> che tiene traccia di un conteggio di oggetti di tipo T.
//La classe dovrebbe avere i seguenti metodi:

// void incrementa(): incrementa il conteggio di 1.
// void reset(): reimposta il conteggio a 0.
// int getConteggio(): restituisce il conteggio corrente.
// T getUltimoValore(): restituisce l'ultimo valore di tipo T incrementato.

public class Contatore<T> {

    private int conteggio;

    private T ultimoValore;

    public Contatore() {
    }

    public void setIncrementa(T ultimoValore) {
        conteggio++;
        this.ultimoValore=ultimoValore;
    }

    public void reset() {
        conteggio = 0;
        ultimoValore = null;
    }

    public int getConteggio() {
        return conteggio;
    }

    public T getUltimoValore() {
        return ultimoValore;
    }

//    public void setUltimoValore(T ultimoValore) {
//        this.ultimoValore=ultimoValore;
//    }

}
