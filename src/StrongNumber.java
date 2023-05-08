
public class StrongNumber {
	
	public static void main(String[] args) {
		//Strong number is a special number whose sum of the factorial of digits is equal to the original number.
		int  num=125;
		int ld;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			ld=num%10;
			int i=ld;
			int fact=1;
			while(i>0)
			{
				fact=fact*i;
				i--;
			}
			num=num/10;
			sum=sum+fact;
		}
		if(temp==sum)
		{
			System.out.println("strong");
		}
		else {
			System.out.println("not strong");
		}
	}

}
