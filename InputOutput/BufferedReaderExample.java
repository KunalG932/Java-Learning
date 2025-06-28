package InputOutput;

import java.io.*;

/**
 * Demonstrates BufferedReader for reading user input
 * BufferedReader is efficient for reading text from input streams
 */
public class BufferedReaderExample {
    public static void main(String[] args) {
        String name;
        BufferedReader reader = null;
        
        try {
            System.out.print("Enter your name: ");
            reader = new BufferedReader(new InputStreamReader(System.in));
            name = reader.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            // Close the reader in finally block
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing reader: " + e.getMessage());
                }
            }
        }
    }
}

/*
Common BufferedReader Methods:

1. readLine() -> Read a line of text
2. read() -> Read a single character
3. close() -> Close the stream
4. ready() -> Check if the stream is ready to be read
5. mark() -> Mark the current position in the stream
6. reset() -> Reset the stream to the marked position
7. skip() -> Skip characters in the stream

Note: BufferedReader doesn't have direct methods for reading primitives.
You need to use wrapper classes like Integer.parseInt(), Double.parseDouble(), etc.
*/
