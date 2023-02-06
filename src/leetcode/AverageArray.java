package leetcode;

class AverageArray
{
	public static void main(String[] args) {
		int arr[ ] = {9, 4, 2, 7, 8, 6, 1, 5, 3};
		
		int n=arr.length;
		int sum=0;
		System.out.println("array length is : "+n);
		
		for(int i=0; i<arr.length; i++) {
			
			sum = sum+arr[i];
		}
		
		System.out.println("sum of array : "+sum);
		
		int average=sum/n;
		
		System.out.println("Averageof array : "+average);
	}
	
}