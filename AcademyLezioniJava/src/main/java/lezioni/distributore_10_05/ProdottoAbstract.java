package main.java.lezioni.distributore_10_05;

public abstract class ProdottoAbstract {
    private String nomeProdotto;
    private double prezzoProdotto;
    private String codiceProdotto;

    private int quantitaProdotto;
    public ProdottoAbstract(){}

    public ProdottoAbstract(String nomeProdotto, double prezzoProdotto, String codiceProdotto, int quantitaProdotto){
        this.nomeProdotto = nomeProdotto;
        this.prezzoProdotto = prezzoProdotto;
        this.codiceProdotto = codiceProdotto;
        this.quantitaProdotto = quantitaProdotto;
    }
    public String getNomeProdotto()
    {
        return nomeProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public double getPrezzoProdotto() {
        return prezzoProdotto;
    }

    public void setPrezzoProdotto(double prezzoProdotto) {
        this.prezzoProdotto = prezzoProdotto;
    }

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(String codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    public int getQuantitaProdotto() {
        return quantitaProdotto;
    }

    public void setQuantitaProdotto(int quantitaProdotto) {
        this.quantitaProdotto = quantitaProdotto;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "nomeProdotto='" + nomeProdotto + '\'' +
                ", prezzoProdotto=" + prezzoProdotto +
                ", codiceProdotto='" + codiceProdotto + '\'' +
                ", quantitaProdotto=" + quantitaProdotto +
                '}';
    }
}
