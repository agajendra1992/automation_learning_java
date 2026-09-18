package Practice17sep2026;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
    
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "tets";

        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch : s2.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)-1);
        }
  
         boolean found = true;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                found = false;
            }
        }
        if(found){
            System.out.println("is a anagram");
        }
        else{
            System.out.println("is not anagram");
        }

    }
}
