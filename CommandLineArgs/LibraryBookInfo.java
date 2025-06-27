import java.util.*;

public class LibraryBookInfo {
    public static void main(String[] args) {
        String title;
        String author;
        int year;
        String category;
        
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Get book information
        System.out.print("Enter book title: ");
        title = scanner.nextLine();
        
        System.out.print("Enter author name: ");
        author = scanner.nextLine();
        
        System.out.print("Enter publication year: ");
        year = scanner.nextInt();
        
        // Clear the buffer
        scanner.nextLine();
        
        System.out.print("Enter book category: ");
        category = scanner.nextLine();
        
        // Display book information
        System.out.println("\n--- Library Book Information ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Category: " + category);
        
        // Close the scanner
        scanner.close();
    }
}
