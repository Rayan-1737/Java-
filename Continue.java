package Conditional_Statements;

public class Continue {

    public static void main(String[] args) {
        
        for (int i = 1; i<=10; i++ ){
            System.out.println(i);
            if (i==5){       //  will skip 5 and Continue print  till 10
                continue;   // The continue statement can also be used to skip the current iteration of a loop.
            }
        }
    }
    
}
