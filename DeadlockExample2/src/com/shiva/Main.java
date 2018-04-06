package com.shiva;

public class Main {

    public static void main(String[] args) {
        // deadlock example without sync keyword, and the proper solution.
        System.out.println("Running test");
        DeadlockExample2 d = new DeadlockExample2();
        Thread t1 = new Thread(new ThreadWorker(d));
        Thread t2 = new Thread(new ThreadWorker(d));
        t1.start();
        t2.start();

    }


}
