/*
Smallest Positive Missing
Difficulty: MediumAccuracy: 25.13%Submissions: 338K+Points: 4
You are given an array arr[] of N integers. The task is to find the smallest positive number missing from the array.
Note: Positive number starts from 1.
Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing 
number is 6.
Example 2:

Input:
N = 5
arr[] = {0,-10,1,3,-20}
Output: 2
Explanation: Smallest positive missing 
number is 2.
Your Task:
The task is to complete the function missingNumber() which returns the smallest positive missing number in the array.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
-106 <= arr[i] <= 106*/
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int X[], int n)
    {
        // Your code here
       HashMap<Integer,Boolean> H=new HashMap<>();
       
       for(int i=0;i<n;i++)
        H.put(X[i],true);
    for(int i=1;i<=n+1;i++){
     if(!H.containsKey(i))
        return i;
       
    } 
       return n+1;
       
        
    }
}
//without using hashmap
class Solution
{
    // Function to find the smallest positive number missing from the array.
    static int missingNumber(int X[], int n)
    {
        // Step 1: Initialize a boolean array of size n + 1
        boolean[] present = new boolean[n + 1];
        
        // Step 2: Mark the presence of each number
        for (int i = 0; i < n; i++) {
            if (X[i] > 0 && X[i] <= n) {
                present[X[i]] = true;
            }
        }
        
        // Step 3: Find the first index which is false
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        
        // If all indices from 1 to n are marked, the missing number is n + 1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] X = {28, 7, -36, 21, -21, -50, 9, -32};
        int n = X.length;

        System.out.println("The smallest positive missing number is: " + missingNumber(X, n));  // Output should be 1
    }
}
