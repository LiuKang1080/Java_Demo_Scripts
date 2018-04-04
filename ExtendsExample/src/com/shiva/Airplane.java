package com.shiva;

public class Airplane {

    // Fields for the Airplane Class:
    private int engineNum;
    private int wheelNum;
    private boolean weapons;
    private int peopleNum;
    private String engineType;

    // constructor for the Airplane Class:
    public Airplane(int engineNum, int wheelNum, boolean weapons, int peopleNum, String engineType) {
        this.engineNum = engineNum;
        this.wheelNum = wheelNum;
        this.weapons = weapons;
        this.peopleNum = peopleNum;
        this.engineType = engineType;
    }

    // Methods for the Airplane class:
    public void taxi() {
        System.out.println("Moving the plane to the runway.");
    }

    public void takeOff() {
        System.out.println("Airplane is taking off.");
    }

    public void fly() {
        System.out.println("Airplane is flying through the air.");
    }

    public void landPlane() {
        System.out.println("Airplane has landed.");
    }


    // Getters and Setters:
    public int getEngineNum() {
        return engineNum;
    }

    public void setEngineNum(int engineNum) {
        this.engineNum = engineNum;
    }

    public int getWheelNum() {
        return wheelNum;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }

    public boolean isWeapons() {
        return weapons;
    }

    public void setWeapons(boolean weapons) {
        this.weapons = weapons;
    }

    public int getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
