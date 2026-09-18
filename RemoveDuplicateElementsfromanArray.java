public class RemoveDuplicateElementsfromanArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        for(int i =0; i<arr.length; i++){
            boolean found = false;
            for(int j =0; j<i; j++){
                if(arr[i] == arr[j]){
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
