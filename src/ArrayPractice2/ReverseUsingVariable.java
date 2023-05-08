package ArrayPractice2;

public class ReverseUsingVariable {
	
	public static void main(String[] args) {
		
		String s="Raheel";
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.print(reverse);
	}

}
