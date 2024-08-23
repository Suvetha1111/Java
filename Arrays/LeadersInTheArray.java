
class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList a=new ArrayList<>();
        a.add(arr[n-1]);
        int max=arr[n-1];
        for(int j=n-2;j>=0;j--)
        {
            if(arr[j]>=max)
            {
                a.add(arr[j]);
                max=arr[j];
            
             }
        }
       
        Collections.reverse(a);
         return a;
        
    }
}
