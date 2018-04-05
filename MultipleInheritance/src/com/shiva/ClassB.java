package com.shiva;

public class ClassB extends SuperClass{

    // we must use the abstract methods
    @Override
    public void performAction() {
        System.out.println("ClassB is doing performAction");
    }

    // ClassA specific method
    public void methodB() {
        System.out.println("Specific method for ClassB");
    }

}
