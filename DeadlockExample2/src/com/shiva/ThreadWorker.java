package com.shiva;

public class ThreadWorker implements Runnable {
    // implement the runnables() method.

    // fields for this class, composition field from the DeadLockExample2 class:
    private DeadlockExample2 _d;

    // constructor:
    public ThreadWorker (DeadlockExample2 d) {
        _d = d;
    }

    // implement the run() method:
    public void run() {
        try {
            System.out.println("Running the implements");
            // _d.deadlock();
            _d.nodeadlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
