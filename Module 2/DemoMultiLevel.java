// Multilevel Inheritance Example

// Parent Class
class Vehicle {
    void start() {
        System.out.println("Vehicle started...");
    }
}

// Child Class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven...");
    }
}

// Child of Child Class
class SportsCar extends Car {
    void turboMode() {
        System.out.println("Sports Car is running in Turbo Mode...");
    }
}

// Main Class
class DemoMultiLevel {
    public static void main(String[] args) {

        SportsCar car = new SportsCar();

        car.turboMode(); // SportsCar class method
        car.drive(); // Car class method
        car.start(); // Vehicle class method
    }
}