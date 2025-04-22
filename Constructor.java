class Car { 
    String name; 
    int price; 
    String model;

    // Constructor
    Car(String n, int p, String m) {
        name = n;
        price = p;
        model = m;
    }
}

public class Constructor {
    public static void main(String args[]) { 
        // Creating an object using the constructor
        Car obj1 = new Car("BMW", 7000000, "X5");    // Assigning the values in the constructor in name,price,model.

        System.out.println("My 1st Car Name Is :- " + obj1.name);         
        System.out.println("Price Is :- " + obj1.price);         
        System.out.println("Model Is :- " + obj1.model);     
    }   


    
}




