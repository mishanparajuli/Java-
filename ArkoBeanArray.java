public class ArkoBeanArray {

    // Function to check if an array is a Bean array
    public static int isBean(int[] a) {
        boolean contains9 = false;
        boolean contains13 = false;
        boolean contains7 = false;
        boolean contains16 = false;

        // Loop through the array to check for the presence of 9, 13, 7, and 16
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                contains9 = true;
            }
            if (a[i] == 13) {
                contains13 = true;
            }
            if (a[i] == 7) {
                contains7 = true;
            }
            if (a[i] == 16) {
                contains16 = true;
            }
        }

        // Condition a: If the array contains 9, it must also contain 13
        if (contains9 && !contains13) {
            return 0;
        }

        // Condition b: If the array contains 7, it must not contain 16
        if (contains7 && contains16) {
            return 0;
        }

        // If both conditions are satisfied, return 1
        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {1, 2, 3, 9, 6, 13};
        int[] array2 = {3, 4, 6, 7, 13, 16};
        int[] array3 = {1, 2, 3, 4, 10, 11, 12};
        int[] array4 = {3, 6, 9, 5, 7, 13, 6, 17};
        int[] array5 = {9, 6, 18};
        int[] array6 = {4, 7, 16};

        // Testing isBean function
        System.out.println(isBean(array1)); // Expected output: 1
        System.out.println(isBean(array2)); // Expected output: 1
        System.out.println(isBean(array3)); // Expected output: 1
        System.out.println(isBean(array4)); // Expected output: 1
        System.out.println(isBean(array5)); // Expected output: 0
        System.out.println(isBean(array6)); // Expected output: 0
    }
}
