package lezioni.distributore_10_05;

public class Cappuccino extends ProdottoAbstract {

    private double prezzoCappuccino;

    public Cappuccino() {

    }

    public Cappuccino(String nomeProdotto, String codiceProdotto, int quantitaProdotto) {
        this.prezzoCappuccino=getPrezzoCappuccio();
    }

    public double getPrezzoCappuccio() {
        return 1.50;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[")
                .append(" Nome prodotto: "    + getNomeProdotto() +" ")
                .append(" PrezzoProdotto: "   + getPrezzoCappuccio() + " € ")
                .append(" codiceProdotto: "   + getCodiceProdotto())
                .append(" quantitaProdotto: " + getQuantitaProdotto()+"\"").append("]");
        return sb.toString();
    }
}
