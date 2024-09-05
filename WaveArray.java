public class WaveArray {

    // Function to check if an array is a Wave array
    public static int isWave(int[] a) {
        // Check if the array has 0 or 1 element, it automatically qualifies as a Wave array
        if (a.length <= 1) {
            return 1;
        }

        // Loop through the array to check adjacent elements
        for (int i = 0; i < a.length - 1; i++) {
            // Check if both adjacent numbers are either even or both odd
            if ((a[i] % 2 == 0 && a[i + 1] % 2 == 0) || (a[i] % 2 != 0 && a[i + 1] % 2 != 0)) {
                return 0; // Not a Wave array
            }
        }

        // If all adjacent elements satisfy the condition, return 1 (it is a Wave array)
        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {7, 2, 9, 10, 5};
        int[] array2 = {4, 11, 12, 1, 6};
        int[] array3 = {1, 0, 5};
        int[] array4 = {2};
        int[] array5 = {2, 6, 3, 4};

        // Testing isWave function
        System.out.println(isWave(array1)); // Expected output: 1
        System.out.println(isWave(array2)); // Expected output: 1
        System.out.println(isWave(array3)); // Expected output: 1
        System.out.println(isWave(array4)); // Expected output: 1
        System.out.println(isWave(array5)); // Expected output: 0
    }
}
