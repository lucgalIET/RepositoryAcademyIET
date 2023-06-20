package main.java.lezioni.designpatter.creationaldp.methodfactory;

//metodo/i concreto/i
public class Gatto implements Animale{

    @Override
    public void siMuove() {
        System.out.println("Il gatto sta saltando sui mobili.");
    }
}
