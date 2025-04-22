@FunctionalInterface
interface Addition {
    double add(int number1, int number2);
}

public class AdditionLambda {
    public static void main(String[] args) {
        Addition addition = (number1, number2) -> number1 + number2;
        System.out.println(addition.add(45, 55));
    }
}
