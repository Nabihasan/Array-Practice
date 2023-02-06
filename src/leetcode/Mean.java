package leetcode;



class Mean 
{
	public static void main(String[] args) 
	{
		int[] arr = {4, 6, 1, 8, 9, 2, 7, 3};
		int n = arr.length;
		if(n%2==0)
		{
			int mean = (arr[n/2] + arr[n/2-1])/2;
			System.out.println("Mean value : " + mean);
		}
		else
		{
			System.out.println("Mean value : " + arr[n/2]);
		}
	}
}
