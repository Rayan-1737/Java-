package Array;

public class Multidimensional_Arrays {
    public static void main(String[] args) {
        int [] [] hello = { { 1, 2, 3 }, { 4, 5, 6 } };   // Multidimensional Array
        System.out.println(hello[0][2]);   //  Accessing Elements With First 0 of first Bracket and 2 is the 
                                          //   inside Element to which acess 

    }
}


// Change The Elemnts Value 👇

/* 
 
class Main {
    public static void main(String[] args) {
        int [][] num = {{1,2,3,4},{5,6,7,8,9}};

        num [0][3] = 2; // element position and the change of the element 
        
        System.out.println(num [0][2]);
    }
}

 */


 /*  

 //  Loop Through a Multi-Dimensional Array 

  public class Main {
    public static void main(String[] args) {
        int [][] num = {{1,2,3,4},{5,6,7,8,9}};
        
        for(int i = 0 ; i < num.length;i++){
            for (int j = 0 ; j < num[i].length;j++){
        
               System.out.println(num [i][j]);
            }
        }
    }
}


*/

//  for-each loop Through a Multi-Dimensional Array

/*

public class Test {
    public static void main(String [] args ){

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
          for (int i : row) {      //  
            System.out.println(i);
          }
        }
            }

    }
    
 */


