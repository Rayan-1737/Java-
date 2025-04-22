package Conditional_Statements;

public class Inner_Outer_Loop {
    public static void main(String[] args) {
        System.out.println("Inner Loop:- ");
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("Outer Loop:- ");
        for (int j = 1; j < 5; j++) {
            System.out.println(j);
        }
    }
}
