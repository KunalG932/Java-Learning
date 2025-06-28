package InputOutput;

import java.io.*;

/**
 * Student Information System using BufferedReader
 * Demonstrates proper exception handling and input validation
 */
public class StudentInfo {
    public static void main(String[] args) {
        String name;
        int rollNo;
        String grade;
        double marks;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("=== Student Information System ===\n");
            
            // Get student information
            System.out.print("Enter student name: ");
            name = reader.readLine();
            
            System.out.print("Enter student roll number: ");
            String rollInput = reader.readLine();
            rollNo = Integer.parseInt(rollInput);
            
            System.out.print("Enter student marks (0-100): ");
            String marksInput = reader.readLine();
            marks = Double.parseDouble(marksInput);
            
            System.out.print("Enter student grade (A/B/C/D/F): ");
            grade = reader.readLine();
            
            // Calculate additional information
            String performance = getPerformanceLevel(marks);
            boolean isPassed = marks >= 40;
            
            // Display student information
            System.out.println("\n" + "=".repeat(35));
            System.out.println("      STUDENT INFORMATION");
            System.out.println("=".repeat(35));
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks: " + marks + "/100");
            System.out.println("Grade: " + grade);
            System.out.println("Performance: " + performance);
            System.out.println("Status: " + (isPassed ? "PASSED" : "FAILED"));
            System.out.println("=".repeat(35));
            
        } catch (NumberFormatException e) {
            System.err.println("Error: Please enter valid numbers for roll number and marks.");
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
        }
    }
    
    /**
     * Determines performance level based on marks
     */
    private static String getPerformanceLevel(double marks) {
        if (marks >= 90) return "Excellent";
        else if (marks >= 80) return "Very Good";
        else if (marks >= 70) return "Good";
        else if (marks >= 60) return "Average";
        else if (marks >= 40) return "Below Average";
        else return "Poor";
    }
}
