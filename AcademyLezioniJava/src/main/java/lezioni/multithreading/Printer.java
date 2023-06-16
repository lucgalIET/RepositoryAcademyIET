package lezioni.multithreading;

import java.util.concurrent.Semaphore;

public class Printer {

    private Semaphore semaphore;

    public Printer() {
        semaphore = new Semaphore(1); //1 permesso disponibile
//        semaphore = new Semaphore(2); //1 permesso disponibile
    }

    public void print(String document) throws InterruptedException {

        try {

        System.out.println(Thread.currentThread().getName() + " sta cercando di ottenere il permesso.");
        semaphore.acquire(); //tentativo di ottenere il permesso
        Thread.sleep(3000);

        //esecuzione del codice -->

        System.out.println(Thread.currentThread().getName() + " sta stampando il documento " + document);
        Thread.sleep(3000);

        // <-- esecuzione del codice

        System.out.println(Thread.currentThread().getName() + " ha concluso la stampa!");
        Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " ha rilasciato il permesso.");
            Thread.sleep(3000);
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        //creiamo 10 Thread che crecano di stampare il documento
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    printer.print("Ciao sono un documento" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}
