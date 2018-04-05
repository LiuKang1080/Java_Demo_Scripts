package com.shiva;

public class Main {

    public static void main(String[] args) {
        // Interfaces in Java.
        // Interfaces are similar to classes, A class implements an interface
        // it will inherit all the abstract methods from the interface
        // classes can extend multiple interfaces. This solves the Diamond problem
        // the interface is by default abstract, along with ALL the methods. the abstract keyword is not needed.

        // when a class extends an interface it is signing a contract that it WILL perform ALL the behaviours of the interface, if it does not then it must declare itself abstract.

        // instantiate the MyAnimal Class:
        MyAnimal newAnimal = new MyAnimal();
        newAnimal.eat();
        newAnimal.move();
    }
}
