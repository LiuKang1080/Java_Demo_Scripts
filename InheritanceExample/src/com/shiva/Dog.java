package com.shiva;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // constructor for the dog class
    // initialize the specific fields for the dog class within the constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        // super is calling the constructor of the class it is inheriting from. ie) the Animal constructor
        // specify the this method for the Dog specific fields
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // Method specific to the Dog class:
    // we can override Animal methods to make the methods unique to the Dog class.
    @Override
    public void eat() {
        // Remember if this super is called, it will run the method specified in the Animal class
        // super.eat();
        System.out.println(this.getName() + " is eating his dinner.");
    }

    @Override
    public void move() {
        // Remember if this super is called, it will run the method specified in the Animal class
        // super.move();
        System.out.println(this.getName() + " is moving around the house.");
    }


    // Getters and Setters:
    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

}
