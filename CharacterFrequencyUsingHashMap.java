import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyUsingHashMap {
    public static void main(String[] args) {
        String s = "automation";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else{
                map.put(ch, 1);

            }
        }
    for(Map.Entry<Character,Integer> entry : map.entrySet()){
        System.out.print(entry.getKey()+ "= "+ entry.getValue()+ ",");
    }
    }
}
