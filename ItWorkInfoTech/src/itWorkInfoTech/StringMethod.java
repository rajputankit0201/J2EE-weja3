package itWorkInfoTech;

public class StringMethod {

	public static void main(String[] args) {
		
		String str="123abc25cd1";
		int sum=0;
		
		String[] a=str.split("\\D");
		for(int i=0;i<a.length;i++) {
			
			if ( !a[i].isEmpty()) {
			sum=sum+Integer.parseInt(a[i]);
		}
		}
		System.out.println(sum);
		
		
		
	}
}
