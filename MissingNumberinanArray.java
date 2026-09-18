public class MissingNumberinanArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5, 4, 6, 8};
        int n = arr.length +1;
        int sum =0;

        for(int num : arr){
            sum+= num;
        }
         int expectedSum = n *(n+1)/2;
         int missing = expectedSum -sum;
         System.out.println(missing);
    }
}
