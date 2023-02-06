package leetcode;

//Check 2 arrays are equal or not using Arrays.equals() method:
//
//Arrays class belongs to util package
//equals() method is static in Arrays class.
//equals() method taking 2 arrays as input to check equality.
//If arrays are equal, it returns true value else false
//sort() method is used to arrange the elements in ascending order before checking equal or not.
import java.util.Arrays;
class ArraysEqualOrNot 
{
	public static void main(String[] args) 
	{
		int[] a1 = {5, 4, 7, 1, 8};
		int[] a2 = {5, 1, 7, 4, 8};
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1,a2)) {
			System.out.println("both arrays are equal ");
		}else {
			System.out.println("not equal");
		}
		
		
		
		
	}
}