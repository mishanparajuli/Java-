public class RailRoadTie {
    static int isRailroadTie(int[] a) {
        if (a.length < 2 || a[0] == 0 || a[a.length - 1] == 0) return 0;

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i]== 0) {
                // Ensure that non-zero elements have zero neighbors on both sides
                if (a[i - 1] == 0 || a[i + 1] == 0) {
                    return 0;
                }
            } else {
                // Ensure zero is between two non-zero elements
                if (a[i - 1] > 0 && a[i + 1] > 0) {
                    return 0;
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{1, 2} ));  // Should return 1 (Valid railroad tie)
             // Should return 0 (Invalid railroad tie)
    }
}
