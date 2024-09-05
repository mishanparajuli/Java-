public class Solve10 {

    public static void main(String[] args) {
        // Call the solve10 method to find the solution
        int[] result = solve10();

        // Print the result
        System.out.println("x: " + result[0]);
        System.out.println("y: " + result[1]);
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! and 1! are 1
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i; // Calculate factorial by multiplying up to n
        }
        return fact;
    }

    // Method to solve for x and y such that x! + y! = 10!
    public static int[] solve10() {
        int tenFactorial = factorial(10); // Calculate 10!

        // Try all combinations of x and y from 0 to 10
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                // Check if the sum of x! and y! equals 10!
                if (factorial(x) + factorial(y) == tenFactorial) {
                    return new int[]{x, y}; // Return the solution as an array
                }
            }
        }

        // If no solution found, return [0, 0] (this won't happen in this case)
        return new int[]{0, 0};
    }
}
