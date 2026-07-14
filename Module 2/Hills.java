class HillStation {

    void location() {
        System.out.println("Location: ");
    }

    void famousFor() {
        System.out.println("Famous For: ");
    }
}

class Ooty extends HillStation {

    @Override
    void location() {
        System.out.println("Ooty is in Tamil Nadu.");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for tea gardens and Botanical Garden.");
    }
}

class Shimla extends HillStation {

    @Override
    void location() {
        System.out.println("Shimla is in Himachal Pradesh.");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for Mall Road and The Ridge.");
    }
}

class Darjeeling extends HillStation {

    @Override
    void location() {
        System.out.println("Darjeeling is in West Bengal.");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for tea plantations and the Toy Train.");
    }
}

public class Hills {
    public static void main(String[] args) {

        HillStation h1 = new Ooty();
        HillStation h2 = new Shimla();
        HillStation h3 = new Darjeeling();

        h1.location();
        h1.famousFor();
        System.out.println();

        h2.location();
        h2.famousFor();
        System.out.println();

        h3.location();
        h3.famousFor();
    }
}