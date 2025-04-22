package Assignment_4thMarch2025;

import java.io.File;

public class DisplayFilePath {
    public static void main(String[] args) {
        File file = new File("renamed_example1.txt");

        if (file.exists()) {
            System.out.println("File path: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
