package Assignment_4thMarch2025;

import java.util.Scanner;

class NumberIsZeroException extends Exception {
    public NumberIsZeroException(String message) {
        super(message);
    }
}

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        String input = scanner.next();

        try {
            int num = Integer.parseInt(input);

            if (num == 0) {
                throw new NumberIsZeroException("Number is Zero");
            }

            if (isPrime(num)) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is NOT a Prime Number.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Number is Invalid");
        } catch (NumberIsZeroException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
