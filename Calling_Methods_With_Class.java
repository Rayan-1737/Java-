class Car {
    String color;
    int price;
    String brand;

    // Method to simulate full throttle
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Method to display max speed
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}


public class Calling_Methods_With_Class {


    public static void main(String args[]) {
        // Creating an object of the Car class
        Car obj1 = new Car();

        // Assigning initial values to attributes
        obj1.color = "Red";
        obj1.price = 120000;
        obj1.brand = "BMW";

        // Accessing and printing attributes
        System.out.println("Initial Car Details:");
        System.out.println("Car Color: " + obj1.color);
        System.out.println("Car Price: " + obj1.price);
        System.out.println("Car Brand: " + obj1.brand);

        // Calling methods
        obj1.fullThrottle();
        obj1.speed(200);

        
    }
}
    



