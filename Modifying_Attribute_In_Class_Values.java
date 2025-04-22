class Car {
    String color;
    int price;
    String brand;
}

public class Modifying_Attribute_In_Class_Values {
    public static void main(String args[]) {
        // Creating an object of the Car class
        Car obj1 = new Car();

        // Assigning initial values to attributes
        obj1.color = "Red";
        obj1.price = 120000;
        obj1.brand = "BMW";

        // Accessing and printing attributes
        System.out.println("Initial Car Details:");
        System.out.println("Car Color: " + obj1.color);  // The dot (.) is used to access the object's attributes and methods.
        System.out.println("Car Price: " + obj1.price);
        System.out.println("Car Brand: " + obj1.brand);

        // To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

        // Modifying attribute values
        obj1.color = "Blue";     // Changing color from "Red" to "Blue"
        obj1.price = 150000;      // Changing price from 120000 to 150000

        // Accessing and printing modified attributes
        System.out.println("\nModified Car Details:\n");
        System.out.println("Car Color: " + obj1.color);
        System.out.println("Car Price: " + obj1.price);
        System.out.println("Car Brand: " + obj1.brand); // Brand remains unchanged
    }
}







