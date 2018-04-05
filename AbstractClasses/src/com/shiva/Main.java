package com.shiva;

public class Main {

    public static void main(String[] args) {
        // Abstract classes in Java. abstract keyword is used to create an abstract class
        //Abstract classes cannot be instantiated
        // we can also use the abstract keyword to create abstract methods, those methods do no have a body.
        // if a Class has abstract methods then the class should also be abstract
        // the subclass of an abstract class MUST implement ALL the abstract methods unless that subclass is also an abstract class.

        // we will make an abstract Person Class:
        // TRY to make an instance of the abstract class:

        // SuperHero batman = new SuperHero("BruceWayne");

        // notice how we cannot, we get an error.

        // instantiate a new instance of our two heros:
        SuperHero batman = new Batman("BruceWayne", 10);
        SuperHero superman = new SuperMan("ClarkKent", false);

        batman.attack();
        batman.move();
        ((Batman) batman).donateToCharity(987654321.123);

        superman.move();
        superman.attack();




    }
}
