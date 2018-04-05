package com.shiva;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread is running.");
        // Threads in Java.

        // create an instance of the anotherThread subclass:
        Thread secondThread = new anotherThread();
        // invoke the run method from the subclass:
        // we need to first use the start() method before we can use the run method
        secondThread.start();
        // if we run this program, we see the hello output from both the Main and the subclass.

        // another message from the main thread
        System.out.println("Main thread is still running.");
        // we sometimes see the main thread first and then the second thread

        // we cannot start() on an instance of a thread more than once.


    }
}
