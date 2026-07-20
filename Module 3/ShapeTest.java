// Interface
interface Shape {
    double getArea();
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// AreaCalculator class
class AreaCalculator {
    public double sumAreas(Shape[] shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }
}

// Driver class
public class ShapeTest {
    public static void main(String[] args) {

        // Create an array of Shape objects
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(2, 4);
        shapes[1] = new Circle(3);

        // Calculate total area
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.sumAreas(shapes);

        // Display result
        System.out.println("Total Area: " + totalArea);
    }
}