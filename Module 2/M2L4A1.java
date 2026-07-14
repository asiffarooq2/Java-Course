class Employee {
    private int empId;
    private String name;

    // Getter for empId
    public int getEmpId() {
        return empId;
    }

    // Setter for empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

public class M2L4A1 {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setName("Rahul Sharma");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
    }
}