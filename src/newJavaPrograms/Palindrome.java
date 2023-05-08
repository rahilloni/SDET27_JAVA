package newJavaPrograms;

public class Palindrome {
	public static void main(String[] args) {
		
		int num=2524252;
		int ld;
		int sum=0;
		
		
		int temp=num;
		while(num>0)
		{
			ld=num%10;
			sum=sum*10+ld;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
	}

}
