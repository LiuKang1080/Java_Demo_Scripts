package com.shiva;

public class Singleton {

    // fields for the singleton
    private static Singleton instance;

    // Methods for the Singleton:
    // getInstance method:
    public static Singleton getInstance() {
        instance = new Singleton();

        return instance;
    }
    Thread thread = new Thread();

    public static void joinThread(Thread thread) {
        // thread.join;
    }

    // delete Singleton
    public void clearSingleton() {
        instance = null;
    }

    private Singleton() {}
}
