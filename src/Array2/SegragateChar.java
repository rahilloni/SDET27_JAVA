package Array2;

public class SegragateChar {
	
	public static void main(String[] args) {
		
	String s="aAdb128@x39";
	String alpha="";
	String num="";
	String spChar="";
	
	for(int i=0; i<s.length(); i++ )
	{
		if(s.charAt(i)>='a'&&s.charAt(i)<='z' || s.charAt(i)>='A'&&s.charAt(i)<='Z')
		{
			alpha=alpha+s.charAt(i);
		}
		else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			num=num+s.charAt(i);
		}
		else
		{
			spChar=spChar+s.charAt(i);
		}
	}
	int number=Integer.parseInt(num);
	System.out.println("Alphabets="+alpha);
	System.out.println("number="+number);
	System.out.println("Special char="+spChar);

	}
}
