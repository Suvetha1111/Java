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
