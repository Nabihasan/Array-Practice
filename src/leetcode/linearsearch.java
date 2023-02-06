package leetcode;

public class linearsearch {

	public static void main(String[] args) {
	
		int[] arr= {12,43,90,1,10};
		int x=90;
		int temp=0;
		int n=arr.length;
		
		 for(int i=0; i<n; i++) {
			 
			 if(arr[i]==x) {
				 System.out.println("found the element :"+i);
				 temp =temp+1;
			 }
			 
			 
		 }
		 if(temp==0) {
			 System.out.println("value is not found");
		 }
		
	}

}
