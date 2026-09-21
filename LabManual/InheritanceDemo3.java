package LabManual;
// Abstract class
abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Normal method
    void display() {
        System.out.println("This is a vehicle.");
    }
}

// Single Inheritance
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts using a key.");
    }

    void carType() {
        System.out.println("Type: Petrol Car");
    }
}

// Multilevel Inheritance
class ElectricCar extends Car {

    @Override
    void start() {
        System.out.println("Electric car starts using a power button.");
    }

    void battery() {
        System.out.println("Battery: Fully Charged");
    }
}

// Hierarchical Inheritance
class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts using a self-start button.");
    }

    void bikeType() {
        System.out.println("Type: Two Wheeler");
    }
}

public class InheritanceDemo3 {

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("--- SINGLE INHERITANCE ---");
        Car car = new Car();
        car.display();
        car.start();
        car.carType();

        // Multilevel Inheritance
        System.out.println("\n--- MULTILEVEL INHERITANCE ---");
        ElectricCar ecar = new ElectricCar();
        ecar.display();
        ecar.start();
        ecar.carType();
        ecar.battery();

        // Hierarchical Inheritance
        System.out.println("\n--- HIERARCHICAL INHERITANCE ---");
        Bike bike = new Bike();
        bike.display();
        bike.start();
        bike.bikeType();
    }
}