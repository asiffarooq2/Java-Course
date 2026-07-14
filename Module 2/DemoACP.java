// Parent Class
class Animal {

    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child Class
class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    // Method Overloading
    void sound(String name) {
        System.out.println(name + " barks loudly.");
    }

    // Method Overloading
    void sound(int times) {
        System.out.println("Dog barked " + times + " times.");
    }
}

class DemoACP {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Overridden Method
        d.sound();

        // Overloaded Methods
        d.sound("Bruno");
        d.sound(3);

        // Runtime Polymorphism
        Animal a = new Dog();
        a.sound();
    }
}
