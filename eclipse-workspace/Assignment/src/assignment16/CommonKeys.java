package assignment16;

import java.util.HashMap;
import java.util.Set;

public class CommonKeys {
    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(2, "X");
        map2.put(3, "Y");
        map2.put(4, "Z");

        Set<Integer> keys = map1.keySet();

        for(Integer key : keys) {
            if(map2.containsKey(key)) {
                System.out.println("Common Key: " + key);
            }
        }
    }
}
