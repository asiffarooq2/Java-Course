import java.util.Scanner;

class Calculator {

    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero.");
    }
}

class DemoCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("\nCalculator Menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                calc.add(num1, num2);
                break;
            case 2:
                calc.subtract(num1, num2);
                break;
            case 3:
                calc.multiply(num1, num2);
                break;
            case 4:
                calc.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
