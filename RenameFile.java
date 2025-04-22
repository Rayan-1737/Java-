package Assignment_4thMarch2025;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("example1.txt");
        File newFile = new File("renamed_example1.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed to: " + newFile.getName());
        } else {
            System.out.println("File rename failed.");
        }
    }
}

