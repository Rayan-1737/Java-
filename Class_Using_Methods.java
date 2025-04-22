
class Car {
    String color;
    int price;
    String brand;

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: " + price);
        System.out.println("Car Brand: " + brand);
    }
}

public class Class_Using_Methods {

    public static void main(String args[]) {
        Car obj1 = new Car();
        obj1.color = "Red";
        obj1.price = 120000;
        obj1.brand = "BMW";

        // Calling the method to display details
        obj1.displayDetails();
    }
}









    



