package Practice17sep2026;

public class DuplicateElementsinanArray {
    public static void main(String[] args) {
   int[] arr = {2, 5, 10, 1, 2, 4, 3, 12, 2};

for (int i = 0; i < arr.length; i++) {

    boolean duplicate = false;

    for (int j = i + 1; j < arr.length; j++) {

        if (arr[i] == arr[j]) {
            duplicate = true;
            break;
        }
    }

    if (duplicate) {
        boolean alreadyPrinted = false;

        for (int k = 0; k < i; k++) {
            if (arr[i] == arr[k]) {
                alreadyPrinted = true;
                break;
            }
        }

        if (!alreadyPrinted) {
            System.out.println("Duplicate: " + arr[i]);
        }
    }
}
    }
}
