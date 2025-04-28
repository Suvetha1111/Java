/*
Let's use a small example to illustrate the sliding window approach described in the solution. Suppose we have the array [1, 2, 3, 4, 5] and our target sum is 11.

We want to find the smallest subarray whose sum is at least 11. We'll follow the steps of the sliding window algorithm:

Initialize the pointers i and j both to 0, and the running sum s also to 0.
Start iterating over the array with i. Our window size is currently 0.
First iteration (i = 0):

Add nums[i] to s. Now, s is 1.
It's less than the target (11), so we move on to the next number.
Second iteration (i = 1):

Now, s is 1 + 2 = 3.
Still less than the target.
Third iteration (i = 2):

s becomes 1 + 2 + 3 = 6.
Again, we continue since s is less than our target sum.
Fourth iteration (i = 3):

s is now 1 + 2 + 3 + 4 = 10.
It is still below the target sum of 11.
Fifth iteration (i = 4):

s is now 1 + 2 + 3 + 4 + 5 = 15, which is greater than our target of 11. We've now found a subarray [1, 2, 3, 4, 5] with the sum greater than or equal to the target.
Now we try to shrink the window from the left to see if there is a smaller subarray that still meets or exceeds the target sum.
Before moving j, we update the answer ans to the current window size, which is i - j + 1 = 5 - 0 + 1 = 5.
Now we enter the while loop to shrink the window since s >= target:

We reduce s by nums[j]. s becomes 15 - 1 = 14, and we increment j to 1. The window is now [2, 3, 4, 5].
s is 14, which is still greater than 11, so we repeat the procedure.
s becomes 14 - 2 = 12 after removing the next element and j goes to 2. The window is [3, 4, 5].
With s at 12, it's still greater than 11, continue to shrink.
We subtract 3 to get s = 12 - 3 = 9 and move j to 3. Now s is less than 11, so we stop shrinking the window.
Our smallest subarray that meets the requirement so far is [3, 4, 5] with a length of 3. Since we've already reached the end of the array, we're done iterating, and we can return the answer, which is 3.

This example successfully demonstrated the sliding window technique where we expanded the window until we exceeded the target sum, then shrank the window from the left to find the smallest subarray that still meets the sum condition. The array [3, 4, 5] is the smallest subarray with a sum greater than or equal to the target 11, so the result is the length of this subarray, which is 3.
*/
class Solution {
  
    // This method finds the minimum length of a subarray that sums to at least the given target.
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length; // The length of the input array.
        long sum = 0; // The sum of the current subarray.
        int minLength = n + 1; // Initialize minLength with max possible value plus one for comparison.

        // Two pointers method: i is the end-pointer, j is the start-pointer of the sliding window.
        for (int end = 0, start = 0; end < n; ++end) {
            sum += nums[end]; // Increment the sum by the current element value.
          
            // Shrink the window from the left until the sum is smaller than the target.
            // This finds the smallest window that ends at position 'end'.
            while (start < n && sum >= target) {
                minLength = Math.min(minLength, end - start + 1); // Update minLength if a smaller length is found.
                sum -= nums[start++]; // Decrease the sum by the start-value and increment start-pointer to shrink the window.
            }
        }

        // If minLength is updated (smaller than n + 1), we found a valid subarray.
        // Otherwise, return 0 as a subarray meeting the conditions is not found.
        return minLength <= n ? minLength : 0;
    }
}
