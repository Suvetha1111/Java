class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
      List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int i,j,k,sum=0,cn=0;
        for(i=0;i<n;i++)
        {
        if(i!=0&&arr[i]==arr[i-1])
          continue;
          j=i+1;
          k=n-1;
      
        while(j<k)
        {
            sum=arr[i]+arr[j]+arr[k];
            if(sum<0)
              j++;
            else if(sum>0)
              k--;
            else{
               List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
              cn++;//
              j++;
              k--;
          while(j<k&&arr[k]==arr[k+1])
              k--;
        while(j<k&&arr[j]==arr[j-1])
             j++;
        }
        }
     
        }
        
    if(cn==0)
    return false;
    return true;//return ans for triplets
        
    }
}
