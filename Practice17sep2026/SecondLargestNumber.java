package Practice17sep2026;

public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] arr = { 10, 5, 20, 8, 15 };
        int largest = arr[0];
        int second_largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                //second_largest = largest;
                largest = num;
            }
            else if(num >second_largest & num != second_largest){
                second_largest = num;
            }
        }
        System.out.println("Second_Largest is ::"+ second_largest);
        System.out.println("Largest is ::"+ largest);

    }
}
