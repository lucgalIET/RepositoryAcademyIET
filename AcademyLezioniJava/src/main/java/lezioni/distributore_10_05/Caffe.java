package lezioni.distributore_10_05;

public class Caffe extends ProdottoAbstract {

    private static double prezzoCaffe;

    DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande();

    public Caffe(){}

    public Caffe(String nomeProdotto, String codiceProdotto, int quantitaProdotto){
        super(nomeProdotto, prezzoCaffe, codiceProdotto, quantitaProdotto);
        this.prezzoCaffe=getPrezzoCaffe();
//        this.distributoreDiBevande.setnTotaleProdotti(quantitaProdotto++);
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
