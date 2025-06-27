// BufferedReader 

import java.io.*;

public class CommandLineArgs {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter your name: ");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        name = b.readLine();
        System.out.println("Hello, " + name + "!");
        b.close();
    }
}

/*
Functions Of BufferedReader

1. readLine() -> Read a line of text
2. read() -> Read a single character
3. close() -> Close the stream
4. readInt() -> Read an integer
5. readFloat() -> Read a float
6. readDouble() -> Read a double
7. readLong() -> Read a long
8. readShort() -> Read a short
9. readByte() -> Read a byte
10. readBoolean() -> Read a boolean
11. readChar() -> Read a character
12. readUTF() -> Read a UTF string

*/