public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "dad";
        String res = "";
        
        for(int i = s.length()-1; i>=0; i--){
            res = res +s.charAt(i);
        }

        if(String.valueOf(res).equals(s)){
            System.out.println("its palindrom");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
