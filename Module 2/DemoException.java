import java.util.Scanner;

public class DemoException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new ArithmeticException("You are not eligible to vote.");
            }

            System.out.println("You are eligible to vote.");

        } catch (ArithmeticException ex) {

            System.out.println("--- Catch Block ---");
            System.out.println(ex.getMessage());

        } finally {

            System.out.println("--- Finally Block ---");
            System.out.println("Thank you for using the program.");
            sc.close();
        }

        System.out.println("--- Program Ended ---");
    }
}