class Employee {
    int empId;
    String name;
    float salary;

    // Default Constructor
    Employee() {
        empId = 101;
        name = "Rahul";
        salary = 25000;
    }

    // Constructor with 2 parameters
    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Constructor with 3 parameters
    Employee(int empId, String name, float salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(empId + " | " + name + " | " + salary);
    }
}

class DemoConstructor {
    public static void main(String[] args) {

        Employee emp1 = new Employee(); // Default Constructor
        Employee emp2 = new Employee(102, "Priya"); // Constructor with 2 parameters
        Employee emp3 = new Employee(103, "Aman", 45000); // Constructor with 3 parameters

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}