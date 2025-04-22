import java.util.*;

public class Hash_Map {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Orange");
        System.out.println("Value For Key 2 Is: " + map.get(2));

        for (Integer Key : map.keySet()) {
            System.out.println("Key: " + Key + " Value: " + map.get(Key));


    
        }

        System.out.println(map);
    }
}

