import java.util.HashMap;

public class LastNonRepeatingCharacter {
    
    public static void main(String[] args) {
        String s= "swiss";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        System.out.print(" ");
for(int i =s.length()-1; i>=0; i--){
    char ch = s.charAt(i);
    if(map.get(ch) == 1){
        System.out.print(ch);
        break;
    }
}
    }
}
