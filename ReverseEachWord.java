public class ReverseEachWord {

    public static  void main(String[] args){
        String s = "I love Selenium";
        String [] s1 = s.split(" ");

        for(String s2 : s1){
            System.out.print(" ");
            for(int i = s2.length()-1; i>=0; i--){
                System.out.print(s2.charAt(i));
            }
        }
    }
}
