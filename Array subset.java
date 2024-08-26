/*
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m, where both arrays may contain duplicate elements. The task is to determine whether array a2 is a subset of array a1. It's important to note that both arrays can be sorted or unsorted. Additionally, each occurrence of a duplicate element within an array is considered as a separate element of the set.

Example 1:

Input:
a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
a2[] = {11, 3, 7, 1, 7}
Output:
Yes



*/
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
       int i=0,j=0;
       Arrays.sort(a1);
       Arrays.sort(a2);
       while(i<n&&j<m)
       {
           if(a1[i]==a2[j])
           {
               i++;
               j++;
           }
          else if(a1[i]<a2[j])
           i++;
           else if(a1[i]>a2[j])
            return "No";
       }
       if(j==m)
          return "Yes";
       else
     return "No";
      
    }
}
