package itWorkInfoTech;

public class Patternprogram {

	public static void main(String[] args) {
		
	
	int num=0;
	for(int r=1;r<=5;r++) {
		num=r;
		for(int c=1; c<=5;c++) {
			if (r>=c) {
				System.out.print(num +" ");
				num++;
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
		
	}

}
}