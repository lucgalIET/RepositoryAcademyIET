package lezioni.multithreading;

import java.util.concurrent.Semaphore;

public class Connections {
    private Semaphore semaphore;
    private int connections = 0;
    private int maxConnections;

    public Connections(int maxConnections) {
        this.maxConnections = maxConnections;
        semaphore = new Semaphore(maxConnections);
//      semaphore = new Semaphore(n);
    }

    public void acquireConnection() {
        try {
            semaphore.acquire(); //i thread cercano di ottenere il/i permesso/i
            connections++;
            System.out.println(Thread.currentThread().getName() + " ha ottenuto una connessione. Connessioni attive: " + connections);
            Thread.sleep(4000); // simula il tempo di esecuzione
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void releaseConnection() {
        try {
            connections--;
            System.out.println(Thread.currentThread().getName() + " ha rilasciato una connessione. Connessioni attive: " + connections);
            Thread.sleep(4000); // simula il tempo di esecuzione
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connections connection = new Connections(2);

        // creiamo 10 thread che cercano di ottenere una connessione
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                connection.acquireConnection();
                try {
                    Thread.sleep(2000); // simula il tempo di esecuzione
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                connection.releaseConnection();
            }).start();
        }
    }
}