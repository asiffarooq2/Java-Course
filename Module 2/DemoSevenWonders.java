// Parent Class
class SevenWonders {

    void wonderName() {
        System.out.println("Wonder Name:");
    }

    void location() {
        System.out.println("Location:");
    }
}

// Child Class 1
class TajMahal extends SevenWonders {

    @Override
    void wonderName() {
        System.out.println("Wonder: Taj Mahal");
    }

    @Override
    void location() {
        System.out.println("Location: Agra, India");
    }
}

// Child Class 2
class GreatWall extends SevenWonders {

    @Override
    void wonderName() {
        System.out.println("Wonder: Great Wall of China");
    }

    @Override
    void location() {
        System.out.println("Location: China");
    }
}

// Child Class 3
class Petra extends SevenWonders {

    @Override
    void wonderName() {
        System.out.println("Wonder: Petra");
    }

    @Override
    void location() {
        System.out.println("Location: Jordan");
    }
}

// Main Class
public class DemoSevenWonders {

    public static void main(String[] args) {

        SevenWonders w;

        w = new TajMahal();
        w.wonderName();
        w.location();
        System.out.println();

        w = new GreatWall();
        w.wonderName();
        w.location();
        System.out.println();

        w = new Petra();
        w.wonderName();
        w.location();
    }
}
