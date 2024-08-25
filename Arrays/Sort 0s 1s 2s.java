int cn1=0,cn2=0,cn0=0,i;
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
              cn0++;
             else if(a[i]==1)
             cn1++;
             else
              cn2++;
        }
        for(i=0;i<n;i++)
    {
        if(i>=0&&i<cn0)
          a[i]=0;
        else if(i>=cn0&&i<cn0+cn1)
         a[i]=1;
        else
         a[i]=2;
    }
***********************************************************************************************************************
class Solution
{
     public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        
    }
    public static void sort012(int a[], int n)
    {
        // code here 
        int low=0,mid=0,high=n-1;
       while(mid<=high)
        {
             if(a[mid]==0)
             {
                 swap(a,mid,low);
                 low++;
                 mid++;
             }
           else if(a[mid]==1)
              {
                  mid++;
              }
            else
             {
                  swap(a,mid,high);
                  high--;
              }
        }
    }  
}
/*First, we will run a loop that will continue until mid <= high.
There can be three different values of mid pointer i.e. arr[mid]
If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment both low and mid. Now the subarray from index 0 to (low-1) only contains 0.
If arr[mid] == 1, we will just increment the mid pointer and then the index (mid-1) will point to 1 as it should according to the rules.
If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement high. Now the subarray from index high+1 to (n-1) only contains 2.
In this step, we will do nothing to the mid-pointer as even after swapping, the subarray from mid to high(after decrementing high) might be unsorted. So, we will check the value of mid again in the next iteration.
Finally, our array should be sorted.*/
