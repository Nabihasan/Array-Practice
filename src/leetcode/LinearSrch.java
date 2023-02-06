package leetcode;

public class LinearSrch {

	public static void main(String[] args) {
		
		int[] a= {32,44,65,76,8,3,74,6};
		
		int x=32;
		int temp=0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]==x) {
				
				System.out.print("element found: "+i);
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("value is not present");
		}

	}

}
