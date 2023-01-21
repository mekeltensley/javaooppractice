package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map fruitsCalories = new HashMap();
        fruitsCalories.put("apple", 95);
        fruitsCalories.put("lemon", 20);
        fruitsCalories.put("banana", 105);
        fruitsCalories.put("orange", 45);
//        fruitsCalories.put("lemon", 17); //overrides existing value
        fruitsCalories.putIfAbsent("lemon", 17);

        System.out.println(fruitsCalories);
        System.out.println("banana:" + fruitsCalories.get("banana"));
    }
}
