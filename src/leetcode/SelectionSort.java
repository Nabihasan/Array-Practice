package leetcode;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a= {11,43,54,64,23,43,54,1,87,22};
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
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+"  ");
		}
		
		

	}

}
