package Assignment_4thMarch2025;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String fileName = "example1.txt";
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating the file.");
            e.printStackTrace();
        }
    }
}

