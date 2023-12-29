package gigantetechnlogy;

import java.util.Scanner;

public class NthPowerNumber {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the base number: ");
		int base=scanner.nextInt();
		
		System.out.print("Enter the power number: ");
		int powerNumber=scanner.nextInt();
		
		int result=1;
		for(int i=0;i<powerNumber;i++) {
			result=result*base;
		}
		System.out.println(base+"raised to the power "+powerNumber+" is:"+result);
	}
}
