package com.example;

import java.util.HashMap;
import java.util.Map;

// Duplicate words in string using HashmMap

public class Program2 {

    public static void main(String[] args) {
        String s = "test";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
            System.out.println(map);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Key is " + entry.getKey() + "Value is " + entry.getValue());
            }
        }
    }
}
