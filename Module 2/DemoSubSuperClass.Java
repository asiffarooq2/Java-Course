// Superclass
class Vehicle {
    String brand = "Toyota";
}

// Subclass
class Car extends Vehicle {

    // Variable with the same name as in the superclass
    String brand = "BMW";

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class DemoSubSuperClass {
    public static void main(String[] args) {

        Car car = new Car();
        car.displayBrand();
    }
}