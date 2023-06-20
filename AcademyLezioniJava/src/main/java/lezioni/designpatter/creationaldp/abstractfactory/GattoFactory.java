package main.java.lezioni.designpatter.creationaldp.abstractfactory;

// Factory concreta
public class GattoFactory implements AnimaliFactory {
    @Override
    public Animale creaAnimale() {
        return new Gatto();
    }
}