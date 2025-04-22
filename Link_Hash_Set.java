import java.util.*;

public class Link_Hash_Set {

    public static void main(String []args){
        LinkedHashSet<String> fruits =new LinkedHashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("melon");
        fruits.add("watermelon");
        fruits.add("tomato");
        System.out.println(fruits);
        fruits.add("carrit");
        fruits.add("banana");
        fruits.add("banana");     //duplicate ignored
        System.out.println(fruits);
        fruits.remove("carrit");
        fruits.remove("banana");
        System.out.println(fruits);
        System.out.println(fruits.contains("melon"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        fruits.clear();
        System.out.println(fruits);
    }



    
}
