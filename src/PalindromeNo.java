
public class PalindromeNo {
	
	public static void main(String[] args) {
		
		int num=2524252;
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
			System.out.println("it is a palindrome no");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}

}
