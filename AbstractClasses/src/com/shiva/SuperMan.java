package com.shiva;

public class SuperMan extends SuperHero {
    // Superman class

    // fields for the superman class
    private boolean kryptonite;

    // constructor for the superman class:
    public SuperMan(String name, boolean kryptonite){
        super(name);
        this.kryptonite = kryptonite;
    }

    // methods for Superman, again we MUST use the move() and attack() methods
    @Override
    public void attack() {
        if (!kryptonite) {
            System.out.println("There is no kryptonite, we can attack with heat vision");
        } else {
            System.out.println("There is kryptonite, we can't attack.");
        }
    }

    @Override
    public void move() {
        if (!kryptonite) {
            System.out.println("There is no kryptonite, Superman can fly.");
        } else {
            System.out.println("There is kryptonite, guess he'll walk.");
        }
    }
}
