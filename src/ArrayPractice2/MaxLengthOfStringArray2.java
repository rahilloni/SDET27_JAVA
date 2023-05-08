package ArrayPractice2;

public class MaxLengthOfStringArray2 {
	
	public static void main(String[] args) {
		
		String[]arr= {"a","abc","abcd","dcba"};
		String maxlength=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(maxlength.length()<arr[i].length())
			{
				maxlength=arr[i];
			}
		}
//		System.out.println(maxlength);
		
		for(int i=0;i<arr.length;i++)
		{
			if(maxlength.length()==arr[i].length())
			{
				System.out.println(arr[i]);
			}
		}
	}

}
