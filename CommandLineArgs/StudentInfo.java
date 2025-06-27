import java.io.*;

public class StudentInfo {
     {
      public static void main(String[] args) {
        String name;
        int rollNo;
        String grade;

        // Create BufferedReader object
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
        // Get student information
        System.out.print("Enter student name: ");
        name = reader.readLine();
            
        System.out.print("Enter student roll number: ");
        rollNo = Integer.parseInt(reader.readLine());
            
        System.out.print("Enter student grade: ");
        grade = reader.read();
            
        // Display student information
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);  
        
        }
    }
}
