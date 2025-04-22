import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        p.setName(name);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        p.setAge(age);

        System.out.println("\nName: " + p.getName());
        System.out.println("Age: " + p.getAge());

        sc.close();
    }
}
