public class nUpcount {

    public static int nUpCount(int[] a, int n) {
        int partialSum = 0;
        int upCount = 0;
        int previousPartialSum = 0;

        // Iterate over the array and compute partial sums
        for (int i = 0; i < a.length; i++) {
            // Save the previous partial sum
            previousPartialSum = partialSum;
            // Add current element to the partial sum
            partialSum += a[i];

            // Check if partial sum has transitioned from <= n to > n
            if (previousPartialSum <= n && partialSum > n) {
                upCount++;
            }
        }

        return upCount;
    }

    public static void main(String[] args) {
        // Example array and value of n
        int[] array = {2, 3, 1, -6, 8, -3, -1, 2};
        int n = 5;

        // Call the nUpCount function
        int result = nUpCount(array, n);

        // Print the result
        System.out.println("The " + n + "-upcount is: " + result);
    }
}
