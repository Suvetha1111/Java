/*
Reverse the Entire Array:
First, reverse the entire array. This will bring the last d elements to the front but in the wrong order.
Reverse the First d Elements:
Reverse the first d elements to correct their order.
Reverse the Remaining n - d Elements:
Reverse the remaining n - d elements to correct their order as well.
This approach works in-place and has a time complexity of 
𝑂
(
𝑛
)
O(n), where n is the size of the array.

*/
public class RotateArray {
    
    public static void rotateArray(int[] arr, int n, int d) {
        // Step 1: Normalize d in case it's larger than n
        d = d % n;
        
        // Step 2: Reverse the entire array
        reverseArray(arr, 0, n - 1);
        
        // Step 3: Reverse the first d elements
        reverseArray(arr, 0, d - 1);
        
        // Step 4: Reverse the remaining n-d elements
        reverseArray(arr, d, n - 1);
    }
    
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 3;

        rotateArray(arr, n, d);

        // Output the rotated array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
