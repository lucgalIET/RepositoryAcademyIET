package main.java.lezioni.designpatter.creationaldp.singleton;

public class Singleton {

    private static Singleton instance;

    private static int counter;

    private Singleton() {
        //costruttore privato: serve per impedire l'istanziazione diretta della classe
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void faiQualcosa() {
        if (counter==0) {
            System.out.println("Sono la prima istanza di Singleton e sto facendo qualcosa!");
            counter++;
        } else {
            System.out.println("Sono la prima istanza di Singleton e non posso avere piu' di un'istanza!");
        }
    }

//    public void faiQualcosa() {
//        if (instance == null) {
//            System.out.println("Sono la prima istanza di Singleton e sto facendo qualcosa!");
//        } else {
//            System.out.println("Sono la prima istanza di Singleton e non posso avere piu' di un'istanza!");
//        }
//    }
}
