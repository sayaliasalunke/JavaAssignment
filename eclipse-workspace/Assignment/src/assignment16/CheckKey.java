package assignment16;

import java.util.HashMap;

public class CheckKey {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        if(map.containsKey(1)) {
            System.out.println("Key exists");
        } else {
            System.out.println("Key does not exist");
        }
    }
}
