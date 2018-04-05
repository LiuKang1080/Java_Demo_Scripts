package com.shiva;

public class Batman extends SuperHero {
    // Batman class
    // Fields for Batman Class
    private int gadgetNum;

    // Constructor for the Batman class
    public Batman(String name, int gadgetNum) {
        super(name);
        this.gadgetNum = gadgetNum;
    }

    // methods for Batman. We MUST use the move() and attack() method:
    @Override
    public void move() {
        System.out.println("Batman is gliding through the air.");
    }

    @Override
    public void attack() {
        if (gadgetNum > 0) {
            System.out.println("Batman will attack with Batarang ");
        } else {
            System.out.println("Batman is out of weapons.");
        }
    }
}
