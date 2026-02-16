package Assignment14;

import java.util.HashSet;
import java.util.ArrayList;

public class ConvertSetToList {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        ArrayList<String> list = new ArrayList<>(set);

        System.out.println("ArrayList elements:");
        System.out.println(list);
    }
}

