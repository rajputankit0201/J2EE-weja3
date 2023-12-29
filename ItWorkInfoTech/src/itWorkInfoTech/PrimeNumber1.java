package itWorkInfoTech;

public class PrimeNumber1 {
    public static void main(String[] args) {
    	for (int num = 0; num <= 20; num++) {
    		if (isPrime(num)) {
    			System.out.println(num);
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
