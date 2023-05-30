package main.java.lezioni.distributore_10_05;

import main.java.lezioni.oopesercizi.esercizioDistributori.DistributoreDiBevande;
import main.java.lezioni.oopesercizi.esercizioDistributori.ProdottoAbstract;

public class Caffe extends ProdottoAbstract {

    private double prezzoCaffe;

    DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande();

    public Caffe(){}

    public Caffe(String nomeProdotto, String codiceProdotto, int quantitaProdotto){
        super(nomeProdotto, codiceProdotto, quantitaProdotto);
        this.prezzoCaffe=getPrezzoCaffe();
        this.distributoreDiBevande.setnTotaleProdotti(quantitaProdotto++);
    }

    public double getPrezzoCaffe() {
        return 0.7;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[")
                .append(" Nome prodotto: "    + getNomeProdotto() +" ")
                .append(" PrezzoProdotto: "   + getPrezzoCaffe() + " € ")
                .append(" codiceProdotto: "   + getCodiceProdotto())
                .append(" quantitaProdotto: " + getQuantitaProdotto()+"\"").append("]");
        return sb.toString();
    }
}
