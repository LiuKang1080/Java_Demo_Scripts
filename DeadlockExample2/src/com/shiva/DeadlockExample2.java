package com.shiva;

public class DeadlockExample2 {

    // Fields for this class:
    private int count = 0;

    // method for the deadlock
    public void deadlock() throws InterruptedException {
        this.count++;
        System.out.println("Entered deadlock method.");
        // sleep for a while while another thread gets made
//        Thread.sleep(250);
        while (this.count != 1)
        {
            System.out.println("Waiting " + this.count);
        }
        this.count--;
    }


    // same method except this time we will use synchronize method
    public synchronized void nodeadlock() throws InterruptedException {
        this.count++;
        System.out.println("Entered NO DEADLOCK method.");
        Thread.sleep(250);
        while (this.count != 1)
        {
            System.out.println("Waiting");
        }
        this.count--;
    }

    // notice how the methods are exactly the same, except the keyword synchronize in the second method.
}
