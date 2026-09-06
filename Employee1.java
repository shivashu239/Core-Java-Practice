abstract class workers {
    String company;
    abstract int salary();

    public void setCompany( String company ) {
        this.company = company;
    }
    public void getCompany() {
        System.out.println(" Company = " + company);
    }
}

class Manager extends workers {
    String name;
    int base = 30000;
    int bonus = 10000;

    Manager (String name) {
        this.name = name;
    }
    public void getName() {
        System.out.println( " Name of Manager is = " + name);
    }
    public int salary() {
        return base + bonus;
    }
}
class Developer extends workers {
    String devName;
    int base = 25000;
    int overTimePay = 5000;

    Developer( String devName) {
        this.devName = devName;
    }
    public void getDevName() {
        System.out.println(" Developer name = " + devName);
    }
    @Override
    public int salary() {
        return base + overTimePay;
    }
}

    public class Employee1 {
        public static void main(String[] args) {
            Manager m1 = new Manager("Shivanshu");
            Developer d1 = new Developer("Pulkit");

            m1.setCompany("TCS");
            m1.getCompany();
    
            m1.getName();
            System.out.println( " Manager Salary = " + m1.salary());             

            d1.getDevName();
            System.out.println("Developer Salary = " + d1.salary());
        
    } 
}