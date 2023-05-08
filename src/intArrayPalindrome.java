
public class intArrayPalindrome {
	
public static void main(String[] args) {
	
	int[]arr={44,98,67,89,32,12};
	
	for(int i=0; i<arr.length;i++)
	{
		int num=arr[i];
		int ld;
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			ld=num%10;
			sum=ld+sum*10;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println(temp+"is palindrome");
		}
		else {
			System.out.println(temp+"is not palindrome");
		}
			
		}
	}

}


