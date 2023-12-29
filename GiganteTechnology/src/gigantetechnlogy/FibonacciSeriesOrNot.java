//WAJP to find out sum first 13 fibonacci number or not.
package gigantetechnlogy;

public class FibonacciSeriesOrNot {
	public static void main(String[] args) {
		
	int n=13;
	long a=0;
	long b=1;
	long sum=1;
	
	for(int i =3; i<= n; i++) {
		long next= a+b;
		sum += next;
		a=b;
		b=next;
	}
	
	System.out.println("The sum of first " + n + " Fibonacci number is: " +sum);
	}
}