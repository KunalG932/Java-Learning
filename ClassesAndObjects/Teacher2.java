package ClassesAndObjects;
import java.util.Scanner;

class TeacherInfo {
    Scanner sc = new Scanner(System.in);
    String name, subName;
    int age, subCode, teacherId;

    void getInput() {
        System.out.print("Enter Teacher Name: ");
        name = sc.nextLine();
        System.out.print("Enter Subject Name: ");
        subName = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Subject Code: ");
        subCode = sc.nextInt();
        System.out.print("Enter Teacher ID: ");
        teacherId = sc.nextInt();
    }

    void displayInfo() {
        System.out.println("TEACHER INFORMATION");
        System.out.println("Name: " + name);
        System.out.println("Subject Name: " + subName);
        System.out.println("Age: " + age);
        System.out.println("Subject Code: " + subCode);
        System.out.println("Teacher ID: " + teacherId);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            TeacherInfo t = new TeacherInfo();
            t.getInput();
            t.displayInfo();
            t.sc.close();
        }
    }

}

