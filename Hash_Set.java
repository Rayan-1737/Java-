import java.util.*;

public class Hash_Set {

    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Watermelon");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println(fruits);

        System.out.println(fruits.contains("Mango"));
        fruits.remove("Mango");
        System.out.println(fruits);
        System.out.println(fruits.size());
    }

}
