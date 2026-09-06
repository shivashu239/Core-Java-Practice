class Student {
    public  String name;
    public int age;
    public char Gender;
    private int rollNo;
    static String coll;
    static private String course;
    static private final int totalStudents = 40;

    Student( String name, int age, char Gender) {
        this.name = name;
        this.age = age;
        this.Gender = Gender;
        }
        
        public void setRollNo( int rollNo) {
            this.rollNo = rollNo;
        }
        void getRollNo() {
            System.out.println(" Roll Number = " + rollNo);
        }
        public void setCollege( String coll){
            this.coll = coll;
        }
        public void setCourse( String course) {
            this.course = course;
        }
        public void getCourse() {
            System.out.println("Course = " + course); 
        }
        public void getColl() {
            System.out.println("College = " + coll);
        }
        void getTotalStudent() {
            System.out.println("\n" + "Total students in CSE = " + totalStudents);
        }
}

public class encapsulation {
    public static void main( String[] args) {
        Student s1 = new Student("Shivanshu", 22, 'M');
        Student s2 = new Student("Pulkit", 26, 'M');
        Student s3 = new Student("Adarash", 25, 'M');

        System.out.println("Name = " + s1.name + "\n" + "Age = " + s1.age + "\n" + "Gender = " + s1.Gender);
        s1.setRollNo(37);
        s1.getRollNo();
        s1.setCourse("Computer Science");
        s1.getCourse();
        s1.setCollege("TMU");
        s1.getColl();

        System.out.println("\n" + "Name = " + s2.name + "\n" + "Age = " + s2.age + "\n" + "Gender = " + s2.Gender);
        s2.setRollNo(40);
        s2.getRollNo();
        s2.getColl();
        s3.getCourse();

        System.out.println("\n" + "Name = " + s3.name + "\n" + "Age = " + s3.age + "\n" + "Gender = " + s3.Gender);
        s3.setRollNo(01);
        s3.getRollNo();
        s3.getColl();
        s3.getCourse();

        s3.getTotalStudent();
    }
}
