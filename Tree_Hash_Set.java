import java.util.*;

public class Tree_Hash_Set {

    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(50);
        set.add(609);
       System.out.println(set.hashCode());
       System.out.println(set);
       set.add(98);
       set.add(98);
       System.out.println(set);  //maintains order sorted,no duplicate value printed
        
    }

}


