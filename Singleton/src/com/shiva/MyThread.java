package com.shiva;

public class MyThread implements Runnable{

    public void run() {

        try {

            Thread myThread = new Thread();
            myThread.start();


            Singleton myInstance = Singleton.getInstance();
            System.out.println("Created Singleton object");
            //access the singleton
            myInstance.getInstance();
            System.out.println("Thread Sleeping.");
            myInstance.getInstance();
            Thread.sleep(1000);
            myInstance.joinThread(myThread);


            // delete singleton now:
            myInstance.clearSingleton();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }


}
