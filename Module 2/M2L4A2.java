// Parent Class
class Shape {
    public double getArea() {
        return 0;
    }
}

// Circle Class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

// Rectangle Class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class M2L4A2{
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(7);
        shapes[1] = new Rectangle(8, 5);

        System.out.println("Area of Circle: " + shapes[0].getArea());
        System.out.println("Area of Rectangle: " + shapes[1].getArea());
    }
}