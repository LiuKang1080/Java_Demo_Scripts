package com.shiva;

public class Animal {

    // Animal Class Fields:
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // constructor for the Animal class:
    public Animal (String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // Methods for the Animal class:
    public void eat() {
        // eat method for the Animal class
        System.out.println("Animal is eating.");
    }

    public void move() {
        // Move method for the Animal class
        System.out.println("Animal is moving.");
    }


    // Setters and Getters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
