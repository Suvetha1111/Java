class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long merge(long a[], int low, int mid, int high) {
        int left = low, right = mid + 1;
        long cn = 0;
        ArrayList<Long> temp = new ArrayList<>();
        
        while (left <= mid && right <= high) {
            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                cn += (mid - left + 1);
                right++;
            }
        }
        
        while (left <= mid) {
            temp.add(a[left]);
            left++;
        }
        
        while (right <= high) {
            temp.add(a[right]);
            right++;
        }
        
        for (int i = low; i <= high; i++) {
            a[i] = temp.get(i - low);
        }
        
        return cn;
    }
    
    static long mergeSort(long arr[], int low, int high) {
        long cn = 0;
        if (low >= high)
            return cn;
        int mid = (low + high) / 2;
        cn += mergeSort(arr, low, mid);
        cn += mergeSort(arr, mid + 1, high);
        cn += merge(arr, low, mid, high);
        return cn;
    }
    
    static long inversionCount(long arr[], int n) {
        return mergeSort(arr, 0, n - 1);
    }
}
