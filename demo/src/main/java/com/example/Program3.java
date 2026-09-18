package com.example;

import java.util.HashMap;
import java.util.Map;

public class Program3 {
    
    public static void main(String[] args){
        String s ="test"; 

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
    System.out.println(map);

    for(Map.Entry<Character, Integer> entry : map.entrySet()){
        if(entry.getValue() == 1){
            System.out.println("First Uniques Charater in string :::"+entry.getKey());
            break;
        }

    }
    }

}
