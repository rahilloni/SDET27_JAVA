
public class PrintOddNosInString {
	
	public static void main(String[] args) {
		String s="a1b2c3d4";
		
		for(int i=0; i<s.length(); i++)
		{
			
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				if(n%2==1)
				{
					System.out.println(n);
				}
				
			}
		}
	
		
	}

}
