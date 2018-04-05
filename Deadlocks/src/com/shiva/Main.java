package com.shiva;

public class Main {
    // create 2 class objects that both extend off of Thread
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();
    // the threads will use these two variables to sync.

    public static void main(String[] args) {
        // Deadlocks in Java, they occur when 2 or more threads are blocked on locks,
        // and every thread that is blocked is holding a lock that another thread needs.
        // Ex) Thread 1 is holding lock 1 and waiting for lock 2 but
        // thread 2 is holding lock 2 and waiting for lock 1. These threads will never release the locks they are holding.

        // we will now use the two classes to use the run() methods from both of them.
        new Thread1().start();
        new Thread2().start();

        // notice how they have the locks the that the other thread needs
        // the program will never terminate, we need to manually terminate the program.

        // what happened here:
        // thread1 started and obtained lock1, then went to sleep for 100ms
        // thread2 started and obtained lock2, then went to sleep for 100ms
        // thread1 attempts to get lock 2 from thread 2, but can;t since it's sleeping
        // thread2 wakes, and tries getting the lock1 from thread1, but cannot since thread1 is still trying to get lock2 from thread2

        // solving the deadlock situation: try to make the program have only 1 lock
        // attempt all threads to obtain the locks in order.
        // ie) thread1 has locks 1 and then 2, while thread2 has locks 2 and then 1
        // we can force BOTH of the threads to follow an order of obtaining the locks
        // BOTH threads 1 and 2 must get BOTH lock1 FIRST and THEN lock2
        // or
        // BOTH threads 1 and 2 must get BOTH lock2 FIRST and then lock1

        // We can solve this deadlock by changing the code in Thread class 2, by changing the order of the locks that thread2 acquires.


    }


    // class:
    private static class Thread1 extends Thread {
        // run method for the Thread1 class:
        public void run() {
            // sync will act on lock1
            synchronized (lock1) {
                System.out.println("Thread1: Has lock 1.");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread1: Waiting for lock 2.");

                synchronized (lock2) {
                    System.out.println("Thread1: has lock1 and lock2");
                }
                System.out.println("Thread1: Released lock2");
            }
            System.out.println("Thread1: Released lock1. Exit.");
        }
    }


    // Class 2
    private static class Thread2 extends Thread {
        public void run() {
            // sync lock 2 first:
            synchronized (lock2) {
                System.out.println("Thread2: Has lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread2: Waiting for lock1");
                synchronized (lock1) {
                    System.out.println("Thread2: Has lock2 and lock1");
                }
            }

            System.out.println("Thread2: Released lock2. Exit.");
        }
    }

}
