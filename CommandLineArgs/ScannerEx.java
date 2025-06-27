// Scanner -> Scanner is a class in Java that provides a method for reading input from the user.

import java.util.*;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}


/*
Functions Of Scanner

1. nextLine() -> Read a line of text
2. next() -> Read a single word
3. nextInt() -> Read an integer
4. nextFloat() -> Read a float
5. nextDouble() -> Read a double
6. nextLong() -> Read a long
7. nextShort() -> Read a short
8. nextByte() -> Read a byte
9. nextBoolean() -> Read a boolean
10. nextChar() -> Read a character
11. nextUTF() -> Read a UTF string

*/
