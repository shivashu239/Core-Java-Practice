import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private double basicSalary;

    public void setEmpID(int empId) {
        this.empId = empId;
    }
    public int getEmpID() {
        return empId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBaseSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public double calculatePayout() {
        return basicSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    @Override
    public double calculatePayout() {
        return getBasicSalary() + bonus;
    }
}

public class EmpTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee m = new Manager();

        System.out.print("Enter your Employee ID = ");
        int empId = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter your name = ");
        String name = sc.nextLine();

        System.out.print("Enter your basic Salary = ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter bonus = ");
        double bonus = sc.nextDouble();

        m.setEmpID(empId);
        m.setName(name);
        m.setBaseSalary(basicSalary);
        ((Manager) m).setBonus(bonus);   

        System.out.println("\nYour Employee ID = " + m.getEmpID());
        System.out.println("Name of Employee is = " + m.getName());
        System.out.println("Basic salary = " + m.getBasicSalary());
        System.out.println("Total payout = " + m.calculatePayout());   
    }
}