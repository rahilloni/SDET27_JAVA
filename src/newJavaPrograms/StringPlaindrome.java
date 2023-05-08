package newJavaPrograms;

public class StringPlaindrome {
	
	public static void main(String[] args) {
		String s="malayalama";
		char ch;
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			ch=s.charAt(i);
			rev=ch+rev;
			
			
		}
		if(rev.equals(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
