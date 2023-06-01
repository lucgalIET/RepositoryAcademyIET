package main.java.lezioni.lambda;

public abstract class FigureGeometricheAbstract implements OperazioniInterfacce {

    private double dato1;
    private double dato2;
    private double dato3;

    public FigureGeometricheAbstract() {}

    public FigureGeometricheAbstract(double dato1) {
        this.dato1 = dato1;
    }

    public FigureGeometricheAbstract(double dato1, double dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public FigureGeometricheAbstract(double dato1, double dato2, double dato3) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
    }

    public double getDato1() {
        return dato1;
    }

    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }

    public double getDato3() {
        return dato3;
    }

    public void setDato3(double dato3) {
        this.dato3 = dato3;
    }

}
