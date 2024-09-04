public class TwoArrays {
    public static void main(String[] args) {
        // 2D arrays are basically arrays of arrays.
        String[][] cars = {
                {"Mercedez", "Corvett", "Tesla"},
                {"Toyota ", "Rover", "Hundyai"},
                {"Ferarri", "Lambo", "BMW"}
        };
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println(); // Print a new line for separating rows
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
