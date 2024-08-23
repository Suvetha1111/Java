class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int i,index=0,change=0;
        for(i=0;i<arr.size()-1;i++)
        {
            if(arr.get(i)>arr.get(i+1))
             { 
                 index=i;
                 change=1;
        }
        }
        if(index==0&&change==0)
           return 0;
   
        int diff=index+1;
        return diff;
    }
}
