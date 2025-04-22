abstract class Vehicle {
  
    public abstract void startEngine();
}


class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}


class Bike extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }
}


public class Assignment_17th_Feb {
    public static void main(String[] args) {
        
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        
        car.startEngine();
        bike.startEngine();
    }
}
