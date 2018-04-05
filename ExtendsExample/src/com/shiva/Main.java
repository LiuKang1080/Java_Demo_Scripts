package com.shiva;

public class Main {

    public static void main(String[] args) {
        // example of direct inheritance. We will use a general example of an airplane.

        // directly instantiate a new airplane object.
        Airplane generalAirplane = new Airplane(2, 4, false, 4, "Standard");
        // We can now call the general methods for the airplane:
        generalAirplane.taxi();
        generalAirplane.takeOff();
        generalAirplane.fly();
        generalAirplane.landPlane();

        // Create a Boeing plane instance:
        Boeing delta = new Boeing();
        delta.taxi(250);
        delta.taxi(400);
        delta.taxi(1000);
        delta.taxi(true);
        delta.taxi(false);
        delta.takeOff();
        delta.fly();
        delta.landPlane();
    }

}
