import java.util.Scanner;

public class M2L4A3 {

    public static Student getStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student ID:");
        int id = scanner.nextInt();

        System.out.println("Enter Student Name:");
        String name = scanner.next();

        System.out.println("Enter Course Fee:");
        double fee = scanner.nextDouble();

        Student student = new Student();
        student.setStudentId(id);
        student.setStudentName(name);
        student.setCourseFee(fee);

        return student;
    }

    public static int getDiscountPercentage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Discount Percentage:");
        return scanner.nextInt();
    }

    public static void main(String[] args) {

        Student student = getStudentDetails();
        int discount = getDiscountPercentage();

        student.calculateFinalFee(discount);

        System.out.println("\nStudent Details");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Course Fee: " + student.getCourseFee());
        System.out.println("Final Fee: " + student.getFinalFee());
    }
}

class Student {

    private int id;
    private String name;
    private double courseFee;
    private double finalFee;

    public int getStudentId() {
        return id;
    }

    public void setStudentId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public double getFinalFee() {
        return finalFee;
    }

    public void calculateFinalFee(int discountPercentage) {
        double discount = (courseFee * discountPercentage) / 100;
        finalFee = courseFee - discount;
    }
}