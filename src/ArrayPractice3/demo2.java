package ArrayPractice3;

public class demo2 {
	
	public static void main(String[] args) {
		
		int i=4444;
		int sum=0;
		while(i>0)
		{
			int ld=i%10;
			sum=sum+ld;
			i=i/10;
		}
		System.out.println(sum);
		
		
	}

}
