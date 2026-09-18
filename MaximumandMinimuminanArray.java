public class MaximumandMinimuminanArray {
    
    public static void main(String[] args) {
       int [] arr = {2,5,6,62,4,72,6};
       
       for(int i = 0; i<arr.length; i++){
        for(int j =i+1; j<arr.length; j++){
             if(arr[i]< arr[j]){
            //if(arr[i]> arr[j]){
                int tep = arr[i];
                arr[i] = arr[j];
                arr[j] = tep;
            }
        }
       
       }
       System.out.print("maximum number is "+ arr[0]); 
       System.out.println("Minimum Number is" + arr[arr.length-1]);
    }
}
