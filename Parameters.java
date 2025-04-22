package Methods;

public class Parameters {

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");  // fname is a parameter
      }
    
      public static void main(String[] args) {
        myMethod("Liam"); // it is an argument
        myMethod("Jenny");  // it is an argument
        myMethod("Anja");   // it is an argument

    
      }
    
}

// Multiple Pareametrs 👇

/* 

public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}

// Liam is 5
// Jenny is 8
// Anja is 31
 
 */


 