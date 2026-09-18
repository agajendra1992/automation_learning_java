package Practice17sep2026;

public class SortArrayWithout {
    public static void main(String[] args) {
        int [] arr = {10, 5, 20, 8, 15, 2};

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]< arr[j]){
                //if(arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+ " ,");
        }



    }
}
