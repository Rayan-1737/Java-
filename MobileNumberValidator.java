package File_Handling;
import java.util.Scanner;

// Custom exception class
class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class MobileNumberValidator {
    // Method to check mobile number validity
    static void validateMobileNumber(String mobileNumber) {
        if (!mobileNumber.matches("[6789]\\d{9}")) {
            throw new InvalidDataException("Invalid Data: Mobile number must be 10 digits and start with 6, 7, 8, or 9.");
        }
        System.out.println("Valid Mobile Number: " + mobileNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine();
        
        try {
            validateMobileNumber(mobileNumber);
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}

