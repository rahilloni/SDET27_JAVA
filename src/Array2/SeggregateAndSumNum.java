package Array2;

public class SeggregateAndSumNum {
	
	public static void main(String[] args) {
		String s="a1b2c3";
		String alpha="";
		int sum=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z' || s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				//to convert string into num
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println(alpha);
		System.out.println("sum of num= "+sum);
		
	}

}
