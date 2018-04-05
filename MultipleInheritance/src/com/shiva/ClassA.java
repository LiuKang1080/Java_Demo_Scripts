package com.shiva;

public class ClassA extends SuperClass {

    // we must use the abstract methods
    @Override
    public void performAction() {
        System.out.println("ClassA is doing performAction");
    }

    // ClassA specific method
    public void methodA() {
        System.out.println("Specific method for ClassA");
    }
}
