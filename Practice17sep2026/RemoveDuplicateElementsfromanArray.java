package Practice17sep2026;


public class RemoveDuplicateElementsfromanArray {

    public static void main(String[] args) {
    int [] arr =  {1, 2, 3, 2, 4, 1, 5};
System.out.print("Duplicate Number is:: ");
   for(int i = 0; i<arr.length; i++){
    boolean found = false;
    for(int j =0; i<j; j++){
        if(arr[i] == arr[j]){
            found= true;
        }
    }
    if(!found){
        System.out.print(arr[i]+ " ,");
    }
           
} 

}
    
}
