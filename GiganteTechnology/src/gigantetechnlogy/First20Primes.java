package gigantetechnlogy;

import java.util.Scanner;

public class First20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The first 20 prime numbers are:");

        int count = 0;
        int number = 2;
        
        while (count < 20) {
            boolean isPrime = true;
            
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            
            number++;
        }
        
        scanner.close();
    }
}
