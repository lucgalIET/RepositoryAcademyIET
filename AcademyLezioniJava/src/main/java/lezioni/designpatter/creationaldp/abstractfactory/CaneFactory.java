package lezioni.designpatter.creationaldp.abstractfactory;

// Factory concreta
public class CaneFactory implements AnimaliFactory {
    @Override
    public Animale creaAnimale() {
        return new Cane();
    }
}
