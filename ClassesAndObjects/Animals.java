package ClassesAndObjects;
import java.util.Scanner;

class Animals {
    String name, animalCategory, breed;
    int age, blockNo;
    Scanner sc = new Scanner(System.in);
    void getInput() {

        System.out.print("Enter Animal Name: ");
        name = sc.nextLine();
        System.out.print("Enter Animal Category: ");
        animalCategory = sc.nextLine();
        System.out.print("Enter Breed: ");
        breed = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Block No: ");
        blockNo = sc.nextInt();
    }
    void displayInfo() {
        System.out.println("ANIMAL INFORMATION");
        System.out.println("Name: " + name);
        System.out.println("Category: " + animalCategory);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Block No: " + blockNo);
    }

    void closeScanner() {
        sc.close();

    }

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            Animals animal = new Animals();
            animal.getInput();
            animal.displayInfo();
            animal.closeScanner();
        }
    }
}

