// Object-Oriented Programming System



class Car {    // Class Name First Letter Must Be In Capital ( Car  "C" is Capital )

    String color ;        // Property/Instance (variable).We can also assign the value here  Ex: String color = "Red";

    // void honk (){                //  Behavior (method)
    //     System.out.println("Hello Your Car Color Is Good");

    // }

}
public class class1 {
    public static void main(String args []){

        Car obj1 = new Car();            // Class Name Then Object Name  ex: Car obj1
        obj1.color = "Red";             // Accessing Property (Red)       
        System.out.println("My Car Color Is " + obj1.color); // Accessing Property  (Red)
        // obj1.honk();                   // Accessing Method   ("Hello Your Car Color Is Good") 

    }

}

/*
 class Car{
    String name;
    int price;
    
    void rayan(){
        System.out.println("Hello Nice Car");
    }
}

public class Main{
    public static void main(String [] args){
        Car obj1 = new Car();
        obj1.name = "BMW";
        Car obj2 = new Car();
        obj2.price = 200000;
        System.out.println("My Car Name Is " + obj1.name);
        System.out.println("My Car Price Is" + obj2.price);
        obj2.rayan();     //  If you write obj1.rayan(); instead of obj2.rayan();, there will be no difference in the output.
        
    }
}

 */

