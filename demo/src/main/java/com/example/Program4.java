package com.example;

import java.util.HashMap;
import java.util.Map;

public class Program4 {
    
    public static void main(String[] args) {
        String s = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();
        Character result = null;
        for (char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        System.out.println(result);
    }
}
