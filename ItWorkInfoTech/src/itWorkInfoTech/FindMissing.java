package itWorkInfoTech;

public class FindMissing {
	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,6};
		int missing=0;
		for(int i=0;i<a.length-1;i++) {
			if (a[i]+1 != a[i+1]) {
				missing=a[i]+1;
			}
		}
		System.out.println(missing);
	}

}
