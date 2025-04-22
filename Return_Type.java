// void → No value is returned.
// int → Returns an integer.
// double → Returns a decimal number.
// String → Returns a text string.
// boolean → Returns true or false.
// Object/Class → Returns an object of a class.

package Methods;

public class Return_Type {

    static int myMethod(int x) {
        return 5 + x;
      }
    
      public static void main(String[] args) {
        System.out.println(myMethod(3));     // Outputs 8 (5 + 3) 
      }

}

/*
 
public class Main {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(5, 3));
  }
}
// Outputs 8 (5 + 3)

 */



// Store the result in a variable (recommended, as it is easier to read and maintain):

/*

 public class Main {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int z = myMethod(5, 3);
    System.out.println(z);
  }
}
// Outputs 8 (5 + 3)

 */



 