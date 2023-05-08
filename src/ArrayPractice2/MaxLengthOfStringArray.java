package ArrayPractice2;

public class MaxLengthOfStringArray {
	
	public static void main(String[] args) {
		
	String[]arr= {"apple","bun","rahil","priya"};
	String maxELement=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(maxELement.length()<arr[i].length())
		{
			maxELement=arr[i];
		}
	}
//	System.out.println(maxELement);
	for(int i=0;i<arr.length;i++)
	{
		if(maxELement.length()==arr[i].length())
		{
			System.out.println(arr[i]);
		}
	}
	

	}
}
