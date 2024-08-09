/*
The function accepts an integer array ‘arr’ of size ‘n’ as its argument. Each element of ‘arr’
 represents the number of chocolates distributed to a person. The function needs to return the
 minimum number of chocolates that need to be distributed to each person so that the difference
 between the chocolates of any two people is minimized.explain it with example and also provide the code in java
 Explanation of Code:
Sorting the Array:
The array is sorted using Arrays.sort(arr) to facilitate easy calculation of the minimum difference.

Finding the Minimum Difference:
We iterate over possible subarrays of size n, calculate the difference between the maximum and minimum values in each subarray, and track the smallest difference.

Result Output:
The function returns the smallest difference found, which represents the minimum possible difference between the maximum and minimum chocolates distributed to any two people.

*/


import java.util.Arrays;

public class ChocolateDistribution {

    public static int findMinDifference(int[] arr, int n) {
        if (n == 0 || arr.length == 0) {
            return 0;
        }

        // Sort the array
        Arrays.sort(arr);

        // Find the minimum difference
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + n - 1 < arr.length; i++) {
            int diff = arr[i + n - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int n = 7; // Number of people

        int result = findMinDifference(arr, n);
        System.out.println("Minimum difference is: " + result);
    }
}
