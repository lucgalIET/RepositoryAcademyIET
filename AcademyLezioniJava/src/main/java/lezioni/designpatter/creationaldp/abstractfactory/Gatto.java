package lezioni.designpatter.creationaldp.abstractfactory;

//metodo/i concreto/i
public class Gatto implements Animale {
    @Override
    public void faiIlVerso() {
        System.out.println("Miao!");
    }
}
