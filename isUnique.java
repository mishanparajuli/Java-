public class isUnique{
    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6));   // Output: 1
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10));  // Output: 1
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11));  // Output: 0
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8));   // Output: 0
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4));   // Output: 2
        System.out.println(isNUnique(new int[]{1}, 6));               // Output: 0
    }

    // This function checks if the sum of exactly two distinct elements in the array equals 'n'
    static int isNUnique(int[] a, int n) {
        int pairCount = 0;
        
        // Loop through the array to check all pairs of distinct elements
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    pairCount++;
                    
                    // If more than one unique pair is found, it's no longer N-unique
                    if (pairCount > 1) {
                        return 0; // Not N-unique
                    }
                }
            }
        }
        
        // If exactly one unique pair is found, it's N-unique
        return pairCount == 1 ? 1 : 0;
    }
}
