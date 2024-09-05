public class MeeraArray {
    
    // Assumed isPrime function
    public static int isPrime(int x) {
        if (x <= 1) return 0;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return 0;
        }
        return 1;
    }

    // Function to check if the array is a Meera array
    public static int isMeera(int[] a) {
        boolean containsZero = false;
        boolean containsPrime = false;

        // Loop through the array
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                containsZero = true;
            }
            if (isPrime(a[i]) == 1) {
                containsPrime = true;
            }
        }

        // If the array contains both a 0 and a prime or neither, return 1
        if ((containsZero && containsPrime) || (!containsZero && !containsPrime)) {
            return 1;
        }

        // Otherwise, it's not a Meera array, so return 0
        return 0;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {7, 6, 0, 10, 1};
        int[] arr2 = {7, 6, 10};
        int[] arr3 = {6, 10, 0};
        int[] arr4 = {3, 7, 0, 8, 0, 5};

        System.out.println(isMeera(arr1));  // Should return 1
        System.out.println(isMeera(arr2));  // Should return 0
        System.out.println(isMeera(arr3));  // Should return 0
        System.out.println(isMeera(arr4));  // Should return 1
    }
}
