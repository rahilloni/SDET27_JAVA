package newJavaPrograms;

public class printOddNosInAString {
	
	public static void main(String[] args) {
		String s="ra12g3h5";
		for(int i=0;i<s.length();i++)	
		{
			if(s.charAt(i)>'0' && s.charAt(i)<'9')
			{
				int num=s.charAt(i)-48;
				if(num%2==1)
				{
					System.out.println(num);
				}
			}
		}
	}

}
