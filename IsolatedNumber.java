public class IsolatedNumber{

    public static int isIsolated(long n) {
        // Edge case check for n
        if (n < 1 || n > 2097151) {
            return -1;
        }

        // Calculate the square and cube of n
        long square = n * n;
        long cube = n * n * n;

        // Use the hint to extract digits from square and cube
        boolean[] cubeDigits = new boolean[10];  // Array to track digits found in the cube
        
        // Extract digits from cube and mark them in cubeDigits array
        long tempCube = cube;
        while (tempCube > 0) {
            int digit = (int) (tempCube % 10);  // Get the rightmost digit
            cubeDigits[digit] = true;           // Mark the digit as found in the cube
            tempCube /= 10;                     // Remove the rightmost digit
        }

        // Extract digits from square and check if any exist in cubeDigits
        long tempSquare = square;
        while (tempSquare > 0) {
            int digit = (int) (tempSquare % 10);  // Get the rightmost digit of the square
            if (cubeDigits[digit]) {              // If this digit exists in cube
                return 0;  // Not isolated
            }
            tempSquare /= 10;                     // Remove the rightmost digit
        }

        // If no common digits are found, the number is isolated
        return 1;
    }

    public static void main(String[] args) {
        // Test cases with the first 10 isolated numbers from the given example
        long[] testNumbers = {2, 3, 8, 9, 14, 24, 28, 34, 58, 63};
        for (int i = 0; i < testNumbers.length; i++) {
            long n = testNumbers[i];
            int result = isIsolated(n);
            System.out.println("Is " + n + " isolated? " + (result == 1 ? "Yes" : "No"));
        }
    }

}