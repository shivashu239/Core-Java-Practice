interface Scheduable {
    void setShift(String shift);
}
abstract class Staff {
    private String name;
    private int baseSalary;

    Staff(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getName() {
        return name;
    }
    public void displayName() {
        System.out.println("User name " + name);
    }
    public int getBaseSalary() {
        System.out.println("Base Salary = " + baseSalary);
        return baseSalary;
    }
}
class Doctor extends Staff implements Scheduable {
    private String speciality;

    Doctor(String name, int baseSalary, String speciality) {
        super(name, baseSalary);
        this.speciality = speciality;
    }
    public void setShift(String shift) {
        System.out.println(getName() + " is schedule for " + shift + "shift");
    }
    public void getSpeciality() {
        System.out.println("Speciality of " + getName() + " is " + speciality + "\n");
    }
}
class Nurse extends Staff implements Scheduable {
    Nurse(String name, int baseSalary) {
        super(name, baseSalary);
    }
    public void setShift(String shift) {
        System.out.println("Shift of " + getName() + " is " + shift + "\n");
    }
}
public class HospitalStaff {
    public static void main(String[] args) {
        Doctor d = new Doctor("Shivanshu", 40000, "Heart");
        Doctor d1 = new Doctor("Pulkit",30000,"Neurology");
        Nurse n = new Nurse("Riya",20000);
        Nurse n1 = new Nurse("Prachi",25000);
        
        d.displayName();
        d.getBaseSalary();
        d.setShift("10 am to 6 pm");
        d.getSpeciality();

        d1.displayName();
        d1.getBaseSalary();
        d1.setShift("12 pm to 9 pm");
        d1.getSpeciality();
        
        n.displayName();
        n.getName();
        n.getBaseSalary();
        n.setShift("8 am to 4 pm");
        
        n1.displayName();
        n1.getName();
        n1.getBaseSalary();
        n1.setShift("11 am to 5 pm");
    }
}