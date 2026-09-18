package Practice17sep2026;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String s = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                System.out.print("First Non Repeacting Character is::: " + ch);
                break;

            }
        }

    }

}
