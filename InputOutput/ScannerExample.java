package InputOutput;

import java.util.Scanner;

/**
 * Demonstrates Scanner class for reading various types of user input
 * Scanner is convenient for reading different data types
 */
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Reading different types of input
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            System.out.print("Enter your height (in meters): ");
            double height = scanner.nextDouble();
            
            System.out.print("Are you a student? (true/false): ");
            boolean isStudent = scanner.nextBoolean();
            
            // Display the information
            System.out.println("\n--- Personal Information ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height + " meters");
            System.out.println("Student: " + (isStudent ? "Yes" : "No"));
            
        } catch (Exception e) {
            System.err.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Common Scanner Methods:

1. nextLine() -> Read a line of text (including spaces)
2. next() -> Read a single word (until space)
3. nextInt() -> Read an integer
4. nextFloat() -> Read a float
5. nextDouble() -> Read a double
6. nextLong() -> Read a long
7. nextShort() -> Read a short
8. nextByte() -> Read a byte
9. nextBoolean() -> Read a boolean
10. hasNext() -> Check if there's more input
11. hasNextInt() -> Check if next input is an integer
12. close() -> Close the scanner

Note: When mixing nextLine() with other next methods, 
you may need to call an extra nextLine() to consume the newline character.
*/
