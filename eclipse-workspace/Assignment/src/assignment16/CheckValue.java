package assignment16;

import java.util.HashMap;

public class CheckValue {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Red");
        map.put(2, "Blue");

        if(map.containsValue("Blue")) {
            System.out.println("Value exists");
        } else {
            System.out.println("Value does not exist");
        }
    }
}
