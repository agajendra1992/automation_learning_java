package Practice17sep2026;

public class MissingNumberinanArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 6, 8 };

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        int n = arr.length + 1;
        int expectedsum = n * (n + 1) / 2;
        int missing = expectedsum - sum;
        System.out.println("Missing Number is :::" + missing);
    }
}
