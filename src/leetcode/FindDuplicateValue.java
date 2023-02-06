package leetcode;

//Program to check the given element is duplicated or not?
//
//Define variable count=0
//Repeat loop from 0 to length-1
//Increase count by 1 if the index element is equals to given element
//If the count>=2 then print element is duplicated.
class FindDuplicateValue
{
	public static void main(String[] args) {
		int arr[ ] = {5, 3, 8, 2, 9, 1, 7, 6, 4, 9};
		int key = 9;

		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				++count;
			}
		}
		if(count==0) {
			System.out.println("element is not present in array ");
		}
		else if(count==1) {
			System.out.println("element is present in array but not duplicate ");

		}else {
			System.out.println("element is  present in array but duplicate ");

		}
	}
}
