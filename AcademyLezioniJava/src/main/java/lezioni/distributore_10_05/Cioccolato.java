package lezioni.distributore_10_05;

public class Cioccolato extends ProdottoAbstract {

    private double prezzoCioccolato;

    public Cioccolato() {}

    public Cioccolato(String nomeProdotto, String codiceProdotto, int quantitaProdotto) {
        this.prezzoCioccolato= getPrezzoCioccolato();
    }

    public double getPrezzoCioccolato() {
        return 2.70;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[")
                .append(" Nome prodotto: "     + getNomeProdotto() + " ")
                .append(" PrezzoProdotto: "    + getPrezzoCioccolato() + " € ")
                .append(" codiceProdotto: "    + getCodiceProdotto())
                .append(" quantitaProdotto: "  + getQuantitaProdotto()+"\"").append("]");
        return sb.toString();
    }
}
