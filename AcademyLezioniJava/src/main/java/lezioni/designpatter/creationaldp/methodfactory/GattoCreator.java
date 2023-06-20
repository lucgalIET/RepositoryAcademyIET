package lezioni.designpatter.creationaldp.methodfactory;

//creator concreto
public class GattoCreator extends AnimaleCreator {
    @Override
    public Animale creaAnimale() {
        return new Gatto();
    }
}
