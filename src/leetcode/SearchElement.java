package leetcode;

//Search for element in Array :
//Repeat loop from 0 to length-1
//Check the index element and given element equal or not inside the for loop.
//If element found then display index as location and break the loop
//Display Error message if the element not present

class SearchElement {
	public static void main(String[] args) {
		int arr[ ] = {5, 3, 8, 2, 9, 1, 7, 6, 4, 9};
		int key = 9;

		boolean found=false;
		for (int i=0 ; i<arr.length ; i++){
			if(key == arr[i]){
				System.out.println("Element found @ loc : " + i);
			found=true;
			}
		}
		if(!found)
			System.out.println("Element not found");
	}
}