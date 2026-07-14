// Parent Class
class Person {
    int age;
    String name;

    void displayName(String name) {
        System.out.println("Student Name : " + name);
    }
}

// Child Class
class Student extends Person {

    void displayDetails(int age, int rollNo, String course) {
        System.out.println("Age          : " + age);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Course       : " + course);
    }
}

// Main Class
class DemoInheritance {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.displayName("Aarav");
        s1.displayDetails(15, 101, "Java");
        System.out.println();

        s2.displayName("Ananya");
        s2.displayDetails(16, 102, "Python");
        System.out.println();

        s3.displayName("Rahul");
        s3.displayDetails(14, 103, "Web Development");
    }
}