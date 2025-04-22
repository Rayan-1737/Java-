package Java_WorkShop;

import java.util.Arrays;
import java.util.List;

public class StringCaseConverter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Rayan", "Is", "Here");

        convertCase(words);
    }

    private static void convertCase(List<String> words) {
        words.forEach(word -> System.out.println("Uppercase: " + word.toUpperCase()));
        words.forEach(word -> System.out.println("Lowercase: " + word.toLowerCase()));
    }
}

