import java.util.Scanner;

class Volume {

    private double length;
    private double width;
    private double height;

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Volume of Cube
    public double cubeVolume() {
        return length * length * length;
    }

    // Volume of Cuboid
    public double cuboidVolume() {
        return length * width * height;
    }
}

public class M2L4ACP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();

        System.out.println("1. Cube");
        System.out.println("2. Cuboid");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter side of cube: ");
                double side = sc.nextDouble();

                v.setLength(side);

                System.out.println("Volume of Cube = " + v.cubeVolume());
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();

                System.out.print("Enter width: ");
                double width = sc.nextDouble();

                System.out.print("Enter height: ");
                double height = sc.nextDouble();

                v.setLength(length);
                v.setWidth(width);
                v.setHeight(height);

                System.out.println("Volume of Cuboid = " + v.cuboidVolume());
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}