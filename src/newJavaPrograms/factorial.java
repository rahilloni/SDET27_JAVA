package newJavaPrograms;

public class factorial {
	
	public static void main(String[] args) {
		
		int i=6;
		int fact = 1;
		
		while(i>0)
		{
			fact=fact*i;
			i--;
		}
		System.out.println(fact);
	}

}
