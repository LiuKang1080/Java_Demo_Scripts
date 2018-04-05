package com.shiva;

public class Batman extends SuperHero implements Billionaire {

    // Batman class
    // Fields for Batman Class
    private int gadgetNum;
    private double moneyAmount;

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

    // using the methods from the billionaire interface:
    @Override
    public void donateToCharity(double moneyAmount) {
        if (moneyAmount > 100000000.00) {
            System.out.println("Donating to charity.");
        }
    }
}
