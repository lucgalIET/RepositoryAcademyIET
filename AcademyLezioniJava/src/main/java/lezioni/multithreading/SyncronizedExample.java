package lezioni.multithreading;

public class SyncronizedExample {

    private static final Object lock = new Object();
    private static int counter = 0;

    static class Decreaser implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {

                //blocco sincronizzato  -->
                synchronized (lock) {
                    counter--;
                    System.out.println("Decremento eseguito. Totale counter: " + counter + " da " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
//              <--     blocco sincronizzato
            }
        }
    }

    static class Increaser implements Runnable {
        @Override
        public void run() {
            //blocco sincronizzato  -->
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        counter++;
                        System.out.println("Incremento eseguito. Totale counter: " + counter + " da " + Thread.currentThread().getName());
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
//              <--     blocco sincronizzato
            }
        }
    }

    public static void main(String[] args) {
        Thread incrementThread = new Thread(new Increaser());
//        Thread incrementThread2 = new Thread(new Increaser());
//        Thread incrementThread3 = new Thread(new Increaser());
        Thread decrementThread = new Thread(new Decreaser());

        incrementThread.start();
//        incrementThread2.start();
//        incrementThread3.start();
        decrementThread.start();
    }
}
