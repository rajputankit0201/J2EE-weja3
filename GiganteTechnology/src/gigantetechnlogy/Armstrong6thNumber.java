package gigantetechnlogy;

import java.util.Scanner;

public class Armstrong6thNumber {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int position = scanner.nextInt();
			int start=1;
			int count=0;
			
			while (start>0) {
				int copy =start;
				int copy1=start;
				int sum =0;
				int digit=0;
				 
				while (copy1>0) {
					int r=copy1 %10;
					int p=1;
					
					for(int i=1;i<digit;i++) {
						p *=r;
					}
					sum +=p;
					copy1 /=10;
				}
				if (sum==start) {
					count++;
					if (count==position) {
						System.out.println(start);
						break;
					}
				}
				start++;
			}
    }
}
