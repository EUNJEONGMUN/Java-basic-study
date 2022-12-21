package java의정석.ch11;

import java.util.Arrays;
import java.util.List;

public class java11 {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "my", "name", "is", "haena!");
        String[] toArray = strings.toArray(new String[0]);
        String[] java11ToArray = strings.toArray(String[]::new);
        Arrays.toString(toArray);
        System.out.println("toArray = " + toArray);
        String s = Arrays.toString(toArray);
        System.out.println("toArray = " + toArray);
        System.out.println(Arrays.toString(toArray));

        Integer one = 1;
        Integer two = 2;
        int three = one+two;
        System.out.println(three);
    }
}
