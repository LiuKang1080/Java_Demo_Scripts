package com.shiva;

public class runnableClass implements Runnable {
    // implements the runnable interface.

    // implement the run() method from Runnable
    @Override
    public void run() {
        System.out.println("Thread implemented from the Runnables interface.");
    }
}
