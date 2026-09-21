package LabManual;
interface Vehicle {
    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class Main4 {

    public static void main(String[] args) {

        // Interface reference
        Vehicle vehicle;

        // Dynamic Method Dispatch
        System.out.println("--- CAR ---");
        vehicle = new Car();
        vehicle.start();

        System.out.println("\n--- BIKE ---");
        vehicle = new Bike();
        vehicle.start();
    }
}