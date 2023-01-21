package loops;

import java.util.ArrayList;
import java.util.List;

public class ForEachWithLambdas {

    public static void main(String[] args) {

        List fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);
        fruits.forEach(f -> {
            f = "fruits: " + f;
            System.out.println(f);
        });
    }
}