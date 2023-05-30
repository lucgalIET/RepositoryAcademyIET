package main.java.lezioni.tipigenerici.oop.Concessionario;

public abstract class AutomobileAbstract implements AutomobileInterface {
    private String marca;
    private String modello;
    private int annoProduzione;

    public AutomobileAbstract() {
    }

    public AutomobileAbstract(String marca, String modello, int annoProduzione) {
        this.marca = marca;
        this.modello = modello;
        this.annoProduzione = annoProduzione;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnnoProduzione() {
        return annoProduzione;
    }

    public void setAnnoProduzione(int annoProduzione) {
        this.annoProduzione = annoProduzione;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[Marca: "+marca+" | Modello: "+modello+" | Anno di produzione: "+annoProduzione+"]");
        return sb.toString();
    }

    @Override
    public void frena() {
        System.out.println("Rallentiamo...");
    }

    @Override
    public void accelera() {
        System.out.println("Acceleriamo...");
    }
}
