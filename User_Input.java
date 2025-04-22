package Basics;
/* 

nextInt()	      int	       sc.nextInt();
nextFloat()	     float	       sc.nextFloat();
nextDouble()	 double	       sc.nextDouble();
nextLine()	     String	       sc.nextLine(); (for full sentence)
next()	         String	       sc.next(); (for single word)
 
*/

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {    // main method required to run the program
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();           // Taking string input

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();                // Taking integer input

        System.out.println("Your Name Is " + name + " And Your Age Is " + age);

        sc.close();                          // Closing the scanner
    }
}

