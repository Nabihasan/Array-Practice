package leetcode;

//Print only Prime numbers from given array:
//
//Prime number : which is having 2 factors
//Read every element from array and store into n
//Print n value if it is prime number.
class Prime
{
	public static void main(String[] args) 
	{
		int[] arr = {5, 7, 1, 8, 3, 6, 2};
		
		for(int x=0; x<arr.length; x++) {
			int n=arr[x];
			int count=0;
			for(int i=1; i<=n; i++) {
				
				if(n%i==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println("prime no."+n);
				
			}else {
				System.out.println("not prime no."+n);
			}
		}
		
	}
	
}
	