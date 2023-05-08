
public class FibonacciSeriesForString {
	
	public static void main(String[] args) {
		
		String[]s= {"a","try","india", "aabb"};
		for(int i=0; i<s.length;i++)
		{
			int n=s[i].length();
			int a=0;
			int b=1;
			for(int j=1; j<=n; j++)
			{
				int c=a+b;
				if(c==n)
				{
					System.out.println(s[i]+"=is fibonacci");
					break;
				}
				else
				{
					a=b;
					b=c;
				}
				if(j==n)
				{
					System.out.println(s[i]+"=is not fibonacci");
				}
			}
			
		}
	}

}
