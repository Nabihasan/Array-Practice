package leetcode;

public class SelectionSrt {

	public static void main(String[] args) {
		
		int[] a= {12,54,0,0,9,8,8,8,23,1,3,65,45};
		
		int min,temp=0;
		for(int i=0; i<a.length; i++) {
			min=i;
			for(int j=i+1; j<a.length; j++) {
				
				if(a[j]<a[min]) {
					
					min=j;
				}
			}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+"  ");
		}

	}

}
