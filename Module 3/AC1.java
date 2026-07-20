// Superclass
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Subclass
class Student extends Person {
    private String major;

    // Constructor
    public Student(String name, int age, String major) {
        super(name, age); // Calls the Person constructor
        this.major = major;
    }

    // Getter method
    public String getMajor() {
        return major;
    }
}

// Main class
public class AC1 {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John", 20, "Computer Science");

        // Display student details
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());
    }
}