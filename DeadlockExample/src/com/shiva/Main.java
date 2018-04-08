package com.shiva;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        // creating a deadlock using the Lock object / Lock class.

        System.out.println("Starting both threads, and starting the run method.");

        // create both locks 1 and 2
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        // create both Threads:
        Thread thread1 = new Thread(new Thread1(lock1, lock2));
        Thread thread2 = new Thread(new Thread2(lock1, lock2));

        // starting both threads:
        thread1.start();
        thread2.start();

    }
}
