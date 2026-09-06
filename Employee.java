abstract class Workers {
    private String company;
    private String companyType;
    abstract public String role();
    
    public void setCompany(String company) {
        this.company = company;
    }
    public void getCompany() {
        System.out.println(" Comapny = " + company);
    }
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }
    public void getCompanyType() {
        System.out.println( "Company Type = " + companyType);
    }
}

class Manager extends Workers {
    private String name;
    private String team;
    private int salary;
    private int members;

    Manager ( String name, String team, int salary, int members) {
        this.name = name;
        this.team = team;
        this.salary = salary;
        this.members = members;
    }
    public void getName() {
        System.out.println( " Name of Manager is " + name);
    }
    public void getTeam() {
        System.out.println( " Team of manager is " + team);
    }
    public void getSalary() {
        System.out.println("Manager salary is = " + salary);
    }
    public void getMembers() {
        System.out.println(" Members under Manager are = " + members);
    }
    @Override
    public String role() {
        return "Manager";
    }
}

public class Employee {
    public static void main(String[] args) {
        Manager m1 = new Manager("Shivanshu","Java Developer",30000,25);

        m1.setCompany("TCS");
        m1.setCompanyType("IT");


        m1.getCompany();
        m1.getCompanyType();
        m1.getName();
        m1.getTeam();
        m1.getSalary();
        m1.getMembers();
        System.out.println(" Role in team = " + m1.role());
    }
}