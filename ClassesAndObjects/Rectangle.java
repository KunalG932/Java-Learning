package ClassesAndObjects;

import java.util.Scanner;

/**
 * Rectangle class demonstrating encapsulation and basic geometry calculations
 * Calculates area and perimeter of a rectangle
 */
public class Rectangle {
    // Private instance variables for encapsulation
    private float width;
    private float length;
    private float area;
    private float perimeter;
    
    // Default constructor
    public Rectangle() {
        this.width = 0.0f;
        this.length = 0.0f;
        this.area = 0.0f;
        this.perimeter = 0.0f;
    }
    
    // Parameterized constructor
    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
        calculateArea();
        calculatePerimeter();
    }
    
    // Method to get input from user
    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        this.width = sc.nextFloat();
        System.out.print("Enter the length of the rectangle: ");
        this.length = sc.nextFloat();
        sc.close();
    }
    
    // Method to calculate area
    public void calculateArea() {
        this.area = width * length;
    }
    
    // Method to calculate perimeter
    public void calculatePerimeter() {
        this.perimeter = 2 * (width + length);
    }
    
    // Getter methods
    public float getWidth() {
        return width;
    }
    
    public float getLength() {
        return length;
    }
    
    public float getArea() {
        return area;
    }
    
    public float getPerimeter() {
        return perimeter;
    }
    
    // Setter methods
    public void setWidth(float width) {
        this.width = width;
        calculateArea();
        calculatePerimeter();
    }
    
    public void setLength(float length) {
        this.length = length;
        calculateArea();
        calculatePerimeter();
    }
    
    // Display method
    public void displayInfo() {
        System.out.println("\n--- Rectangle Information ---");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args) {
        // Create rectangle object
        Rectangle rect = new Rectangle();
        
        // Get input from user
        rect.getInput();
        
        // Calculate area and perimeter
        rect.calculateArea();
        rect.calculatePerimeter();
        
        // Display results
        rect.displayInfo();
    }
}
