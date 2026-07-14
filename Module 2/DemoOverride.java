class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class DemoOverride {
    public static void main(String[] args) {

        Animal a = new Dog(); // Calls Dog's overridden method
        // Animal a = new Animal(); // Calls Animal's method

        a.sound();
    }
}
