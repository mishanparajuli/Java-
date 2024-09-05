public class SumisPower {

    public static boolean sumIsPower(int[] arr) {
        // Return false if the array is null
        if (arr == null) {
            return false;
        }

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Check if the sum is a power of 2
        return isPowerOfTwo(sum);
    }

    // Helper method to check if a number is a power of 2
    private static boolean isPowerOfTwo(int num) {
        // A number is a power of 2 if and only if it has exactly one '1' bit in binary representation
        if (num <= 0) {
            return false;
        }
        return (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {8, 8, 8, 8};
        int[] arr2 = {8, 8, 8};
        int[] arr3 = null;

        System.out.println(sumIsPower(arr1)); // true
        System.out.println(sumIsPower(arr2)); // false
        System.out.println(sumIsPower(arr3)); // false
    }
}
