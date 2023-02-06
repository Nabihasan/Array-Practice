package leetcode;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] a= {12,54,23,65,78,34,67,90,10};
		
		int x=1;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		
	while(li<=hi) 
		if(a[mi]==x) {
			System.out.println("found the element : "+mi);
			break;
		}
		else if(a[mi]<x) {
			
			li=mi+1;
		}
		else {
			
			hi=mi-1;
		}
		mi=(li+hi)/2;
		
	
	if(li>hi) {
		System.out.println("value is not found");
	}
	}
}
