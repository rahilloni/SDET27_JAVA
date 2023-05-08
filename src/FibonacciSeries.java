
public class FibonacciSeries {
	
	public static void main(String[] args) {
		//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
		int a=0;
		int b=1;
		int c;
		int count=10;
		
		System.out.print(a+" "+b);
		for(int i=2;i<count;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
