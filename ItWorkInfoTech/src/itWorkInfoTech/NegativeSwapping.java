package itWorkInfoTech;

public class NegativeSwapping {

	
			public static void main(String[] args) {
				
				
				int a[]= {20,-1,-2,3,4,-10,5};
				int pos=0;
				int neg=a.length-1;
				int res[]=new int[a.length];
				
				for (int i = 0; i < a.length; i++) {
					if(a[i]>0) {
						res[pos]=a[i];
						pos++;
					

					}
					else {
						res[neg]=a[i];
						neg--;
					
						
					}
								}
				System.arraycopy(a,0, res,0,a.length);
				for (int j = 0; j < res.length; j++) {
					System.out.println(res[j]);
				}

			}
}
