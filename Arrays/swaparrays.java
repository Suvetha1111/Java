public class SwapArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        System.out.println("Before swapping:");
        System.out.println("Array 1: " + java.util.Arrays.toString(array1));
        System.out.println("Array 2: " + java.util.Arrays.toString(array2));

        // Swap the elements manually
        if (array1.length == array2.length) { // Ensure the arrays have the same length
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
          /* Swap the arrays
        int[] temp = array1;
        array1 = array2;
        array2 = temp;
        */
        } else {
            System.out.println("Arrays are not of the same length. Cannot swap elements.");
        }

        System.out.println("After swapping:");
        System.out.println("Array 1: " + java.util.Arrays.toString(array1));
        System.out.println("Array 2: " + java.util.Arrays.toString(array2));
    }
}
