package Practice17sep2026;


import java.util.LinkedHashMap;
import java.util.Map;
public class CharacterFrequencyUsingHashMap {
 public static void main(String[] args) {
    String s = "automation";
    LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

    for(char ch : s.toCharArray()){
        if(map.containsKey(ch)){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        else{
            map.put(ch, 1);
        }
    }

    for(Map.Entry<Character, Integer> entry : map.entrySet()){
        System.out.print(entry.getKey() +"= "+ entry.getValue()+",");
    }
 }   
}
