class Employee {
    int empno;
    String name;
    float sal;

    // Parameterized Constructor
    Employee(int eno, String n, float s) {
        empno = eno;
        name = n;
        sal = s;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee No : " + empno);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + sal);
        System.out.println("--------------------------");
    }
}

class Program1 {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Aashish", 5000f);
        Employee emp2 = new Employee(102, "Rahul", 6500f);
        Employee emp3 = new Employee(103, "Priya", 7200f);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}