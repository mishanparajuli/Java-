public class MethodExamples {

    public static void printMessage() {
        System.out.println("This is a static method.");
    }

    public void displayInstanceMethod() {
        System.out.println("This is an instance method.");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public MethodExamples() {
        System.out.println("Constructor called!");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) {
        printMessage();

        MethodExamples example = new MethodExamples();

        example.displayInstanceMethod();
        example.greet("Mishan");

        int sum = example.addNumbers(5, 10);
        System.out.println("Sum: " + sum);

        int productInt = example.multiply(4, 5);
        System.out.println("Product (int): " + productInt);

        double productDouble = example.multiply(2.5, 3.5);
        System.out.println("Product (double): " + productDouble);

        int fact = example.factorial(5);
        System.out.println("Factorial: " + fact);
    }
}
