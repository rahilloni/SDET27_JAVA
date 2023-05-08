package Allprograms;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num=8;
		boolean flag=false;
		
		for(int i=2; i<num/2;i++)
		{
			if(num%2==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("no is not prime");
		}
	}
	

}
