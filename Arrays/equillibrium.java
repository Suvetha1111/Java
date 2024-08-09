public class EquilibriumIndex {
    
    public static int findEquilibriumIndex(int[] arr, int n) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Iterate through the array to find the equilibrium index
        for (int i = 0; i < n; i++) {
            // Calculate right sum by excluding the current element
            int rightSum = totalSum - leftSum - arr[i];
            
            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return i;
            }
            
            // Update the left sum by adding the current element
            leftSum += arr[i];
        }

        // If no equilibrium index is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int n = arr.length;

        int equilibriumIndex = findEquilibriumIndex(arr, n);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index found at: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}
