package BasicPrograms;

/**
 * Command Line Arguments Example
 * Demonstrates how to use command line arguments in Java
 * 
 * To run with arguments:
 * java BasicPrograms.CommandLineArgsExample arg1 arg2 arg3
 */
public class CommandLineArgsExample {
    public static void main(String[] args) {
        System.out.println("=== Command Line Arguments Demo ===\n");
        
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
            System.out.println("Usage: java CommandLineArgsExample <arg1> <arg2> ... <argN>");
            System.out.println("\nExample: java CommandLineArgsExample John 25 Engineer");
            return;
        }
        
        // Display number of arguments
        System.out.println("Number of arguments: " + args.length);
        System.out.println("Arguments received:");
        
        // Display all arguments with their positions
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
        
        // Example: Process arguments as specific data types
        if (args.length >= 3) {
            try {
                String name = args[0];
                int age = Integer.parseInt(args[1]);
                String profession = args[2];
                
                System.out.println("\n--- Processed Information ---");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Profession: " + profession);
                
                // Calculate some information
                int yearsToRetirement = Math.max(0, 65 - age);
                System.out.println("Years to retirement: " + yearsToRetirement);
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Second argument should be a valid number (age).");
            }
        }
        
        // Demonstrate joining arguments
        System.out.println("\nAll arguments combined: " + String.join(" ", args));
    }
}
