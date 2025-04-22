class Car {
    // Defining multiple attributes for the Car class
    String color;
    int price;
    String brand;
    int speed;
    String fuelType;
}

public class Class_Multiple_Attribute {

    public static void main(String args[]) {
        // Creating an object of the Car class
        Car obj1 = new Car();

        // Assigning values to attributes
        obj1.color = "Red";       // Setting car color
        obj1.price = 120000;      // Setting car price
        obj1.brand = "BMW";       // Setting car brand
        obj1.speed = 220;         // Setting car speed in km/h
        obj1.fuelType = "Petrol"; // Setting fuel type

        // Printing all attributes
        System.out.println("Car Details:");
        System.out.println("Color: " + obj1.color);       // Display car color
        System.out.println("Price: " + obj1.price);       // Display car price
        System.out.println("Brand: " + obj1.brand);       // Display car brand
        System.out.println("Speed: " + obj1.speed + " km/h"); // Display car speed
        System.out.println("Fuel Type: " + obj1.fuelType); // Display fuel type
    }


    
}

