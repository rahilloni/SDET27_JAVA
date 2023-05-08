
public class SpirallySorted {
	
	public static boolean spiralSorted(int[]arr, int n)
	{
		int start=0;
		int end=n-1;
		
		while(start<end)
		{
			if(arr[start]>arr[end])
			{
				return false;
			}
			start++;
			
			if(arr[end]>arr[start])
			{
				return false;
			}
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int[]arr= {1,10,14,20,18,12,5};
		int n=arr.length;
		
		if(spiralSorted(arr,n)!=false)
		{
			System.out.println("spirally sorted");
		}
		else
		{
			System.out.println("not spirally sorted");
		}
		
	}

}
