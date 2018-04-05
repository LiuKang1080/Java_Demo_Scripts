package com.shiva;

public abstract class SuperHero {
    // Abstract superHero class
    // Fields for the superhero
    private String name;

    // constructor
    public SuperHero(String name) {
        this.name = name;
    }

    // abstract methods for the SuperHero class:
    public abstract void move();
    public abstract void attack();


}
