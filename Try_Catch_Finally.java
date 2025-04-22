package File_Handling;

public class Try_Catch_Finally {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        try{
            
            // Code That May Throw An Exception 

            int c = a/b;
            System.out.println("Result is: " + c);

        }

        catch (ArithmeticException e){
            System.out.println("Exception is: " + e);

            // Code That Will Be Executed If An Exception Occurs
        }
        
        finally{
            System.out.println("Finally block is executed");

            // Code That Will Always Be Executed

        }
    
    }
}

