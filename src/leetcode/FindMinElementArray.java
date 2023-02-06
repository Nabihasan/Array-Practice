package leetcode;

class FindMinElementArray
{
	public static void main(String[] args) {
		int arr[ ] = {9, 4, 2, 7, 8, 6, 1, 5, 3};
		
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				
				min=arr[i];
			}
		}
		System.out.println("min value in array : "+min);
		
	}
	
}