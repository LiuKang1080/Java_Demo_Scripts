package com.shiva;

public class Boeing extends Airplane {

    // Fields specific to the Boeing Class.
    private int maxSeats = 400;

    // constructor for the boeing plane class:
    public Boeing() {
        super(4, 16, false, 300, "Jet Engine");
    }

    // specific methods
    public void taxi(int numberOfPeople) {
        if (numberOfPeople == this.maxSeats) {
            System.out.println("Max capacity has been reached, Plane will take off.");
        } else if (numberOfPeople > this.maxSeats) {
            System.out.println("Plane is over populated.");
        } else {
            System.out.println("Plane has not reached capacity, will continue to wait for more people.");
        }
    }

    public void taxi(boolean waitForPlanes) {
        if (waitForPlanes) {
            System.out.println("We need to wait for other planes before we take off.");
        } else {
            System.out.println("We can take off.");
        }
    }

    @Override
    public void fly() {
        System.out.println("Watching a movie while flying!");
    }

    @Override
    public void landPlane() {
        System.out.println("Safely landing the plane.");
    }
}
