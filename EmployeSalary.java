class Employee{
    private String name;
    private double salary;

    Employee ( String name) {
        this.name = name;
    }
    public void setName( String name) {
        this.name = name;
    }
    public void getName() {
        System.out.println( " Employee name = " + name);
    }
    public void setOldSalary( double salary) {
        if ( salary < 10000) {
            System.out.println( " Invalid Salary");
        }
        else {
            this.salary = salary;
            System.out.println( " Old Salary is = " + salary);
        }
    }
    public void setRaise() {
        if ( salary >= 15000) {
            salary = salary + ( salary * 5/100);
            System.out.println( " Increment in Salary = " + salary * 5/100);
        }
        else if ( salary >= 25000 && salary <= 40000) {
            salary = salary + ( salary * 10/100);
            System.out.println( " Increment in Salary = " +   salary * 10/100);
        }
        else if ( salary >= 40000) {
            salary = salary + ( salary * 15/100); 
            System.out.println("Increment in Salary = " +  salary * 15/100);
            
        }
        else {
            System.out.println( " No data found");
        }
    }
    public void getFinalSalary(){
        if ( salary < 10000) {
            System.out.println( " No record found" + "\n");
        }
        else {
            System.out.println( " Salary after increment = " + salary + "\n") ;
        }
    }
}
public class EmployeSalary {
    public static void main(String[] args) {
        Employee Emp1 = new Employee( "Shivanshu");
        Employee Emp2 = new Employee( "Pulkit");
        Employee Emp3 = new Employee("Adarash");
        Employee Emp4 = new Employee("Sunny");
        
        Emp1.getName();
        Emp1.setOldSalary(-50);
        Emp1.setRaise();
        Emp1.getFinalSalary();
        
        Emp2.getName();
        Emp2.setOldSalary(50000);
        Emp2.setRaise();

        
        Emp2.getFinalSalary();
        
        Emp3.getName();
        Emp3.setOldSalary(5000);
        Emp3.setRaise();
        Emp3.getFinalSalary();
        
        Emp4.getName();
        Emp4.setOldSalary(60000);
        Emp4.setRaise();
        Emp4.getFinalSalary();
    }
}
