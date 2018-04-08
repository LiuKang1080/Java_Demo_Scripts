package com.shiva;

import java.util.concurrent.locks.Lock;

public class Thread1 implements Runnable {
    // Thread1 implementing the runnable interface

    // Fields - composition
    private Lock lock1;
    private Lock lock2;

    // Constructor for the Thread1 class:
    public Thread1(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    // implementing the run() method from the runnables interface
    public void run() {

        try {
            System.out.println("Thread1 started.");

            this.lock1.lock();
            System.out.println("lock1 is now locked.");
            Thread.sleep(100);

            this.lock2.lock();
            System.out.println("lock2 is now locked");

            // now we're going to attempt to unlock the locks:
            System.out.println("Attempting to unlock the locks.");
            this.lock2.unlock();
            System.out.println("lock2 is now unlocked.");
            this.lock1.unlock();
            System.out.println("lock1 is now unlocked.");

        } catch (InterruptedException e) {
            e.getStackTrace();
        }

    }

}
