package Rayan_Java_12th_March;

import java.util.*; // Importing required Java utilities

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);

        // Printing elements in sorted order (PriorityQueue automatically sorts in ascending order)
        System.out.println("Elements in sorted order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // Removes and prints the smallest element
        }
    }
}



