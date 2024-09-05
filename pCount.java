
public class pCount{
    public static void main(String[] args) {
        int result = primeCount(10, 30);
        System.out.println(result);
        result = primeCount(11, 29);
        System.out.println(result);
        result = primeCount(20, 22);
        System.out.println(result);
        result = primeCount(1, 1);
        System.out.println(result);
        result = primeCount(5, 5);
        System.out.println(result);
        result = primeCount(6, 2);
        System.out.println(result);
        result = primeCount(-10, 6);
        System.out.println(result);
    }





static int primeCount(int start, int end) {
    int primeCount = 0;
    for (int i = start; i <= end; i++) {
        if (i > 1) { // primes are greater than 1
            boolean isPrime = true;//  assume it is prime

            for (int divider = 2; divider * 2 <= i; divider++) {
                if (i % divider == 0) { // check divisibility
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeCount++;
            }
        }
    }
    return primeCount;
}
}