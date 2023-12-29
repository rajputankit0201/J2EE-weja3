package itWorkInfoTech;

public class Patternprogram1 {
	public static void main(String[] args) {
		
		int num=1;
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if (i>=j) {
					if ((i+j)%2==0) {
					System.out.print(num+ " ");
					num++;
					
				}
				else {
					System.out.print(ch+ " ");
					ch++;
				}
			}
				else {
					System.out.print("  ");}
				}
				
			System.out.println();
		}
		
	}
	
}
