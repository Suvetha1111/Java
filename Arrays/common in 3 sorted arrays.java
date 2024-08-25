/*
Steps
Create three variables that will store the sizes of the arrays. This will help to determine whether all the integers in a given array are traversed through.
Let the variables be n1, n2, and n3.
Create and initialize three variables that will point to the indices of the arrays. The starting index is 0.
Let the variables be i, j, and k.
Repeat the following steps until we reach the end of any one of the arrays:
Check whether the integers appointed by i, j, and k are equal or not.
If they are equal, print any of the integers and increase i, j, and k by 1.
Otherwise, increase the index that points to the smaller integer by 1.
Complexity
Time Complexity: 
O(N)
O(N), where N is the maximum size among the sizes of the arrays. In the worst case we traverse till the array having the maximum size is evaluated.

Space Complexity: 
O(1) We only use some variables that occupy constant extra space.

*/
class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
             Set<Integer> commonSet = new LinkedHashSet<>();
        int i = 0, j = 0, k = 0;
        int n1 = arr1.size();
        int n2 = arr2.size();
        int n3 = arr3.size();

        while (i < n1 && j < n2 && k < n3) {
            if (arr1.get(i).equals(arr2.get(j)) && arr2.get(j).equals(arr3.get(k))) {
                commonSet.add(arr1.get(i));
                i++;
                j++;
                k++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr2.get(j) < arr3.get(k)) {
                j++;
            } else {
                k++;
            }
        }

        return new ArrayList<>(commonSet);
    }
}
