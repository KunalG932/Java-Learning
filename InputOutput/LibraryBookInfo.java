package InputOutput;

import java.util.Scanner;

/**
 * Library Book Information System
 * Demonstrates comprehensive input handling using Scanner
 */
public class LibraryBookInfo {
    public static void main(String[] args) {
        String title;
        String author;
        int publicationYear;
        String category;
        double price;
        boolean isAvailable;
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== Library Book Information System ===\n");
            
            // Get book information
            System.out.print("Enter book title: ");
            title = scanner.nextLine();
            
            System.out.print("Enter author name: ");
            author = scanner.nextLine();
            
            System.out.print("Enter publication year: ");
            publicationYear = scanner.nextInt();
            
            System.out.print("Enter book price: $");
            price = scanner.nextDouble();
            
            // Clear the buffer after reading numeric input
            scanner.nextLine();
            
            System.out.print("Enter book category: ");
            category = scanner.nextLine();
            
            System.out.print("Is the book available? (true/false): ");
            isAvailable = scanner.nextBoolean();
            
            // Display book information
            System.out.println("\n" + "=".repeat(40));
            System.out.println("         LIBRARY BOOK INFORMATION");
            System.out.println("=".repeat(40));
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Publication Year: " + publicationYear);
            System.out.println("Category: " + category);
            System.out.println("Price: $" + String.format("%.2f", price));
            System.out.println("Status: " + (isAvailable ? "Available" : "Not Available"));
            System.out.println("=".repeat(40));
            
        } catch (Exception e) {
            System.err.println("Error: Invalid input format. " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
