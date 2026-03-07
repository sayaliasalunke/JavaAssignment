package assignment16;

import java.util.HashMap;

public class RemoveKey {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        map.remove(2);

        System.out.println(map);
    }
}
