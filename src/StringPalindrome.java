
public class StringPalindrome {
	
	public static void main(String[] args) {
		String s="malayalam";
		String rev="";
	    char ch;
	    
	    for(int i=0; i<s.length();i++)
	    {
	    	ch=s.charAt(i);
	    	rev=ch+rev;
	    }
	    if(s.equals(rev)
	    		
	    		)
	    {
	    	System.out.println("palindrome");
	    }
	    else {
	    	System.out.println("not palindrome");
	    }
	}

}
