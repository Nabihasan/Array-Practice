package leetcode;

import java.util.Arrays;

//Merge two arrays:
//
//Consider 2 arrays with any length
//Create the new array with the sum of lengths of first array and second array
//Read elements from first array and store into new array.
//Read elements from second array and store into new array from the end of first array elements (first.length + i).
//Print elements of newly create array.
class MergeTwoArray 
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50};
		int[] a2 = {30, 40, 50, 60};
		int[] merge=new int[a1.length+a2.length];
		int i;
	Arrays.sort(a1);
	Arrays.sort(a2);
		for( i=0; i<a1.length ; i++) {
			
			merge[i]=a1[i];
		}
		for( i=0; i<a2.length ; i++) {
			
			merge[a1.length+i]=a2[i];
		}
		
		System.out.println("new array print");
	
	for( i=0; i<a1.length+a2.length; i++) {
		System.out.print(merge[i]+"  ");
	}
		
//	}try {
//	Arrays.sort(merge);
//	//System.out.println(merge[i]+" ");
//	}catch(Exception e) {
//		//e.printStackTrace();
//		System.out.println("error");
//	}
} }