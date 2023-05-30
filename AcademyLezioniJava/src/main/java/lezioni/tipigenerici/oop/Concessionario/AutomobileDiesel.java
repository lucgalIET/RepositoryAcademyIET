package main.java.lezioni.tipigenerici.oop.Concessionario;

import java.util.Random;

public class AutomobileDiesel extends AutomobileAbstract {

    private int serbatoio;
    private int numeroTelaio;

    public AutomobileDiesel() {
    }

    public AutomobileDiesel(String marca, String modello, int annoProduzione) {
        super(marca, modello, annoProduzione);
        Random rand = new Random();
        this.serbatoio = rand.nextInt(100) + 1;
        this.numeroTelaio = rand.nextInt(2000); //presuppongo di non essere così sfortunato da creare due auto con lo stesso numero
    }

    public int getSerbatoio() {
        return serbatoio;
    }

    public void setSerbatoio(int serbatoio) {
        this.serbatoio = serbatoio;
    }

    public int getNumeroTelaio() {
        return numeroTelaio;
    }

    public void setNumeroTelaio(int numeroTelaio) {
        this.numeroTelaio = numeroTelaio;
    }

    @Override
    public void rifornimento() {
        System.out.println("Stai facendo diesel...");
    }

    @Override
    public void isFullOrEmpty() {
        if (serbatoio == 100) System.out.println("Serbatoio pieno...");
        else if (serbatoio == 0) System.out.println("Serbatio vuoto...");
    }
}
