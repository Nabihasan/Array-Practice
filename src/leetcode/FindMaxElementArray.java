package leetcode;

class FindMaxElementArray
{
	public static void main(String[] args) {
		int arr[ ] = {9, 4, 2, 7, 8, 6, 1, 5, 3};
		
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
			}
		}
		System.out.println("max value in array : "+max);
		
	}
	
}