package JavaImpPrograms;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		//a number which is sum of two preceeding terms is called as fibonacci
		int n1=0;
		int n2=1;
		int n3;
		int count=10;
		
		System.out.print(n1+" "+n2);
		for(int i=2; i<count; i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
