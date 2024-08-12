/*
the function accepts two positive integers 'r' and 'unit' and a positive integer array 'arr' of size 'n' as its argument .
'r' -represents no. of rats present in an area,'unit' is the amount of food each rat consumes and each 'ith ' element of array 'arr' represents the amount of food present in'i+1' house number,where 0<=i.Return -1 if the array is null or return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.give the java code for this
*/public class RatFoodDistribution {
    public static int foodRequired(int r, int unit, int[] arr) {
        // Check if the array is null
        if (arr == null) {
            return -1;
        }
        
        // Calculate the total food required by all rats
        int totalFoodRequired = r * unit;
        
        // Calculate the total food available in all houses
        int totalFoodAvailable = 0;
        for (int food : arr) {
            totalFoodAvailable += food;
        }
        
        // Check if the total food available is sufficient for all rats
        if (totalFoodAvailable >= totalFoodRequired) {
            return totalFoodAvailable;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int r = 7;  // Number of rats
        int unit = 2;  // Amount of food each rat consumes
        int[] arr = {4, 2, 5, 8};  // Amount of food in each house
        
        int result = foodRequired(r, unit, arr);
        System.out.println(result);
    }
}
