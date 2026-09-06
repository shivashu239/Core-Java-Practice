class Employee {
    private String name;
    private int salary;

    Employee( String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public void getEmployee() {
        System.out.println("Name of Employee = " + name + "\n" + "Salary = " + salary + "\n");
    }
}

class Manager extends Employee {
    int teamSize;

    Manager( String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    public void getSize() {
        System.out.println("Team size is = " + teamSize);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Manager m1 = new Manager( "Shivanshu", 25000, 15);
        m1.getEmployee();
        m1.getSize();
    }
}