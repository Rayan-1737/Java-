class Car {
    String color;
    int price;
    String brand;
}

public class Class_Multiple_Object {
    public static void main(String args[]) {
        // Creating multiple objects of the Car class
        Car obj1 = new Car();
        Car obj2 = new Car();
        Car obj3 = new Car();

        // Assigning values to obj1
        obj1.color = "Red";
        obj1.price = 120000;
        obj1.brand = "BMW";

        // Assigning values to obj2
        obj2.color = "Blue";
        obj2.price = 90000;
        obj2.brand = "Audi";

        // Assigning values to obj3
        obj3.color = "Black";
        obj3.price = 150000;
        obj3.brand = "Mercedes";

        // Printing details
        System.out.println("Car 1: " + obj1.color + ", " + obj1.price + ", " + obj1.brand);
        System.out.println("Car 2: " + obj2.color + ", " + obj2.price + ", " + obj2.brand);
        System.out.println("Car 3: " + obj3.color + ", " + obj3.price + ", " + obj3.brand);
    }
}
