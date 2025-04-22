class Car{
    
    String name;
    int price;
    String model;
    
    void display(){
        System.out.println("Nice Car");
    }
    
}

public class wow{
    public static void main(String args []){
        Car obj1 = new Car();
        obj1.name = "BMW";
        obj1.price = 7000000;
        obj1.model = "X5";
        
        System.out.println("My 1st Car Name Is :- " + obj1.name);
        System.out.println("Price Is :- " + obj1.price);
        System.out.println("Model Is :- " + obj1.model);
        
        
        System.out.println("\n");
        
        Car obj2 = new Car();
        obj2.name = "Audi";
        obj2.price = 5000000;
        obj2.model = "A5";
        
        System.out.println("My 2nd Car Name Is :- " + obj2.name);
        System.out.println("Price Is :- " + obj2.price);
        System.out.println("Model Is :- " + obj2.model);
        
        // obj1.display();
        // obj2.display();
        
    }
}