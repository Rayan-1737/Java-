package Conditional_Statements;

public class TernaryOperator {

  public static void main(String[] args) {
    int hour = 20;
    String greeting = (hour < 18) ? "Good day." : "Good evening.";
    System.out.println(greeting);
  }
}

