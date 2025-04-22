// Define the OddNumber interface
@FunctionalInterface
interface OddNumber {
    boolean isOdd(int number);
}

public class OddNumberLambda {
    public static void main(String[] args) {

        // Lambda expression to check if a number is odd
        OddNumber oddCheck = (number) -> number % 2 != 0;

        // Test the lambda with some numbers
        System.out.println("Is 5 odd? " + oddCheck.isOdd(5)); // true
        System.out.println("Is 10 odd? " + oddCheck.isOdd(10)); // false
    }
}




