public class DuplicateElementsArray {
    public static void main(String[] args) {
        int [] arr = {2, 5, 10, 1, 4, 3, 12, 2};
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]);
                    break;
                }
            }
        }
    }
}
