class Student {
    int rollNo;
    String name;
    String course;
    float marks;

    // Default Constructor
    Student() {
        rollNo = 101;
        name = "Aarav";
        course = "Computer Science";
        marks = 89.5f;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Details");
        System.out.println("----------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
    }
}

class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}