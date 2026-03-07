package assigment15;

import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";
        char ch[] = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : ch)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
            }
            else
            {
                map.put(c, 1);
            }
        }

        for(Character c : map.keySet())
        {
            if(map.get(c) > 1)
            {
                System.out.println(c + " = " + map.get(c));
            }
        }
    }
}
