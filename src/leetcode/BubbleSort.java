package leetcode;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a= {12,43,32,70,3,5,1,12,90,100,70,88,12,54,12};
		
		for(int i=0; i<a.length; i++) {
			int flag=0;
			int temp;
			for(int j=0; j<a.length-1; j++) {
				
				if(a[j]>a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				
			}
			if(flag==0) {
				break;
			}
		}
		for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
		}
	}

}
