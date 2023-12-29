package gigantetechnlogy;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		int num=153,copy=num, flag=num;
		int sum=0;
		int digit=0;
		
		while(copy>0) {
			digit++;
			copy/=10;
		}
		
		while(flag>0) {
			int r=flag%10;
			int p=1;
			
			for(int i=1;i<=digit;i++) {
				p=p*r;
			}
			sum=sum+p;
			flag/=10;
		}
		if (sum==num) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
		
	}
}