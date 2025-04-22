package Rayan_Java_12th_March;

import java.util.ArrayList; // Importing ArrayList class

public class MaxElementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // Creating an ArrayList of integers
        numbers.add(10);
        numbers.add(25);
        numbers.add(47);
        numbers.add(5);
        numbers.add(30);

        // Check if the list is empty
        if (numbers.isEmpty()) {
            System.out.println("The ArrayList is empty.");
            return; // Stop the program if the list is empty
        }

        int maxElement = numbers.get(0); // Start with the first element as max

        // Loop through the list to find the maximum number
        for (int num : numbers) {
            if (num > maxElement) {
                maxElement = num; // Update max if a bigger number is found
            }
        }

        // Print the maximum element
        System.out.println("The maximum element in the ArrayList is: " + maxElement);
    }
}
