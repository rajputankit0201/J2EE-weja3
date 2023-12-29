package itWorkInfoTech;

import java.util.Arrays;

public class Binary {
				public static void main(String[] args) {
					
										int  ele = 56;
										int a[]= {45,89,76,56,78};
										 Arrays.sort(a);
										 int low=0;
										 int high=a.length-1;
										 int mid=(low+high)/2;
										 
										 while(low<=high)
										 {
											 mid=(low+high)/2;
											 if(ele==a[mid]) {
												 
												 System.out.println(ele+" is found in index." +mid);
												 break;
											 }
											 else if(ele<a[mid]) {
												 low=low;
												 high=mid-1;
											 }
											 else if(ele>a[mid]) {
												 low=mid+1;
												 high=high;
											 }
										 }
					
					
				}
}
