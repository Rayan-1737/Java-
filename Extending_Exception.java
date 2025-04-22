package File_Handling;

// Custom exception class
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Extending_Exception {
    public static void main(String[] args) {
        int age = 15;

        try {
            if (age < 18) {
                throw new AgeException("Age must be 18 or greater");
            }
            System.out.println("You Are Eligible");
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

