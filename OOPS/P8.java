package OOPS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P8 {

    private static final String FILE_NAME = "sample_data.txt";
    private static final String CONTENT_TO_WRITE = "This is the content written to the file.\nIt demonstrates basic file writing and reading in Java.";

    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    private static void writeFile() {
        try {
            FileWriter writer = new FileWriter(FILE_NAME);
            writer.write(CONTENT_TO_WRITE);
            writer.close();
            System.out.println("Successfully wrote content to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("An error occurred during file writing.");
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try {
            File file = new File(FILE_NAME);
            Scanner reader = new Scanner(file);
            System.out.println("\nReading content from " + FILE_NAME + ":");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred during file reading.");
            e.printStackTrace();
        }
    }
}
