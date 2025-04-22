package Rayan_Java_12th_March;

import java.util.*; // Importing required Java utilities

public class CheckElementInHashSet {
    public static void main(String[] args) {
        // Creating a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(47);
        numbers.add(5);
        numbers.add(30);

        // Checking if 5 is in the HashSet and printing the result
        System.out.println(numbers.contains(5)); // true if 5 is present, false otherwise
    }
}
