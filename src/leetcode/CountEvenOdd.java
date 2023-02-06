package leetcode;

class CountEvenOdd
{
	public static void main(String[] args) {
		int arr[ ] = {9, 4, 2, 7, 8, 6, 1, 5, 3};
		
		int even=0, odd=0;
		
		for(int i=0; i<arr.length; i++) {
			
			
			if(arr[i]%2==0) {
					
				++even;
			}else {
				
				++odd;
			}
		}
		System.out.println("even :"+even);
		System.out.println("odd :"+odd);

		
	}
	
}