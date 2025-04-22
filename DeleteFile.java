package Assignment_4thMarch2025;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("renamed_example1.txt");

        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("File deletion failed.");
        }
    }
}

