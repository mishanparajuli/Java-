public class Trivalent {
    public static void main(String[] args) {
        System.out.println("{22, 19, 10, 10, 19, 22, 22, 10} trivalent status is: " + isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println("{1, 2, 2, 2, 2, 2, 2} trivalent status is: " + isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println("{-1, 0, 1, 0, 0, 0} trivalent status is: " + isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println("{2147483647, -1, -1, -2147483648} trivalent status is: " + isTrivalent(new int[]{2147483647, -1, -1, -2147483648}));
        System.out.println("{} trivalent status is: " + isTrivalent(new int[]{}));
        System.out.println("{2, 2, 3, 3, 3, 3, 2, 41, 65} trivalent status is: " + isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
    }

    public static int isTrivalent(int[] a) {
        // If the array has less than 3 elements, it can't be trivalent
        if (a.length < 3) return 0;

        // Array to hold up to 3 distinct values found in the array
        int[] distinctValues = new int[3];
        // Variable to keep track of the number of distinct values found
        int count = 0;

        // Iterate over the input array
        for (int i = 0; i < a.length; i++) {
            boolean isNewValue = true;

            // Check if the current element is already in the distinctValues array
            for (int j = 0; j < count; j++) {
                if (a[i] == distinctValues[j]) {
                    isNewValue = false; // It's not a new value
                    break;
                }
            }

            // If it's a new value, add it to the distinctValues array
            if (isNewValue) {
                // If we've found more than 3 distinct values, return 0 (not trivalent)
                if (count == 3) return 0;

                // Otherwise, add the new value to distinctValues and increment count
                distinctValues[count] = a[i];
                count++;
            }
        }

        // If we found exactly 3 distinct values, return 1 (trivalent)
        return (count == 3) ? 1 : 0;
    }
}