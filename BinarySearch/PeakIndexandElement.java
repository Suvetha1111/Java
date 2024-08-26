/*
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.
Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1
*/
import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i;
int arr[]=new int[n];
for(i=0;i<n;i++)
arr[i]=sc.nextInt();
int index=peakIndexInMountainArray(arr);
System.out.println(index);
    }
   
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are same
    }//for returning peak element return arr[start] or arr[end]
}

********************************************************************************************************************************************
class Solution
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array arr[]
    public int peakElement(int[] arr, int n)
    {
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // If mid element is greater than the next element, the peak is on the left half (including mid)
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                // Otherwise, the peak is on the right half
                low = mid + 1;
            }
        }

        // At the end of the loop, low == high and pointing to the peak element
        return low;
    }
}
********************************************************************************************************************************************
    class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       if(n==1)
        return 0;
       int i;
     if(arr[0]>=arr[1])
      return 0;
      if(arr[n-1]>=arr[n-2])
       return n-1;
       for(i=1;i<n-1;i++)
       {
           if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1])
             return i;
       }
       return -1;
       
    }
}
