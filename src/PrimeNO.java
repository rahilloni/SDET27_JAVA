
public class PrimeNO {
	//a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).
	public static void main(String[] args) {
		int n=4;
		
		boolean flag=false;
		for(int i=2; i<n/2; i++)
		{
			if(n%2==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("no is prime");
		}
		else {
			System.out.println("no is not prime");
		}
		
	}

}
