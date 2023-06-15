package main.java.lezioni.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    private static Lock lock = new ReentrantLock();
    private List list = new ArrayList<>();
    private static int counter = 0;

    static class Worker implements Runnable {
        @Override
        public void run() {
            lock.lock();
            for (int i = 0; i < 5; i++) {
                counter++;
                System.out.println("Variabile incrementata: " + counter + " da " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Worker());
        Thread thread2 = new Thread(new Worker());
        Thread thread3 = new Thread(new Worker());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
