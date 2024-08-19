/*
Traverse the array, and whenever you find a non-zero element, place it in the next available position in the array.
After you’ve moved all the non-zero elements, fill the remaining positions in the array with zeroes.
Explanation:
First loop: We iterate through the array. If a non-zero element is found, it is placed in the next available position at index, and index is incremented.
Second loop: After all non-zero elements have been moved, the remaining positions (from index to the end of the array) are filled with zeroes.


*/
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0; // Pointer for placing non-zero elements
        
        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        // Fill the remaining positions with zeros
        for (int i = index; i < n; i++) {
            nums[i] = 0;
        }
    }
}
