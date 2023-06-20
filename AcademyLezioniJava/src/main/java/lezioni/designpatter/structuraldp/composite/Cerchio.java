package main.java.lezioni.designpatter.structuraldp.composite;

//leaf
public class Cerchio implements Grafica{

    @Override
    public void disegna() {
        System.out.println("Sto disegnando un cerchio");
    }
}
