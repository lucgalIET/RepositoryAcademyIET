package main.java.lezioni.designpatter.creationaldp.singleton;

public class SingletonMain {
    public static void main(String[] args) {

//        Singleton singleton = new Singleton(); //non possiamo accedere direttamente al costruttore perche' privato
//        singleton.getInstance()

        Singleton singleton = Singleton.getInstance();
        singleton.faiQualcosa();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.faiQualcosa();
    }
}
