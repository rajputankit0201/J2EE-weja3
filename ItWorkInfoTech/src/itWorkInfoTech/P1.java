package itWorkInfoTech;

public class P1 {

	public static void main(String[] args) {
		
		Object [] obj = new Object[5];
		
		obj[0]= 123;
		obj[1]= 'e';
		obj[2]= true;
		obj[3]= "Java";
		obj[4]= new P1();
		System.out.println("Hello Word");
		
		for(Object o: obj) {
			System.out.println(o);
		}
 	}
}
