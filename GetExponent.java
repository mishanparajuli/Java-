public class GetExponent {
    
    public static int getExponent(int n, int p) {
        if (p <= 1) {
            return -1; // If p <= 1, return -1 as per the problem statement
        }
        
        int x = 0; // Initialize the exponent counter
        
        // Keep dividing n by p while it is evenly divisible
        while (n % p == 0) {
            n /= p;
            x++; // Increment the exponent counter
        }
        
        return x; // Return the largest exponent
    }

    public static void main(String[] args) {
        // Test cases from the problem statement
        System.out.println(getExponent(27, 3)); // Should return 3
        System.out.println(getExponent(28, 3)); // Should return 0
        System.out.println(getExponent(280, 7)); // Should return 1
        System.out.println(getExponent(-250, 5)); // Should return 3
        System.out.println(getExponent(18, 1)); // Should return -1
        System.out.println(getExponent(128, 4)); // Should return 3
    }
}
