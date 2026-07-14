// Program to demonstrate Abstraction

abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Concrete method
    public void message() {
        System.out.println("Vehicle Information");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

class Bus extends Vehicle {

    void start() {
        System.out.println("Bus starts with a diesel engine.");
    }
}

public class DemoVehicles {
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.message();
        v.start();

        v = new Bike();
        v.message();
        v.start();

        v = new Bus();
        v.message();
        v.start();
    }
}