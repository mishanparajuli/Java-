public class IS121Array{

    public static int is121Array(int[] a) {
        int n = a.length;

        // Edge case: If the array length is less than 3, it cannot be a 121 array
        if (n < 3) return 0;

        int i = 0;

        // Step 1: Check the number of 1s at the start
        while (i < n && a[i] == 1) {
            i++;
        }

        // If no 1s were found or the array is exhausted, return 0
        if (i == 0 || i == n) return 0;

        // Step 2: Check the middle part, which should be all 2s
        while (i < n && a[i] == 2) {
            i++;
        }

        // If no 2s were found or the array is exhausted, return 0
        if (i == n || a[i - 1] != 2) return 0;

        // Step 3: Check the remaining part, which should be the same number of 1s as the beginning
        int countRemaining1s = 0;
        while (i < n && a[i] == 1) {
            countRemaining1s++;
            i++;
        }

        // If we have reached the end of the array and the number of 1s at the end matches the number of 1s at the start, return 1
        if (i == n && countRemaining1s == (i - countRemaining1s) / 2) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(is121Array(new int[]{1, 2,1})); // Output: 1
        System.out.println(is121Array(new int[]{1, 1, 2, 2,2, 1, 1,1})); // Output: 1
    }
}
