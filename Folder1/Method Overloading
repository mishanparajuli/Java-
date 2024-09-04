public class OverloadingExample {

    public int multiply(int a, int b) {
        return a * b;
    }
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();

        System.out.println("Multiply two ints: " + example.multiply(2, 3));           // Output: 6
        System.out.println("Multiply three ints: " + example.multiply(2, 3, 4));      // Output: 24
        System.out.println("Multiply two doubles: " + example.multiply(2.5, 3.5));    // Output: 8.75
    }
}
