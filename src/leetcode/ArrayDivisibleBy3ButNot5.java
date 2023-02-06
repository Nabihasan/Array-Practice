package leetcode;

//Display elements of array which are divisible by 3 but not with 5
//
//Repeat the loop from 0 to length-1
//Check every element is divisible by 3 i.e, arr[i]%3==0
//Check every element is not with 5 i.e, arr[i]%5!=0
//Print element only if it satisfies both conditions
class ArrayDivisibleBy3ButNot5
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 9, 5, 23, 95, 33, 72, 18};
		System.out.println("Elements divisible by 3 but not with 5 : ");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%3==0 && arr[i]%5!=0) {
				
				System.out.println(arr[i]);
			}
		}
	}
}