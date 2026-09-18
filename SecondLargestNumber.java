public class SecondLargestNumber {
    public static void main(String[] args) {
        int [] arr =  {10, 5, 20, 8, 15};
        int largest = arr[0];
        int secondLargest = arr[0];
        
        for(int num : arr){
            if(num> largest){
                secondLargest = largest;
                largest = num;

            }
            else if(num>secondLargest && num != secondLargest){
                secondLargest = num;
            }
        }
    System.out.print("Second Largest Number is ::"+secondLargest);
    }
}
