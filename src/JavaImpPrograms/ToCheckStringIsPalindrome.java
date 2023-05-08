package JavaImpPrograms;

public class ToCheckStringIsPalindrome {
	
	public static void main(String[] args) {
		String str="malayalama";
		String rev="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rev=ch+rev;
		}
		if(str.equals(rev)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
