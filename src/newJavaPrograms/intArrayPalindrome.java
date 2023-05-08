package newJavaPrograms;

public class intArrayPalindrome {
	
	public static void main(String[] args) {
		int[]arr= {101,202,401,66,124};
		for(int i=0; i<arr.length; i++)
		{
			int sum=0;
			int ld;
			int num=arr[i];
			int temp=num;
			while(num>0)
			{
				ld=num%10;
				sum=sum*10+ld;
				num=num/10;
			}
			if(sum==temp)
			{
				System.out.println(arr[i]+"is palindrome");
			}
			else
			{
				System.out.println(arr[i]+"is not palindrome");
			}
		}
	}

}
