package Practice17sep2026;

public class CheckPalindrome {

    public static void main(String[] args) {
        String s = "madam";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            rev = rev + s.charAt(i);
        }
    if(s.equals(rev)){
        System.out.println("is a palindrome");
    }
    else{
        System.out.println("is not palindorme");
    }
    }
    
}
