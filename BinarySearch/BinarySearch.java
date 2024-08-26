class Solution {
    public int binarysearch(int[] arr, int x) {
        // Code Here
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>x)
              high=mid-1;
            else if(arr[mid]<x)
               low=mid+1;
            else 
            return mid;
          
        }
        return -1;
        
        
    }
}
