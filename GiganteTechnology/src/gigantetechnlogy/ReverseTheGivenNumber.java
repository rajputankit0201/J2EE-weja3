//QAJP to reverse a given number.
package gigantetechnlogy;

public class ReverseTheGivenNumber {
			public static void main(String[] args) {
				int a=1234567;
				int rev=0;
				
				while (a>0) {
					int rem=a%10;
					rev=rev*10+rem;
					a=a/10;
				}
				System.out.println(rev);
			}
}
