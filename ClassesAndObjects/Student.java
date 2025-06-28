package ClassesAndObjects;

/**
 * Student class demonstrating basic class and object concepts
 * Shows how to create a class with fields and methods
 */
public class Student {
    // Instance variables
    private int rollNo;
    private String name;
    
    // Default constructor
    public Student() {
        this.rollNo = 0;
        this.name = "";
    }
    
    // Parameterized constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    
    // Method to set attendance (simulate setting student data)
    public void setStudentInfo(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    
    // Getter methods
    public int getRollNo() {
        return rollNo;
    }
    
    public String getName() {
        return name;
    }
    
    // Setter methods
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Display method
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("------------------------");
    }
    
    public static void main(String[] args) {
        // Creating objects using default constructor
        Student student1 = new Student();
        student1.setStudentInfo(12, "Kunal");
        student1.displayInfo();
        
        // Creating object using parameterized constructor
        Student student2 = new Student(15, "Rahul");
        student2.displayInfo();
    }
}
