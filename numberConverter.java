public class numberConverter {
    public static int isLegalNumber(int[] a, int base) {
        // Check if the base is valid (base should be greater than 1)
        if (base <= 1) {
            return 0; // Invalid base
        }
        
        // Iterate through each digit in the array using a traditional for loop
        for (int i = 0; i < a.length; i++) {
            int digit = a[i];
            // Check if the digit is within the valid range for the base
            if (digit < 0 || digit >= base) {
                return 0; // Invalid digit found
            }
        }
        
        // All digits are valid
        return 1;
    }

    public static int convertToBase10(int[] a, int base) {
        // Check if the number is legal in the specified base
        if (isLegalNumber(a, base) == 0) {
            return -1; // Number is not legal
        }
        
        // Convert the number from the given base to base 10
        int base10Value = 0;
        int power = 1; // Start with base^0
        
        // Process digits from the end to the beginning
        for (int i = a.length - 1; i >= 0; i--) {
            base10Value += a[i] * power;
            power *= base; // Move to the next power of the base
        }
        
        return base10Value;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(convertToBase10(new int[] {1, 0, 1, 1}, 2)); // Output: 11
        System.out.println(convertToBase10(new int[] {1, 1, 2}, 3)); // Output: 14
        System.out.println(convertToBase10(new int[] {3, 2, 5}, 8)); // Output: 213
        System.out.println(convertToBase10(new int[] {3, 7, 1}, 6)); // Output: -1
    }
}
