package com.shiva;

public class Main {

    // Single objects, attempt to make multiple instances of the singleton object.
    public static void main(String[] args) {

        // creating the 2 threads to access the singleton object.
        System.out.println("Creating threads.");

        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());

        // start the run() for both threads:
        thread1.start();
        thread2.start();

        // what does .join() do?
        // .join() waits for a thread to die.
        while (true) {
            try {
                thread1.join();
                thread2.join();
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
