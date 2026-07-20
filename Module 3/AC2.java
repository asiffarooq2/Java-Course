class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}

class Book {
    private String title;
    private String author;
    private int numPages;

    public Book(String t, String a, int np) {
        title = t;
        author = a;
        numPages = np;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }
}

public class AC2 {
    public static void main(String[] args) {

        // Create objects
        Student student = new Student("John Doe", 28, "Computer Science");
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", 295);

        // Display student information
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());

        // Display book information
        System.out.println("\nBook Information:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Pages: " + book.getNumPages());
    }
}