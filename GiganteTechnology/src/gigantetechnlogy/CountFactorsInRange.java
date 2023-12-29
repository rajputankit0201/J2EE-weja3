package gigantetechnlogy;

import java.util.Scanner;

public class CountFactorsInRange {
		
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Number\tFactors Count");

        for (int number = 1; number <= n; number++) {
            int factorsCount = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factorsCount++;
                }
            }
            System.out.println(number + "\t" + factorsCount);
        }

    }
}
