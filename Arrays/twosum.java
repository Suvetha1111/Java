/*
Given an array of integers arr[] and an integer target.
1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.

example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target.
*/

Got it — you’re asking:
👉 "Best approach for Two Sum in an array" — whether sorted or unsorted.

Let’s cover both cases clearly:

✅ If the array is unsorted ➔ Use a HashMap
(Because elements are random, and you need quick lookup.)

Algorithm:

Traverse the array.

For each element, calculate target - current_element.

If complement is already in the HashMap, you found the pair.

Otherwise, store current_element → index in the HashMap.

Java Code:

java
Copy
Edit
import java.util.HashMap;

public class TwoSumUnsorted {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // No pair found
    }
}
Time: O(n)

Space: O(n)

✅ If the array is sorted ➔ Use Two Pointers
(Because sorted arrays allow moving left and right smartly.)

Algorithm:

Start with two pointers: left = 0, right = n-1.

Calculate sum of elements at left and right.

If sum == target ➔ found

If sum < target ➔ move left++

If sum > target ➔ move right--

Java Code:

java
Copy
Edit
import java.util.Arrays;

public class TwoSumSorted {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{}; // No pair found
    }
}
Time: O(n)

Space: O(1)

⚡Note: If your input array isn't sorted but you want to use two-pointers, you first need to sort() — but sorting takes O(n log n) time.

🧠 Summary:

Array Type	Best Approach	Time	Space
Unsorted	HashMap	O(n)	O(n)
Sorted	Two Pointer	O(n)	O(1)

import java.util.*;

public class Main {

    // Function to implement bubble sort (replace Arrays.sort(arr))
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static String twoSum(int n, int[] arr, int target) {
        bubbleSort(arr);  // Sort the array without using built-in methods
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Indices: " + left + " " + right);
                return "YES";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer: " + ans);
    }
}

/*
 In this approach, we will first sort the array and will try to choose the numbers in a greedy way.
We will keep a left pointer at the first index and a right pointer at the last index. Now until left < right, we will check the sum of arr[left] and arr[right]. Now if the sum < target, we need bigger numbers and so we will increment the left pointer. But if sum > target, we need to consider lesser numbers and so we will decrement the right pointer. 
If sum == target we will return either “YES” or the indices as per the question.
But if the left crosses the right pointer, we will return “NO” or {-1, -1}.
*/
