package JavaImpPrograms;

public class ToCheckNoIsPalindrome {
	
	public static void main(String[] args) {
		
		int num=2542;
		int sum=0;
		int ld;
		int temp=num;
		
		while(num>0)
		{
			ld=num%10;
			sum=sum*10+ld;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("no is palindrome");
		}
		else
		{
			System.out.println("no is not palindrome");
		}
		
	}

}
