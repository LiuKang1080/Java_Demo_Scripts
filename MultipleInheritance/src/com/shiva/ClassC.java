package com.shiva;

public class ClassC extends ClassA, ClassB {

    // we cannot perform something like this in Java

    public void methodTest() {
        performAction();
    }

    // notice the error we get: Ambiguous method call. both
    // performAction() in Class A and performAction() in ClassB match

    // the compiler does not know which superclass method to execute.
    // this is the Diamond Problem in Java. It's the main reason why Java does not support multiple inheritance.
}
