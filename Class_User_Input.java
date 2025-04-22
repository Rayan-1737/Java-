import java.util.Scanner;

class School{
    String name;
    int fees;
    String board;
    
}

public class Class_User_Input {
    public static void main(String args []){
        
        Scanner sc = new Scanner(System.in);
        
        School obj1 = new School();
        
        System.out.println("Enter Your School Name:- ");
        obj1.name = sc.nextLine();
        
        
        System.out.println("Enter Your Fees:- ");
        obj1.fees = sc.nextInt();
        
        sc.nextLine();
        
        
        System.out.println("Enter Your Board:- ");
        obj1.board = sc.nextLine();
        
        
        System.out.println("\n");
        
    
        System.out.println("My School Name:- " + obj1.name );
        System.out.println("Fees Is:- " + obj1.fees );
        System.out.println("Board Is:- " + obj1.board );
        
        
        sc.close();
    }
}

