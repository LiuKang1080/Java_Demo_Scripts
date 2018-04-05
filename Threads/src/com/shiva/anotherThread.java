package com.shiva;

import static com.shiva.threadColor.ANSI_BLUE;

public class anotherThread extends Thread{
    // thread subclass that extends the Thread class

    // override the run method from the thread class:
    @Override
    public void run() {
        // this is the code block we want to execute with the second thread
        System.out.println(ANSI_BLUE + "Second thread is running.");
    }
}
