package main.java.lezioni.tipigenerici.oop.Concessionario;

import java.util.Random;

public class AutomobileElettrica extends AutomobileAbstract{

    private int numeroTelaio;
    private int batteria;

    public AutomobileElettrica() {
    }

    public AutomobileElettrica(String marca, String modello, int annoProduzione) {
        super(marca, modello, annoProduzione);
        Random rand = new Random();
        this.batteria = rand.nextInt(100) + 1;
        this.numeroTelaio = rand.nextInt(2000);
    }

    public int getNumeroTelaio() {
        return numeroTelaio;
    }

    public void setNumeroTelaio(int numeroTelaio) {
        this.numeroTelaio = numeroTelaio;
    }

    public int getBatteria() {
        return batteria;
    }

    public void setBatteria(int batteria) {
        this.batteria = batteria;
    }

    @Override
    public void rifornimento() {
        System.out.println("Stai ricaricando la batteria...");
    }

    @Override
    public void isFullOrEmpty() {
        if (batteria == 100) System.out.println("Batteria carica...");
        else if (batteria == 0) System.out.println("Batteria scarica...");
    }
}
