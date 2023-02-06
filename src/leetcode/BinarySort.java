package leetcode;

public class BinarySort {

	public static void main(String[] args) {
		
		int[] a= {12,43,2,33,3,1,3,55};
		
		int x=12;
		int f=0;
		int l=a.length-1;
		int m=(f+l)/2;
		
		while(f<=l) {
			if(a[m]==x) {
				
				System.out.println("value fund at index : "+m);
				break;
			}
			else if(a[m]<x) {
				f=m+1;
			}
			else {
				l=m-1;
			}
			
			m=(f+l)/2;
		
		if(f>l) {
			System.out.println("value not found");
		}
	}
	}
}
