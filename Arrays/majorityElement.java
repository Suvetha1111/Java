/*
Given an array arr. Find the majority element in the array. If no majority exists, return -1.

A majority element in an array of size n is an element that appears strictly more than n/2 times in the array.

Examples:

Input: arr[] = [3, 1, 3, 3, 2]
Output: 3
Explanation: Since, 3 is present more than n/2 times, so it is the majority element.
Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than n/2 times, so it is the majority element.
Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than n/2 times, so there is no majority element.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Approach: 
Initialize 2 variables:
Count –  for tracking the count of element
Element – for which element we are counting
Traverse through the given array.
If Count is 0 then store the current element of the array as Element.
If the current element and Element are the same increase the Count by 1.
If they are different decrease the Count by 1.
The integer present in Element should be the result we are expecting 


*/

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
       int count=0,ele=0,i;
        int curr=0;
       for(i=0;i<size;i++)
       {
           curr=a[i];
           if(count==0)
             {
                 ele=a[i];
                 count=1;
             }
             else
             {
                 if(curr!=ele)
                    count--;
                else
                 count++;
             }
       }
        int c=0;
        for(i=0;i<size;i++)
        if(a[i]==ele)
          c++;
          
        if(c>size/2)
         return ele;
        return -1;
    }
}
what is the purpose of this tracking of element instead we can track each ele with its count


ChatGPT said:
Great question — you’re basically asking “Why are we doing all this extra logic with count and ele instead of just counting the frequency of each element directly?”
Let’s break it down clearly.

✅ Your idea:
Why not just track count of every element?

That means:

We can use a HashMap (or loop + nested loop manually if we don't want to use extra space).

For each element → increment its count → finally check which element count > n/2.

BUT that approach needs O(n) space
(even if we don’t use HashMap, nested loops = O(n²) time).

✅ What this algorithm is doing:
This is Boyer–Moore Majority Voting Algorithm
It finds a candidate majority element in O(n) time and O(1) space — that’s why we use this strategy.

Key idea:
A majority element (if it exists) will survive pairwise cancellations.

If an element appears > n/2 times, it will outvote all others combined.

Example:
[2,2,1,1,1,2,2]


Element	Count	Reason
2	1	count = 0 → ele=2
2	2	same as ele
1	1	different → count--
1	0	different → count--
1	1	count=0 → ele=1
2	0	different → count--
2	1	count=0 → ele=2
Finally, ele=2, then we confirm it actually occurs > n/2 times.

📌 Why don't we just count everything?
Because:

This Boyer-Moore algorithm gives O(n) time and O(1) space

Counting everything explicitly takes O(n) space

If interviewer asks: “Find majority element in O(n) time and O(1) space”
👉 This is the standard and optimal solution

💡 In short:
We are not counting everything to save space.
We use the count & ele trick to smartly guess the candidate in a single pass without storing all counts.
