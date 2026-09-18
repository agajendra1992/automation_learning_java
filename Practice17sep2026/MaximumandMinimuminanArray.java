package Practice17sep2026;

public class MaximumandMinimuminanArray {
 
    public static void main(String[] args) {
      int [] arr = {10, 5, 20, 8, 15, 2};

      for(int i = 0; i<arr.length; i++){
        for(int j = i; j < arr.length; j++){
          if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
      }
System.out.println("MiniMum Number is ::"+ arr[0]);
System.out.println("Maximum Number is ::"+ arr[arr.length-1]);


    }
}
