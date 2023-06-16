package lezioni.multithreading;

import java.util.concurrent.Semaphore;

public class PrinterRunnable implements Runnable {

    private Semaphore semaphore;
    private String document;

    public PrinterRunnable(String document) {
        this.semaphore = new Semaphore(1);
        this.document = document;
    }

    @Override
    public void run() {
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
//            Thread.sleep(3000);
        }
    }

    public static void main(String[] args) {
        PrinterRunnable printer = new PrinterRunnable("Ciao sono un documento " + Thread.currentThread().getName());

        //creiamo 10 Thread che crecano di stampare il documento
        for (int i = 0; i < 5; i++)
            new Thread(printer).start();


//        Thread thread1 = new Thread(printer);
//        Thread thread2 = new Thread(printer);
//        Thread thread3 = new Thread(printer);
//        Thread thread4 = new Thread(printer);
//        Thread thread5 = new Thread(printer);
//
//        //avvio dei thread
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();

    }
}
