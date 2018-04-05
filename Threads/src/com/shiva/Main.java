package com.shiva;

import static com.shiva.threadColor.ANSI_GREEN;
import static com.shiva.threadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Main thread is running.");
        // Threads in Java.

        // create an instance of the anotherThread subclass:
        Thread secondThread = new anotherThread();
        // invoke the run method from the subclass:
        // we need to first use the start() method before we can use the run method
        secondThread.start();
        // if we run this program, we see the hello output from both the Main and the subclass.

        // creating an anonymous class, if we chose to create one, we must use the start() method on the thread immediately.
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Anonymous class thread running.");
            }
        }.start();
        // we can see that the order of output will be different, and can't guarantee the sequence in terms of output.

        // another message from the main thread
        System.out.println(ANSI_RED + "Main thread is still running.");
        // we sometimes see the main thread first and then the second thread

        // we cannot start() on an instance of a thread more than once.


        // implement the runnable() method from runnableClass:
        Thread myRunnableThread = new Thread(new runnableClass());
        // we've now created a new thread, we can use it like we did before.
        myRunnableThread.start();

    }
}
