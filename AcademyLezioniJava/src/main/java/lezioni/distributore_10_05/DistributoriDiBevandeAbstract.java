package main.java.lezioni.distributore_10_05;

public abstract class DistributoriDiBevandeAbstract implements DistributoriDiBevandeInterface {
     private int numeroProdotti;
     private boolean macchinettaPiena;
     private boolean funziona;
     private String codiceDistributori;
     public DistributoriDiBevandeAbstract(){



     }

    public DistributoriDiBevandeAbstract(int numeroProdotti, boolean macchinettaPiena, boolean funziona, String codiceDistributori) {
        this.numeroProdotti = numeroProdotti;
        this.macchinettaPiena = macchinettaPiena;
        this.funziona = funziona;
        this.codiceDistributori = codiceDistributori;
    }

    public int getNumeroProdotti() {
        return numeroProdotti;
    }

    public void setNumeroProdotti(int numeroProdotti) {
        this.numeroProdotti = numeroProdotti;
    }

    public boolean isMacchinettaPiena() {
        return macchinettaPiena;
    }

    public void setMacchinettaPiena(boolean macchinettaPiena) {
        this.macchinettaPiena = macchinettaPiena;
    }

    public boolean isFunziona() {
        return funziona;
    }

    public void setFunziona(boolean funziona) {
        this.funziona = funziona;
    }

    public String getCodiceDistributori() {
        return codiceDistributori;
    }

    public void setCodiceDistributori(String codiceDistributori) {
        this.codiceDistributori = codiceDistributori;
    }

    @Override
    public String toString() {
        return "DistributoriDiBevandeAbstract{" +
                "numeroProdotti=" + numeroProdotti +
                ", macchinettaPiena=" + macchinettaPiena +
                ", funziona=" + funziona +
                ", codiceDistributori='" + codiceDistributori + '\'' +
                '}';
    }

}


