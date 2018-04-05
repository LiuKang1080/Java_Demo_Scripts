package com.shiva;
//import java.lang
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


        // let's look in Java.lang to see what are classes, interfaces, and abstract classes:

        // Regular Classes: Assertion Error
            // Assertion error directly inherits from Error Class Object
            // it has overloaded methods for each primitive data type in Java.

        // Abstract Classes: Enum
            // Abstract class that implements 2 interfaces: Comparable and Serializable
            // there are overloaded methods that only return something, perform various actions, if not "throw new" is used instead for multiple methods

        // Interface: Readable
            // we only have 1 method and it reads characters into the specified buffer frame.
            // public method

    }
}
