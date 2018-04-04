package com.shiva;

public class Main {

    public static void main(String[] args) {
        // Main Animal Class file

        // initialize an Animal Class
        Animal animal = new Animal("Animal", 1, 1, 20, 500);
        // Our Animal object has been instantiated, we can now access the public methods and fields

        // initialize a new Dog instance
        Dog myDog = new Dog("Tom", 10, 50, 2, 4, 1, 10, "Gold");
        // We can now access Dog specific methods and fields on top of public methods and fields from the Animal class.
        myDog.eat();
        myDog.move();

        

    }

}
