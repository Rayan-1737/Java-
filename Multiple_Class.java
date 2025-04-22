class Car {
    String name;
    int price;
    float emi;

    void display() {
        System.out.println("Car Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("EMI: " + emi);
    }
}

class Owner {
    String ownerName;
    int age;

    void showOwner() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Owner Age: " + age);
    }
}

public class Multiple_Class {

    public static void main(String args[]) {
        Car obj = new Car();
        obj.name = "BMW";
        obj.price = 1000000;
        obj.emi = 225.55f;

        Owner owner = new Owner();
        owner.ownerName = "Rayan";
        owner.age = 25;

        obj.display();
        
        System.out.println("\n");
        
        owner.showOwner();
    }


    
}



