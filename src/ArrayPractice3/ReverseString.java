package ArrayPractice3;

public class ReverseString {
	
	public static void main(String[] args) {
		String s="Raheel";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		
	}

}
