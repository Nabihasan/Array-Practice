package leetcode;

class Array1
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 6, 1, 8, 9, 2, 8};
		int first = arr[0];
		int last = arr[arr.length-1];
		
		if(first%2==0 && last%2==0) {
			System.out.println("multication of first & last is : "+(first*last));
		}else {
			System.out.println("both are odd");
		}
		
	}
}	