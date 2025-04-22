import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Watermelon");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println(fruits);

        fruits.remove("Mango");

        System.out.println("after removing mango, list is : "+fruits);

        fruits.set(1,"Kiwi");

        System.out.println("After updating element list is : "+fruits);

        System.out.println("Get element from arraylist index 1 : "+fruits.get(1));
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

    
}
