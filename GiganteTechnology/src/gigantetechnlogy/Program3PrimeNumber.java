package gigantetechnlogy;

import java.util.Scanner;

public class Program3PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new	Scanner(System.in);
		int num=1;
		int count=0;
		int n =scanner.nextInt();
		while (num>=0) {
			int fact=0;
			for(int i=1;i<=num;i++) {
				if (num%i==0) {
					fact++;
				}
			}
			
			if (fact==2) {
				count++;
				if (count==n) {
					System.out.println(num);
					break;
				}
			}
			num++;
		}
		
	}
}
