package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        //types of sets hash sets, linked hash set and tree sets
        //cannot be duplicate items in a set

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("have lemon? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("Number of elements after removing lemon: " + fruits.size());

        /*Setting a collection using .of makes the
        collection immutable (it cannot be changed)
         */
        Set moreFruit = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruit);
    }
}
